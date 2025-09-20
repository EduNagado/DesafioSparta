package com.DesafioSparta.Eduardo.service;


import com.DesafioSparta.Eduardo.dto.TaxaPorCotistaResponse;
import com.DesafioSparta.Eduardo.model.Cotista;
import com.DesafioSparta.Eduardo.model.NegociacaoDiaria;
import com.DesafioSparta.Eduardo.model.Taxa;
import com.DesafioSparta.Eduardo.repository.NegociacaoDiariaRepository;
import com.DesafioSparta.Eduardo.repository.TaxaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CalculoService {

    private final NegociacaoDiariaRepository negociacaoDiariaRepository;
    private final TaxaRepository taxaRepository;

    public CalculoService(NegociacaoDiariaRepository negociacaoDiariaRepository,
                          TaxaRepository taxaRepository) {
        this.negociacaoDiariaRepository = negociacaoDiariaRepository;
        this.taxaRepository = taxaRepository;
    }

    public List<TaxaPorCotistaResponse> calcularTaxas(Long taxaId) {
        Taxa taxa = taxaRepository.findById(taxaId)
                .orElseThrow(() -> new RuntimeException("Taxa não encontrada"));

        List<NegociacaoDiaria> negociacoes = negociacaoDiariaRepository.findAll();

        Map<Cotista, BigDecimal> taxasPorCotista = new HashMap<>();

        for (NegociacaoDiaria neg : negociacoes) {
            BigDecimal valorDia = neg.getCota().getValorCotaAtual()
                    .multiply(BigDecimal.valueOf(neg.getQuantidade()));

            BigDecimal contribuicao = valorDia
                    .multiply(BigDecimal.valueOf(taxa.getPercentual()))
                    .divide(BigDecimal.valueOf(252), 2, RoundingMode.HALF_UP);

            taxasPorCotista.merge(
                    neg.getCotista(),
                    contribuicao,
                    BigDecimal::add
            );
        }

        return taxasPorCotista.entrySet().stream()
                .map(e -> new TaxaPorCotistaResponse(
                        e.getKey().getNome(),
                        e.getValue()
                ))
                .toList();
    }

}

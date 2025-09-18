package com.DesafioSparta.Eduardo;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DesafioSparta.Eduardo.model.Cota;
import com.DesafioSparta.Eduardo.model.Cotista;
import com.DesafioSparta.Eduardo.model.PosicaoDiaria;
import com.DesafioSparta.Eduardo.model.Taxa;
import com.DesafioSparta.Eduardo.service.CalculoService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

        Cotista cotista1 = new Cotista(1L, "Eduardo");
        Cota cota1 = new Cota(
                2L,
                LocalDate.of(2025, 9, 18),
                new BigDecimal("200.00")
        );
        PosicaoDiaria posicao1 = new PosicaoDiaria(3L, cotista1, cota1, 30);
        Taxa taxa1 = new Taxa(0.01);

        CalculoService calculoService = new CalculoService();
        BigDecimal valorDoDia = calculoService.valorDoDia(posicao1);
        BigDecimal valorTaxa = calculoService.calcularTaxa(posicao1, taxa1);
        BigDecimal valorTaxaDia= calculoService.calcularTaxaDiaria(posicao1, taxa1);

        System.out.println("Valor do dia: R$" + valorDoDia );
        System.out.println("Valor da taxa: R$" + valorTaxa);
        System.out.println("Taxa diária: R$" + valorTaxaDia);
        System.out.println(posicao1);
	}

}

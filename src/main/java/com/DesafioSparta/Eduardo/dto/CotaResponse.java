package com.DesafioSparta.Eduardo.dto;
import java.math.BigDecimal;
import java.time.LocalDate;


public record CotaResponse (
    Long id,
    LocalDate data,
    BigDecimal valorCotaAtual

){

}

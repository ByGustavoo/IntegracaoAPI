package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class EstadoDTO {

    private Integer id;

    @NotNull
    @Size(max = 2)
    private String sigla;

    @NotNull
    @Size(max = 20)
    private String descricao;

    @NotNull
    private Integer codigoGia;

    private Integer codigoDief;
}
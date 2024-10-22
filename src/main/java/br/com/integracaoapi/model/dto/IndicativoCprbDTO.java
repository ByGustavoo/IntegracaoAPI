package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.Size;

public class IndicativoCprbDTO {

    private Integer id;

    @Size(max = 100)
    private String descricao;
}
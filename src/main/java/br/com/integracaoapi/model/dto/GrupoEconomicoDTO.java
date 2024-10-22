package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class GrupoEconomicoDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    private Integer formaTributacao;

    @Size(max = 1)
    private String formaApuracao;

    private String qualificacaoPj;

    private Integer naturezaJuridica;

    private Integer cnae;
}
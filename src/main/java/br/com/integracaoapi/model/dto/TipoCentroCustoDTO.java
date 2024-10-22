package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoCentroCustoDTO(

        Integer id,

        @NotNull
        @Size(max = 40)
        String descricao,

        @NotNull
        SituacaoCadastroDTO situacaoCadastro,

        @NotNull
        GrupoEconomicoDTO grupoEconomico,

        Boolean utilizaPercentual
) {
}
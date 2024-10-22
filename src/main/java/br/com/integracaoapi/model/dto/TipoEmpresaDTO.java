package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoEmpresaDTO(

        Integer id,

        @NotNull
        @Size(max = 35)
        String descricao,

        @NotNull
        Boolean creditaIcms,

        @NotNull
        Boolean creditaPisCofins,

        @NotNull
        Boolean naoUtilizaReducao,

        @NotNull
        Boolean produtorRural,

        @NotNull
        TipoCrtDTO tipoCrt
) {
}
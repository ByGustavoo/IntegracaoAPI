package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record IndicativoSenarDTO(

        Integer id,

        @NotNull
        @Size(max = 30)
        String descricao
) {
}
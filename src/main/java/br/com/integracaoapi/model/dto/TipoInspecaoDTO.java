package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoInspecaoDTO(

        Integer id,

        @NotNull
        @Size(max = 15)
        String descricao
) {
}
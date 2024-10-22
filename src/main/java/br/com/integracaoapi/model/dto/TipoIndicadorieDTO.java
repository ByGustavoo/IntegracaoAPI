package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoIndicadorieDTO(

        Integer id,

        @NotNull
        @Size(max = 100)
        String descricao
) {
}
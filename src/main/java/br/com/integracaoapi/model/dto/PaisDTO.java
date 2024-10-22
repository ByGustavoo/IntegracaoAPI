package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record PaisDTO(

        Integer id,

        @NotNull
        @Size(max = 50)
        String descricao,

        Integer codigoSped
) {
}
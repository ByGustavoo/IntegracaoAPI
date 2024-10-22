package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record MunicipioDTO(

        Integer id,

        @NotNull
        @Size(max = 50)
        String descricao,

        @NotNull
        EstadoDTO estado,

        @NotNull
        Integer dipam,

        @NotNull
        Integer dipj,

        Integer dief
) {
}
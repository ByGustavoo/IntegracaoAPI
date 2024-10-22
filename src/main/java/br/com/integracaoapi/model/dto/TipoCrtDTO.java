package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.Size;

public record TipoCrtDTO(

        Integer id,

        @Size(max = 60)
        String descricao
) {
}
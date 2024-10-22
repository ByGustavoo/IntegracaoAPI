package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.Size;

public record TipoTrocaDTO(

        Integer id,

        @Size(max = 15)
        String descricao
) {
}
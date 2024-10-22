package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.Size;

public record TipoNegociacaoCompraDTO(

        Integer id,

        @Size(max = 20)
        String descricao
) {
}
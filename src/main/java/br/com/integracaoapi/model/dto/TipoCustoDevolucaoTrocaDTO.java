package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.Size;

public record TipoCustoDevolucaoTrocaDTO(

        Integer id,

        @Size(max = 200)
        String descricao
) {
}
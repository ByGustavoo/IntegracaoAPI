package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoFornecedorDTO(

        Integer id,

        @NotNull
        @Size(max = 20)
        String descricao
) {
}
package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoMotivoFornecedorDTO(

        Integer id,

        @NotNull
        @Size(max = 40)
        String descricao
) {
}
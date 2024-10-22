package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoPagamentoDTO(

        Integer id,

        @NotNull
        @Size(max = 30)
        String descricao,

        @NotNull
        Boolean banco,

        @NotNull
        Boolean cheque,

        @NotNull
        Integer quantidadeDias,

        @NotNull
        Boolean boleto,

        @NotNull
        Boolean docted,

        @NotNull
        Boolean debitocc)
{
}
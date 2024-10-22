package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record TipoRecebimentoDTO(

        Integer id,

        @NotNull
        @Size(max = 30)
        String descricao,

        @NotNull
        Boolean banco,

        @NotNull
        Boolean geraAbatimentoContrato,

        @NotNull
        Boolean cheque,

        @NotNull
        Boolean cartao,

        @NotNull
        Boolean dinheiro,

        @NotNull
        Boolean descargaPalete,

        @NotNull
        Boolean boleto
) {
}
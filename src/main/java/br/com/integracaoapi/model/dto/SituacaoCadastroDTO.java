package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.SituacaoCadastro;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record SituacaoCadastroDTO(

        Integer id,

        @NotNull
        @Size(max = 10)
        String descricao
) {

    public SituacaoCadastroDTO(SituacaoCadastro situacaoCadastro) {
        this(
                situacaoCadastro.getId(),
                situacaoCadastro.getDescricao()
        );
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Regiao;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegiaoDTO(

        Integer id,

        @NotNull
        @Size(max = 30)
        String descricao
) {

    public RegiaoDTO(Regiao regiao) {
        this(
                regiao.getId(),
                regiao.getDescricao()
        );
    }
}
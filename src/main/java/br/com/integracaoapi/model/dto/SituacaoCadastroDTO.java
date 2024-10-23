package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.SituacaoCadastro;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SituacaoCadastroDTO {

    private Integer id;

    @NotNull
    @Size(max = 10)
    private String descricao;

    public SituacaoCadastroDTO(SituacaoCadastro situacaoCadastro) {
        this.id = situacaoCadastro.getId();
        this.descricao = situacaoCadastro.getDescricao();
    }
}
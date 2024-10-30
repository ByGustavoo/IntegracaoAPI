package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.SituacaoCadastro;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SituacaoCadastroDTO {

    private Integer id;

    @NotNull
    @Size(max = 10)
    private String descricao;

    public SituacaoCadastroDTO(SituacaoCadastro situacaoCadastro) {
        this.id = situacaoCadastro.getId();
        this.descricao = situacaoCadastro.getDescricao();
    }

    public SituacaoCadastro toEntity() {
        SituacaoCadastro situacaoCadastro = new SituacaoCadastro();
        situacaoCadastro.setId(this.id);
        situacaoCadastro.setDescricao(this.descricao);
        return situacaoCadastro;
    }
}
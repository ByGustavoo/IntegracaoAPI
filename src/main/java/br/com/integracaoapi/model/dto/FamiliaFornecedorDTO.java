package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.FamiliaFornecedor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FamiliaFornecedorDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String descricao;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    public FamiliaFornecedorDTO(FamiliaFornecedor familiaFornecedor) {
        this.id = familiaFornecedor.getId();
        this.descricao = familiaFornecedor.getDescricao();
        this.situacaoCadastro = new SituacaoCadastroDTO(familiaFornecedor.getSituacaoCadastro());
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.FamiliaFornecedor;
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

    public FamiliaFornecedor toEntity() {
        FamiliaFornecedor familiaFornecedor = new FamiliaFornecedor();
        familiaFornecedor.setId(this.id);
        familiaFornecedor.setDescricao(this.descricao);
        familiaFornecedor.setSituacaoCadastro(this.situacaoCadastro.toEntity());
        return familiaFornecedor;
    }
}
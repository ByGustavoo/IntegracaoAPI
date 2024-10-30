package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoFornecedor;
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
public class TipoFornecedorDTO {

    private Integer id;

    @NotNull
    @Size(max = 20)
    private String descricao;

    public TipoFornecedorDTO(TipoFornecedor tipoFornecedor) {
        this.id = tipoFornecedor.getId();
        this.descricao = tipoFornecedor.getDescricao();
    }

    public TipoFornecedor toEntity() {
        TipoFornecedor tipoFornecedor = new TipoFornecedor();
        tipoFornecedor.setId(this.id);
        tipoFornecedor.setDescricao(this.descricao);
        return tipoFornecedor;
    }
}
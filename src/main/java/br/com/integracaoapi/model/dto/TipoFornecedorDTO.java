package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoFornecedor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoFornecedorDTO {

    private Integer id;

    @NotNull
    @Size(max = 20)
    private String descricao;

    public TipoFornecedorDTO(TipoFornecedor tipoFornecedor) {
        this.id = tipoFornecedor.getId();
        this.descricao = tipoFornecedor.getDescricao();
    }
}
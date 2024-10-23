package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoNegociacaoCompra;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoNegociacaoCompraDTO {

    private Integer id;

    @Size(max = 20)
    private String descricao;

    public TipoNegociacaoCompraDTO(TipoNegociacaoCompra tipoNegociacaoCompra) {
        this.id = tipoNegociacaoCompra.getId();
        this.descricao = tipoNegociacaoCompra.getDescricao();
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoNegociacaoCompra;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoNegociacaoCompraDTO {

    private Integer id;

    @Size(max = 20)
    private String descricao;

    public TipoNegociacaoCompraDTO(TipoNegociacaoCompra tipoNegociacaoCompra) {
        this.id = tipoNegociacaoCompra.getId();
        this.descricao = tipoNegociacaoCompra.getDescricao();
    }

    public TipoNegociacaoCompra toEntity() {
        TipoNegociacaoCompra tipoNegociacaoCompra = new TipoNegociacaoCompra();
        tipoNegociacaoCompra.setId(this.id);
        tipoNegociacaoCompra.setDescricao(this.descricao);
        return tipoNegociacaoCompra;
    }
}
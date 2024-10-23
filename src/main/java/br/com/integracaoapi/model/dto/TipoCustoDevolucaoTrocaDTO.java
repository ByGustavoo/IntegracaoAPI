package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoCustoDevolucaoTroca;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCustoDevolucaoTrocaDTO {

    private Integer id;

    @Size(max = 200)
    private String descricao;

    public TipoCustoDevolucaoTrocaDTO(TipoCustoDevolucaoTroca tipoCustoDevolucaoTroca) {
        this.id = tipoCustoDevolucaoTroca.getId();
        this.descricao = tipoCustoDevolucaoTroca.getDescricao();
    }
}
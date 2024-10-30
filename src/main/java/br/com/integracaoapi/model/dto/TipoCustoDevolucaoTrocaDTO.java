package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoCustoDevolucaoTroca;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCustoDevolucaoTrocaDTO {

    private Integer id;

    @Size(max = 200)
    private String descricao;

    public TipoCustoDevolucaoTrocaDTO(TipoCustoDevolucaoTroca tipoCustoDevolucaoTroca) {
        this.id = tipoCustoDevolucaoTroca.getId();
        this.descricao = tipoCustoDevolucaoTroca.getDescricao();
    }

    public TipoCustoDevolucaoTroca toEntity() {
        TipoCustoDevolucaoTroca tipoCustoDevolucaoTroca = new TipoCustoDevolucaoTroca();
        tipoCustoDevolucaoTroca.setId(this.id);
        tipoCustoDevolucaoTroca.setDescricao(this.descricao);
        return tipoCustoDevolucaoTroca;
    }
}
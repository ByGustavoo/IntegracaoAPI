package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoTroca;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoTrocaDTO {

    private Integer id;

    @Size(max = 15)
    private String descricao;

    public TipoTrocaDTO(TipoTroca tipoTroca) {
        this.id = tipoTroca.getId();
        this.descricao = tipoTroca.getDescricao();
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoTroca;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoTrocaDTO {

    private Integer id;

    @Size(max = 15)
    private String descricao;

    public TipoTrocaDTO(TipoTroca tipoTroca) {
        this.id = tipoTroca.getId();
        this.descricao = tipoTroca.getDescricao();
    }

    public TipoTroca toEntity() {
        TipoTroca tipoTroca = new TipoTroca();
        tipoTroca.setId(this.id);
        tipoTroca.setDescricao(this.descricao);
        return tipoTroca;
    }
}
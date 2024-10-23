package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.IndicativoCprb;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndicativoCprbDTO {

    private Integer id;

    @Size(max = 100)
    private String descricao;

    public IndicativoCprbDTO(IndicativoCprb indicativoCprb) {
        this.id = indicativoCprb.getId();
        this.descricao = indicativoCprb.getDescricao();
    }
}
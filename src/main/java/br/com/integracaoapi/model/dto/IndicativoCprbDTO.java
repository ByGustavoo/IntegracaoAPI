package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.IndicativoCprb;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class IndicativoCprbDTO {

    private Integer id;

    @Size(max = 100)
    private String descricao;

    public IndicativoCprbDTO(IndicativoCprb indicativoCprb) {
        this.id = indicativoCprb.getId();
        this.descricao = indicativoCprb.getDescricao();
    }

    public IndicativoCprb toEntity() {
        IndicativoCprb indicativoCprb = new IndicativoCprb();
        indicativoCprb.setId(this.id);
        indicativoCprb.setDescricao(this.descricao);
        return indicativoCprb;
    }
}
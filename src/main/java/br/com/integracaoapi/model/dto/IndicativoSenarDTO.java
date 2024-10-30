package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.IndicativoSenar;
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
public class IndicativoSenarDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    public IndicativoSenarDTO(IndicativoSenar indicativoSenar) {
        this.id = indicativoSenar.getId();
        this.descricao = indicativoSenar.getDescricao();
    }

    public IndicativoSenar toEntity() {
        IndicativoSenar indicativoSenar = new IndicativoSenar();
        indicativoSenar.setId(this.id);
        indicativoSenar.setDescricao(this.descricao);
        return indicativoSenar;
    }
}
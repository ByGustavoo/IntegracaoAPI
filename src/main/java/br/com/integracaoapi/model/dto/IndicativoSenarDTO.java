package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.IndicativoSenar;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IndicativoSenarDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    public IndicativoSenarDTO(IndicativoSenar indicativoSenar) {
        this.id = indicativoSenar.getId();
        this.descricao = indicativoSenar.getDescricao();
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoCrt;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCrtDTO {

    private Integer id;

    @Size(max = 60)
    private String descricao;

    public TipoCrtDTO(TipoCrt tipoCrt) {
        this.id = tipoCrt.getId();
        this.descricao = tipoCrt.getDescricao();
    }
}
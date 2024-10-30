package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoCrt;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoCrtDTO {

    private Integer id;

    @Size(max = 60)
    private String descricao;

    public TipoCrtDTO(TipoCrt tipoCrt) {
        this.id = tipoCrt.getId();
        this.descricao = tipoCrt.getDescricao();
    }

    public TipoCrt toEntity() {
        TipoCrt tipoCrt = new TipoCrt();
        tipoCrt.setId(this.id);
        tipoCrt.setDescricao(this.descricao);
        return tipoCrt;
    }
}
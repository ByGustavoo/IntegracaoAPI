package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Regiao;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegiaoDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    public RegiaoDTO(Regiao regiao) {
        this.id = regiao.getId();
        this.descricao = regiao.getDescricao();
    }
}
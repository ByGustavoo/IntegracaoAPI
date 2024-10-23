package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoIndicadorie;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoIndicadorieDTO {

    private Integer id;

    @NotNull
    @Size(max = 100)
    private String descricao;

    public TipoIndicadorieDTO(TipoIndicadorie tipoIndicadorie) {
        this.id = tipoIndicadorie.getId();
        this.descricao = tipoIndicadorie.getDescricao();
    }
}
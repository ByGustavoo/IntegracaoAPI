package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoIndicadorie;
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
public class TipoIndicadorieDTO {

    private Integer id;

    @NotNull
    @Size(max = 100)
    private String descricao;

    public TipoIndicadorieDTO(TipoIndicadorie tipoIndicadorie) {
        this.id = tipoIndicadorie.getId();
        this.descricao = tipoIndicadorie.getDescricao();
    }

    public TipoIndicadorie toEntity() {
        TipoIndicadorie tipoIndicadorie = new TipoIndicadorie();
        tipoIndicadorie.setId(this.id);
        tipoIndicadorie.setDescricao(this.descricao);
        return tipoIndicadorie;
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoInscricao;
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
public class TipoInscricaoDTO {

    private Integer id;

    @NotNull
    @Size(max = 15)
    private String descricao;

    public TipoInscricaoDTO(TipoInscricao tipoInscricao) {
        this.id = tipoInscricao.getId();
        this.descricao = tipoInscricao.getDescricao();
    }

    public TipoInscricao toEntity() {
        TipoInscricao tipoInscricao = new TipoInscricao();
        tipoInscricao.setId(this.id);
        tipoInscricao.setDescricao(this.descricao);
        return tipoInscricao;
    }
}
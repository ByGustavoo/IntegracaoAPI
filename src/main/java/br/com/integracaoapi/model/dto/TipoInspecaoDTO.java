package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoInspecao;
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
public class TipoInspecaoDTO {

    private Integer id;

    @NotNull
    @Size(max = 15)
    private String descricao;

    public TipoInspecaoDTO(TipoInspecao tipoInspecao) {
        this.id = tipoInspecao.getId();
        this.descricao = tipoInspecao.getDescricao();
    }

    public TipoInspecao toEntity() {
        TipoInspecao tipoInspecao = new TipoInspecao();
        tipoInspecao.setId(this.id);
        tipoInspecao.setDescricao(this.descricao);
        return tipoInspecao;
    }
}
package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Pais;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaisDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    private Integer codigoSped;

    public PaisDTO(Pais pais) {
        this.id = pais.getId();
        this.descricao = pais.getDescricao();
        this.codigoSped = pais.getCodigoSped();
    }
}
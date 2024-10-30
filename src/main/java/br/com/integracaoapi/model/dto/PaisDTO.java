package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Pais;
import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaisDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    private Integer codigoSped;

    public PaisDTO(Pais pais) {
        this.id = pais.getId();
        this.descricao = pais.getDescricao();
    }

    public Pais toEntity() {
        Pais pais = new Pais();
        pais.setId(this.id);
        pais.setDescricao(this.descricao);
        return pais;
    }
}
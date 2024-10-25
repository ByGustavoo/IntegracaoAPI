package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Municipio;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MunicipioDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    @NotNull
    private EstadoDTO estado;

    @NotNull
    private Integer dipam;

    @NotNull
    private Integer dipj;

    private Integer dief;

    public MunicipioDTO(Municipio municipio) {
        this.id = municipio.getId();
        this.descricao = municipio.getDescricao();
    }
}
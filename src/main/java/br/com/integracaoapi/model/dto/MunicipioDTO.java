package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Municipio;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
        this.estado = new EstadoDTO(municipio.getEstado());
        this.dipam = municipio.getDipam();
        this.dipj = municipio.getDipj();
        this.dief = municipio.getDief();
    }
}
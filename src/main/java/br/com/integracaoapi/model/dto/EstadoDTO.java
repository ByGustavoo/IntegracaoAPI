package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Estado;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EstadoDTO {

    private Integer id;

    @NotNull
    @Size(max = 2)
    private String sigla;

    @NotNull
    @Size(max = 20)
    private String descricao;

    @NotNull
    private Integer codigoGia;

    private Integer codigoDief;

    public EstadoDTO(Estado estado) {
        this.id = estado.getId();
        this.sigla = estado.getSigla();
        this.descricao = estado.getDescricao();
        this.codigoGia = estado.getCodigoGia();
        this.codigoDief = estado.getCodigoDief();
    }
}
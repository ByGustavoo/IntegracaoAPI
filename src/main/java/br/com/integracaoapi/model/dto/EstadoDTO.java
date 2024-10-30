package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Estado;
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
        this.descricao = estado.getDescricao();
    }

    public Estado toEntity() {
        Estado estado = new Estado();
        estado.setId(this.id);
        estado.setDescricao(this.descricao);
        return estado;
    }
}
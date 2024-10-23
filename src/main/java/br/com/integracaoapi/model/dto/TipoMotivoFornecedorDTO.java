package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoMotivoFornecedor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoMotivoFornecedorDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String descricao;

    public TipoMotivoFornecedorDTO(TipoMotivoFornecedor tipoMotivoFornecedor) {
        this.id = tipoMotivoFornecedor.getId();
        this.descricao = tipoMotivoFornecedor.getDescricao();
    }
}
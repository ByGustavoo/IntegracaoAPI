package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoMotivoFornecedor;
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
public class TipoMotivoFornecedorDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String descricao;

    public TipoMotivoFornecedorDTO(TipoMotivoFornecedor tipoMotivoFornecedor) {
        this.id = tipoMotivoFornecedor.getId();
        this.descricao = tipoMotivoFornecedor.getDescricao();
    }

    public TipoMotivoFornecedor toEntity() {
        TipoMotivoFornecedor tipoMotivoFornecedor = new TipoMotivoFornecedor();
        tipoMotivoFornecedor.setId(this.id);
        tipoMotivoFornecedor.setDescricao(this.descricao);
        return tipoMotivoFornecedor;
    }
}
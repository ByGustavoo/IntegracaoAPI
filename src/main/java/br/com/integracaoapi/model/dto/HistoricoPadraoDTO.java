package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.HistoricoPadrao;
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
public class HistoricoPadraoDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    public HistoricoPadraoDTO(HistoricoPadrao historicoPadrao) {
        this.id = historicoPadrao.getId();
        this.descricao = historicoPadrao.getDescricao();
    }

    public HistoricoPadrao toEntity() {
        HistoricoPadrao historicoPadrao = new HistoricoPadrao();
        historicoPadrao.setId(this.id);
        historicoPadrao.setDescricao(this.descricao);
        return historicoPadrao;
    }
}
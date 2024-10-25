package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.HistoricoPadrao;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
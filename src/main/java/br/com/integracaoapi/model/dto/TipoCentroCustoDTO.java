package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoCentroCusto;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoCentroCustoDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String descricao;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    @NotNull
    private GrupoEconomicoDTO grupoEconomico;

    private Boolean utilizaPercentual;

    public TipoCentroCustoDTO(TipoCentroCusto tipoCentroCusto) {
        this.id = tipoCentroCusto.getId();
        this.descricao = tipoCentroCusto.getDescricao();
        this.situacaoCadastro = new SituacaoCadastroDTO(tipoCentroCusto.getSituacaoCadastro());
        this.grupoEconomico = new GrupoEconomicoDTO(tipoCentroCusto.getGrupoEconomico());
        this.utilizaPercentual = tipoCentroCusto.getUtilizaPercentual();
    }

    public TipoCentroCusto toEntity() {
        TipoCentroCusto tipoCentroCusto = new TipoCentroCusto();
        tipoCentroCusto.setId(this.id);
        tipoCentroCusto.setDescricao(this.descricao);
        tipoCentroCusto.setSituacaoCadastro(this.situacaoCadastro.toEntity());
        tipoCentroCusto.setGrupoEconomico(this.grupoEconomico.toEntity());
        tipoCentroCusto.setUtilizaPercentual(this.utilizaPercentual);
        return tipoCentroCusto;
    }
}
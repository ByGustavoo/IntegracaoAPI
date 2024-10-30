package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.ContaContabilFinanceiro;
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
public class ContaContabilFinanceiroDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    private ContaContabilFiscalDTO contaContabilFiscal;

    @NotNull
    private Boolean transferencia;

    private HistoricoPadraoDTO historicoPadrao;

    @NotNull
    private Boolean contabiliza;

    private TipoCentroCustoDTO tipoCentroCusto;

    public ContaContabilFinanceiroDTO(ContaContabilFinanceiro contaContabilFinanceiro) {
        this.id = contaContabilFinanceiro.getId();
        this.descricao = contaContabilFinanceiro.getDescricao();
        this.contaContabilFiscal = contaContabilFinanceiro.getContaContabilFiscal() != null ? new ContaContabilFiscalDTO(contaContabilFinanceiro.getContaContabilFiscal()) : null;
        this.transferencia = contaContabilFinanceiro.getTransferencia();
        this.historicoPadrao = contaContabilFinanceiro.getHistoricoPadrao() != null ? new HistoricoPadraoDTO(contaContabilFinanceiro.getHistoricoPadrao()) : null;
        this.contabiliza = contaContabilFinanceiro.getContabiliza();
        this.tipoCentroCusto = contaContabilFinanceiro.getTipoCentroCusto() != null ? new TipoCentroCustoDTO(contaContabilFinanceiro.getTipoCentroCusto()) : null;
    }

    public ContaContabilFinanceiro toEntity() {
        ContaContabilFinanceiro contaContabilFinanceiro = new ContaContabilFinanceiro();
        contaContabilFinanceiro.setId(this.id);
        contaContabilFinanceiro.setDescricao(this.descricao);
        contaContabilFinanceiro.setContaContabilFiscal(this.contaContabilFiscal != null ? this.contaContabilFiscal.toEntity() : null);
        contaContabilFinanceiro.setTransferencia(this.transferencia);
        contaContabilFinanceiro.setHistoricoPadrao(this.historicoPadrao != null ? this.historicoPadrao.toEntity() : null);
        contaContabilFinanceiro.setContabiliza(this.contabiliza);
        contaContabilFinanceiro.setTipoCentroCusto(this.tipoCentroCusto != null ? this.tipoCentroCusto.toEntity() : null);
        return contaContabilFinanceiro;
    }
}
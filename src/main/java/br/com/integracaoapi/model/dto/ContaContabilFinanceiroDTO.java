package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.ContaContabilFinanceiro;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaContabilFinanceiroDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    private SituacaoCadastroDTO situacaoCadastro;

    private ContaContabilFiscalDTO contaContabilFiscal;

    private Boolean transferencia;

    private HistoricoPadraoDTO historicoPadrao;

    private Boolean contabiliza;

    private TipoCentroCustoDTO tipoCentroCusto;

    public ContaContabilFinanceiroDTO(ContaContabilFinanceiro contaContabilFinanceiro) {
        this.id = contaContabilFinanceiro.getId();
        this.descricao = contaContabilFinanceiro.getDescricao();
        this.situacaoCadastro = new SituacaoCadastroDTO(contaContabilFinanceiro.getSituacaoCadastro());
        this.contaContabilFiscal = new ContaContabilFiscalDTO(contaContabilFinanceiro.getContaContabilFiscal());
        this.transferencia = contaContabilFinanceiro.getTransferencia();
        this.historicoPadrao = new HistoricoPadraoDTO(contaContabilFinanceiro.getHistoricoPadrao());
        this.contabiliza = contaContabilFinanceiro.getContabiliza();
        this.tipoCentroCusto = new TipoCentroCustoDTO(contaContabilFinanceiro.getTipoCentroCusto());
    }
}
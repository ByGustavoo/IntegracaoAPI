package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ContaContabilFinanceiroDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String descricao;

    SituacaoCadastroDTO situacaoCadastro;

    private ContaContabilFiscalDTO contaContabilFiscal;

    private Boolean transferencia;

    private HistoricoPadraoDTO historicoPadrao;

    private Boolean contabiliza;

    private TipoCentroCustoDTO tipoCentroCusto;
}
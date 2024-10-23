package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoPagamento;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoPagamentoDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    @NotNull
    private Boolean banco;

    @NotNull
    private Boolean cheque;

    @NotNull
    private Integer quantidadeDias;

    @NotNull
    private Boolean boleto;

    @NotNull
    private Boolean docted;

    @NotNull
    private Boolean debitocc;

    public TipoPagamentoDTO(TipoPagamento tipoPagamento) {
        this.id = tipoPagamento.getId();
        this.descricao = tipoPagamento.getDescricao();
        this.banco = tipoPagamento.getBanco();
        this.cheque = tipoPagamento.getCheque();
        this.quantidadeDias = tipoPagamento.getQuantidadeDias();
        this.boleto = tipoPagamento.getBoleto();
        this.docted = tipoPagamento.getDocted();
        this.debitocc = tipoPagamento.getDebitocc();
    }
}
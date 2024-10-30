package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoPagamento;
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
    }

    public TipoPagamento toEntity() {
        TipoPagamento tipoPagamento = new TipoPagamento();
        tipoPagamento.setId(this.id);
        tipoPagamento.setDescricao(this.descricao);
        tipoPagamento.setBanco(this.banco);
        tipoPagamento.setCheque(this.cheque);
        tipoPagamento.setQuantidadeDias(this.quantidadeDias);
        tipoPagamento.setBoleto(this.boleto);
        tipoPagamento.setDocted(this.docted);
        tipoPagamento.setDebitocc(this.debitocc);
        return tipoPagamento;
    }
}
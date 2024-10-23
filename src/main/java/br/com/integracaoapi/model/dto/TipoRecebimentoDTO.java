package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoRecebimento;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoRecebimentoDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    @NotNull
    private Boolean banco;

    @NotNull
    private Boolean geraAbatimentoContrato;

    @NotNull
    private Boolean cheque;

    @NotNull
    private Boolean cartao;

    @NotNull
    private Boolean dinheiro;

    @NotNull
    private Boolean descargaPalete;

    @NotNull
    private Boolean boleto;

    public TipoRecebimentoDTO(TipoRecebimento tipoRecebimento) {
        this.id = tipoRecebimento.getId();
        this.descricao = tipoRecebimento.getDescricao();
        this.banco = tipoRecebimento.getBanco();
        this.geraAbatimentoContrato = tipoRecebimento.getGeraAbatimentoContrato();
        this.cheque = tipoRecebimento.getCheque();
        this.cartao = tipoRecebimento.getCartao();
        this.dinheiro = tipoRecebimento.getDinheiro();
        this.descargaPalete = tipoRecebimento.getDescargaPalete();
        this.boleto = tipoRecebimento.getBoleto();
    }
}
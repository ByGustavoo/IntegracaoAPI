package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoRecebimento;
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
    }

    public TipoRecebimento toEntity() {
        TipoRecebimento tipoRecebimento = new TipoRecebimento();
        tipoRecebimento.setId(this.id);
        tipoRecebimento.setDescricao(this.descricao);
        tipoRecebimento.setBanco(this.banco);
        tipoRecebimento.setGeraAbatimentoContrato(this.geraAbatimentoContrato);
        tipoRecebimento.setCheque(this.cheque);
        tipoRecebimento.setCartao(this.cartao);
        tipoRecebimento.setDinheiro(this.dinheiro);
        tipoRecebimento.setDescargaPalete(this.descargaPalete);
        tipoRecebimento.setBoleto(this.boleto);
        return tipoRecebimento;
    }
}
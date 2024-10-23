package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.ContaContabilFiscal;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
public class ContaContabilFiscalDTO {

    private Integer id;

    @NotNull
    @Size(max = 60)
    private String descricao;

    @NotNull
    private Integer conta1;

    @NotNull
    private Integer conta2;

    @NotNull
    private Integer conta3;

    @NotNull
    private Integer conta4;

    @NotNull
    private Integer conta5;

    @NotNull
    private Integer nivel;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    @NotNull
    @Size(max = 50)
    private String contaReduzida;

    @NotNull
    private Boolean resultado;

    @NotNull
    private Date data;

    private Boolean dmpl;

    private Boolean contaCompensacao;

    @Size(max = 12)
    private String notaExplicativa;

    public ContaContabilFiscalDTO(ContaContabilFiscal contaContabilFiscal) {
        this.id = contaContabilFiscal.getId();
        this.descricao = contaContabilFiscal.getDescricao();
        this.conta1 = contaContabilFiscal.getConta1();
        this.conta2 = contaContabilFiscal.getConta2();
        this.conta3 = contaContabilFiscal.getConta3();
        this.conta4 = contaContabilFiscal.getConta4();
        this.conta5 = contaContabilFiscal.getConta5();
        this.nivel = contaContabilFiscal.getNivel();
        this.situacaoCadastro = new SituacaoCadastroDTO(contaContabilFiscal.getSituacaoCadastro());
        this.contaReduzida = contaContabilFiscal.getContaReduzida();
        this.resultado = contaContabilFiscal.getResultado();
        this.data = contaContabilFiscal.getData();
        this.dmpl = contaContabilFiscal.getDmpl();
        this.contaCompensacao = contaContabilFiscal.getContaCompensacao();
        this.notaExplicativa = contaContabilFiscal.getNotaExplicativa();
    }
}
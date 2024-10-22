package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.sql.Date;

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
    private Date date;

    private Boolean dmpl;

    private Boolean contaCompensacao;

    @Size(max = 12)
    private String notaExplicativa;
}
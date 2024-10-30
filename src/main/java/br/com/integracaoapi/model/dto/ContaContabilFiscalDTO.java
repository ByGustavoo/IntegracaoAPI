package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.ContaContabilFiscal;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    }

    public ContaContabilFiscal toEntity() {
        ContaContabilFiscal contaContabilFiscal = new ContaContabilFiscal();
        contaContabilFiscal.setId(this.id);
        contaContabilFiscal.setDescricao(this.descricao);
        return contaContabilFiscal;
    }
}
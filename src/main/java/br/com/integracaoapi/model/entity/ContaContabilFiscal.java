package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "contacontabilfiscal", schema = "public")
public class ContaContabilFiscal {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 60)
    @Column(name = "descricao", length = 60, nullable = false)
    private String descricao;

    @NotNull
    @Column(name = "conta1", nullable = false)
    private Integer conta1;

    @NotNull
    @Column(name = "conta2", nullable = false)
    private Integer conta2;

    @NotNull
    @Column(name = "conta3", nullable = false)
    private Integer conta3;

    @NotNull
    @Column(name = "conta4", nullable = false)
    private Integer conta4;

    @NotNull
    @Column(name = "conta5", nullable = false)
    private Integer conta5;

    @NotNull
    @Column(name = "nivel", nullable = false)
    private Integer nivel;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_situacaocadastro", nullable = false)
    private SituacaoCadastro situacaoCadastro;

    @NotNull
    @Size(max = 50)
    @Column(name = "contareduzida", length = 50, nullable = false)
    private String contaReduzida;

    @NotNull
    @Column(name = "resultado", nullable = false)
    private Boolean resultado = false;

    @NotNull
    @Column(name = "data", nullable = false)
    private Date data;

    @Column(name = "dmpl")
    private Boolean dmpl = false;

    @Column(name = "contacompensacao")
    private Boolean contaCompensacao;

    @Size(max = 12)
    @Column(name = "notaexplicativa", length = 12)
    private String notaExplicativa;
}
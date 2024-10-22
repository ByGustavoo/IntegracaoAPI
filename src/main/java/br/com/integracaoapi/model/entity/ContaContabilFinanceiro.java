package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contacontabilfinanceiro", schema = "public")
public class ContaContabilFinanceiro {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 50)
    @Column(name = "descricao", length = 50, nullable = false)
    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_situacaocadastro", nullable = false)
    private SituacaoCadastro situacaoCadastro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contacontabilfiscal")
    private ContaContabilFiscal contaContabilFiscal;

    @NotNull
    @Column(name = "transferencia", nullable = false)
    private Boolean transferencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_historicopadrao")
    private HistoricoPadrao historicoPadrao;

    @NotNull
    @Column(name = "contabiliza", nullable = false)
    private Boolean contabiliza = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipocentrocusto")
    private TipoCentroCusto tipoCentroCusto;
}
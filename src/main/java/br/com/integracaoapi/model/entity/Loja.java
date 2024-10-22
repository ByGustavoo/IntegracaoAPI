package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "loja", schema = "public")
public class Loja {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 25)
    @Column(name = "descricao", length = 25, nullable = false)
    private String descricao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_fornecedor", nullable = false)
    private Fornecedor fornecedor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_situacaocadastro", nullable = false)
    private SituacaoCadastro situacaoCadastro;

    @NotNull
    @Size(max = 30)
    @Column(name = "nomeservidor", length = 30, nullable = false)
    private String nomeServidor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_regiao", nullable = false)
    private Regiao regiao;

    @NotNull
    @Column(name = "servidorcentral", nullable = false)
    private Boolean servidorCentral;

    @NotNull
    @Column(name = "geraconcentrador", nullable = false)
    private Boolean geraConcentrador;

    @Column(name = "estoqueterceiro")
    private Boolean estoqueTerceiro;

    @Column(name = "lojavirtual")
    private Boolean lojaVirtual;

    @NotNull
    @Column(name = "atacado", nullable = false)
    private Boolean atacado;
}
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
    @JoinColumn(name = "id_fornecedor")
    private Fornecedor fornecedor;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_situacaocadastro")
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
    private boolean servidorCentral;

    @NotNull
    @Column(name = "geraconcentrador", nullable = false)
    private boolean geraConcentrador;

    @Column(name = "estoqueterceiro")
    private boolean estoqueTerceiro;

    @Column(name = "lojavirtual")
    private boolean lojaVirtual;

    @NotNull
    @Column(name = "atacado", nullable = false)
    private boolean atacado;
}
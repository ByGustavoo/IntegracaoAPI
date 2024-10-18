package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "fornecedor", schema = "public")
public class Fornecedor {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 40)
    @Column(name = "razaosocial", length = 40, nullable = false)
    private String razaoSocial;

    @NotNull
    @Size(max = 30)
    @Column(name = "nomefantasia", length = 30, nullable = false)
    private String nomeFantasia;

    @NotNull
    @Size(max = 40)
    @Column(name = "endereco", length = 40, nullable = false)
    private String endereco;

    @NotNull
    @Size(max = 30)
    @Column(name = "bairro", length = 30, nullable = false)
    private String bairro;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_municipio", nullable = false)
    private Municipio municipio;

    @NotNull
    @Column(name = "cep", precision = 8)
    private BigDecimal cep;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estado", nullable = false)
    private Estado estado;

    @NotNull
    @Size(max = 14)
    @Column(name = "telefone", length = 14, nullable = false)
    private String telefone;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipoinscricao", nullable = false)
    private TipoInscricao tipoInscricao;

    @NotNull
    @Size(max = 20)
    @Column(name = "inscricaoestadual", length = 20, nullable = false)
    private String inscricaoEstadual;

    @NotNull
    @Column(name = "cnpj", precision = 14, nullable = false)
    private BigDecimal cnpj;

    @NotNull
    @Column(name = "revenda", nullable = false)
    private Boolean revenda;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_situacaocadastro", nullable = false)
    private SituacaoCadastro situacaoCadastro;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipopagamento", nullable = false)
    private TipoPagamento tipoPagamento;

    @NotNull
    @Column(name = "numerodoc", nullable = false)
    private Integer numerodoc;

    @NotNull
    @Column(name = "pedidominimoqtd", nullable = false)
    private Integer pedidoMinimoQtd;

    @NotNull
    @Column(name = "pedidominimovalor", precision = 11, scale = 2, nullable = false)
    private BigDecimal pedidoMinimoValor;

    @NotNull
    @Size(max = 4)
    @Column(name = "serienf", length = 4, nullable = false)
    private String serienf;

    @NotNull
    @Column(name = "descontofunrural", nullable = false)
    private Boolean descontoFunRural;

    @NotNull
    @Column(name = "senha", nullable = false)
    private Integer senha;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tiporecebimento")
    private TipoRecebimento tipoRecebimento;

    @NotNull
    @Size(max = 6)
    @Column(name = "agencia", length = 6, nullable = false)
    private String agencia;

    @NotNull
    @Size(max = 2)
    @Column(name = "digitoAgencia", length = 2, nullable = false)
    private String digitoAgencia;

    @NotNull
    @Size(max = 12)
    @Column(name = "conta", length = 12, nullable = false)
    private String conta;

    @NotNull
    @Size(max = 2)
    @Column(name = "digitoconta", length = 2, nullable = false)
    private String digitoConta;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_banco")
    private Banco banco;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_fornecedorfavorecido")
    private Fornecedor fornecedorFavorecido;

    @NotNull
    @Size(max = 40)
    @Column(name = "enderecocobranca", length = 40, nullable = false)
    private String enderecoCobranca;

    @NotNull
    @Size(max = 30)
    @Column(name = "bairrocobranca", length = 30, nullable = false)
    private String bairroCobranca;

    @NotNull
    @Column(name = "cepcobranca", precision = 18, nullable = false)
    private BigDecimal cepCobranca;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_municipiocobranca")
    private Municipio municipioCobranca;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_estadocobranca")
    private Estado estadoCobranca;

    @NotNull
    @Column(name = "bloqueado", nullable = false)
    private Boolean bloqueado;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipomotivofornecedor")
    private TipoMotivoFornecedor tipoMotivoFornecedor;

    //@NotNull o optional tem que ser 'true'
}
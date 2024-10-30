package br.com.integracaoapi.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "fornecedor", schema = "public")
public class Fornecedor {

    @Id
    @NotNull
    @Column(name = "id", nullable = false)
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
    @Column(name = "cep", precision = 8, nullable = false)
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
    private Boolean revenda = false;

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
    private Integer numeroDoc;

    @NotNull
    @Column(name = "pedidominimoqtd", nullable = false)
    private Integer pedidoMinimoQtd;

    @NotNull
    @Column(name = "pedidominimovalor", precision = 11, scale = 2, nullable = false)
    private BigDecimal pedidoMinimoValor;

    @NotNull
    @Size(max = 4)
    @Column(name = "serienf", length = 4,  nullable = false)
    private String serienf;

    @NotNull
    @Column(name = "descontofunrural", nullable = false)
    private Boolean descontoFunRural = false;

    @NotNull
    @Column(name = "senha", nullable = false)
    private Integer senha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tiporecebimento")
    private TipoRecebimento tipoRecebimento;

    @NotNull
    @Size(max = 6)
    @Column(name = "agencia", length = 6, nullable = false)
    private String agencia;

    @NotNull
    @Size(max = 2)
    @Column(name = "digitoagencia", length = 2,  nullable = false)
    private String digitoAgencia;

    @NotNull
    @Size(max = 12)
    @Column(name = "conta", length = 12, nullable = false)
    private String conta;

    @NotNull
    @Size(max = 2)
    @Column(name = "digitoconta", nullable = false, length = 2)
    private String digitoConta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_banco")
    private Banco banco;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_fornecedorfavorecido")
    private Fornecedor fornecedorFavorecido;

    @Size(max = 40)
    @NotNull
    @Column(name = "enderecocobranca", nullable = false, length = 40)
    private String enderecoCobranca;

    @Size(max = 30)
    @NotNull
    @Column(name = "bairrocobranca", nullable = false, length = 30)
    private String bairroCobranca;

    @NotNull
    @Column(name = "cepcobranca", nullable = false, precision = 18)
    private BigDecimal cepCobranca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_municipiocobranca")
    private Municipio municipioCobranca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_estadocobranca")
    private Estado estadoCobranca;

    @NotNull
    @Column(name = "bloqueado", nullable = false)
    private Boolean bloqueado = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipomotivofornecedor")
    private TipoMotivoFornecedor tipoMotivoFornecedor;

    @Column(name = "datasintegra")
    private Instant datasIntegra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipoempresa", nullable = false)
    private TipoEmpresa tipoEmpresa;

    @Size(max = 9)
    @NotNull
    @Column(name = "inscricaosuframa", nullable = false, length = 9)
    private String inscricaoSuframa;

    @NotNull
    @Column(name = "utilizaiva", nullable = false)
    private Boolean utilizaIva = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_familiafornecedor")
    private FamiliaFornecedor familiaFornecedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipoinspecao")
    private TipoInspecao tipoInspecao;

    @NotNull
    @Column(name = "numeroinspecao", nullable = false)
    private Integer numeroInspecao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipotroca")
    private TipoTroca tipoTroca;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipofornecedor", nullable = false)
    private TipoFornecedor tipoFornecedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contacontabilfinanceiro")
    private ContaContabilFinanceiro contaContabilFinanceiro;

    @NotNull
    @Column(name = "utilizanfe", nullable = false)
    private Boolean utilizaNfe = false;

    @NotNull
    @Column(name = "datacadastro", nullable = false)
    private LocalDate dataCadastro;

    @NotNull
    @Column(name = "utilizaconferencia", nullable = false)
    private Boolean utilizaConferencia = false;

    @Size(max = 6)
    @NotNull
    @Column(name = "numero", nullable = false, length = 6)
    private String numero;

    @NotNull
    @Column(name = "permitenfsempedido", nullable = false)
    private Boolean permiteNfSemPedido = false;

    @Size(max = 2)
    @NotNull
    @Column(name = "modelonf", nullable = false, length = 2)
    private String modeloNf;

    @NotNull
    @Column(name = "emitenf", nullable = false)
    private Boolean emiteNf = false;

    @NotNull
    @Column(name = "tiponegociacao", nullable = false)
    private Integer tipoNegociacao;

    @NotNull
    @Column(name = "utilizacrossdocking", nullable = false)
    private Boolean utilizaCrossDocking = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_lojacrossdocking")
    private Loja lojaCrossDocking;

    @Size(max = 2500)
    @NotNull
    @Column(name = "observacao", length = 2500, nullable = false)
    private String observacao;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_pais", nullable = false)
    private Pais pais;

    @Size(max = 20)
    @Column(name = "inscricaomunicipal", length = 20)
    private String inscricaoMunicipal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contacontabilfiscalpassivo")
    private ContaContabilFiscal contaContabilFiscalPassivo;

    @Size(max = 6)
    @NotNull
    @Column(name = "numerocobranca", length = 6, nullable = false)
    private String numeroCobranca;

    @Size(max = 30)
    @NotNull
    @Column(name = "complemento", length = 30, nullable = false)
    private String complemento;

    @Size(max = 30)
    @NotNull
    @Column(name = "complementocobranca", length = 30, nullable = false)
    private String complementoCobranca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_contacontabilfiscalativo")
    private ContaContabilFiscal contaContabilFiscalAtivo;

    @NotNull
    @Column(name = "utilizaedi", nullable = false)
    private Boolean utilizaEdi = false;

    @NotNull
    @Column(name = "tiporegravencimento", nullable = false)
    private Integer tipoRegraVencimento;

    @Column(name = "nfemitidapostofiscal")
    private Boolean nfEmitidaPostoFiscal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipoindicadorie")
    private TipoIndicadorie tipoIndicadorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_indicativocprb")
    private IndicativoCprb indicativoCprb;

    @Column(name = "utilizaprodepe")
    private Boolean utilizaProdepe;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tiponegociacaocompra", nullable = false)
    private TipoNegociacaoCompra tipoNegociacaoCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_tipocustodevolucaotroca")
    private TipoCustoDevolucaoTroca tipoCustoDevolucaoTroca;

    @Column(name = "alteradopaf")
    private Boolean alteradoPaf;

    @Column(name = "cpfprodutorrural", precision = 11)
    private BigDecimal cpfProdutorRural;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_indicativosenar")
    private IndicativoSenar indicativoSenar;

    @NotNull
    @Column(name = "antecipacaopagamento", nullable = false)
    private Boolean antecipacaoPagamento = false;

    @Column(name = "percentualcreditoicmssn", precision = 11, scale = 2)
    private BigDecimal percentualCreditoIcmssn;
}
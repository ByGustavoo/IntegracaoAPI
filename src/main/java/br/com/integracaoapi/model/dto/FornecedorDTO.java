package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Fornecedor;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
public class FornecedorDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String razaoSocial;

    @NotNull
    @Size(max = 30)
    private String nomeFantasia;

    @NotNull
    @Size(max = 40)
    private String endereco;

    @NotNull
    @Size(max = 30)
    private String bairro;

    @NotNull
    private MunicipioDTO municipio;

    @NotNull
    private BigDecimal cep;

    @NotNull
    private EstadoDTO estado;

    @NotNull
    @Size(max = 14)
    private String telefone;

    @NotNull
    private TipoInscricaoDTO tipoInscricao;

    @NotNull
    @Size(max = 20)
    private String inscricaoEstadual;

    @NotNull
    private BigDecimal cnpj;

    @NotNull
    private Boolean revenda;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    @NotNull
    private TipoPagamentoDTO tipoPagamento;

    @NotNull
    private Integer numeroDoc;

    @NotNull
    private Integer pedidoMinimoQtd;

    @NotNull
    private BigDecimal pedidoMinimoValor;

    @NotNull
    @Size(max = 4)
    private String serienf;

    @NotNull
    private Boolean descontoFunRural;

    @NotNull
    private Integer senha;

    private TipoRecebimentoDTO tipoRecebimento;

    @NotNull
    @Size(max = 6)
    private String agencia;

    @NotNull
    @Size(max = 2)
    private String digitoAgencia;

    @NotNull
    @Size(max = 12)
    private String conta;

    @NotNull
    @Size(max = 2)
    private String digitoConta;

    private BancoDTO banco;

    @JsonIgnore
    private FornecedorDTO fornecedorFavorecido;

    @NotNull
    @Size(max = 40)
    private String enderecoCobranca;

    @NotNull
    @Size(max = 30)
    private String bairroCobranca;

    @NotNull
    private BigDecimal cepCobranca;

    private MunicipioDTO municipioCobranca;

    private EstadoDTO estadoCobranca;

    @NotNull
    private Boolean bloqueado;

    private TipoMotivoFornecedorDTO tipoMotivoFornecedor;

    private Instant datasIntegra;

    @NotNull
    private TipoEmpresaDTO tipoEmpresa;

    @NotNull
    @Size(max = 9)
    private String inscricaoSuframa;

    @NotNull
    private Boolean utilizaIva;

    private FamiliaFornecedorDTO familiaFornecedor;

    private TipoInspecaoDTO tipoInspecao;

    @NotNull
    private Integer numeroInspecao;

    private TipoTrocaDTO tipoTroca;

    @NotNull
    private TipoFornecedorDTO tipoFornecedor;

    private ContaContabilFinanceiroDTO contaContabilFinanceiro;

    @NotNull
    private Boolean utilizaNfe;

    @NotNull
    private LocalDate dataCadastro;

    @NotNull
    private Boolean utilizaConferencia;

    @NotNull
    @Size(max = 6)
    private String numero;

    @NotNull
    private Boolean permiteNfSemPedido;

    @NotNull
    @Size(max = 2)
    private String modeloNf;

    @NotNull
    private Boolean emiteNf;

    @NotNull
    private Integer tipoNegociacao;

    @NotNull
    private Boolean utilizaCrossDocking;

    private LojaDTO lojaCrossDocking;

    @NotNull
    @Size(max = 2500)
    private String observacao;

    @NotNull
    private PaisDTO pais;

    @Size(max = 20)
    private String inscricaoMunicipal;

    private ContaContabilFiscalDTO contaContabilFiscalPassivo;

    @NotNull
    @Size(max = 6)
    private String numeroCobranca;

    @NotNull
    @Size(max = 30)
    private String complemento;

    @NotNull
    @Size(max = 30)
    private String complementoCobranca;

    private ContaContabilFiscalDTO contaContabilFiscalAtivo;

    @NotNull
    private Boolean utilizaEdi;

    @NotNull
    private Integer tipoRegraVencimento;

    private Boolean nfEmitidaPostoFiscal;

    private TipoIndicadorieDTO tipoIndicadorie;

    private IndicativoCprbDTO indicativoCprb;

    private Boolean utilizaProdepe;

    @NotNull
    private TipoNegociacaoCompraDTO tipoNegociacaoCompra;

    private TipoCustoDevolucaoTrocaDTO tipoCustoDevolucaoTroca;

    private Boolean alteradoPaf;

    private BigDecimal cpfProdutorRural;

    private IndicativoSenarDTO indicativoSenar;

    @NotNull
    private Boolean antecipacaoPagamento;

    private BigDecimal percentualCreditoIcmssn;

    public FornecedorDTO(Fornecedor fornecedor) {
        this.id = fornecedor.getId();
        this.razaoSocial = fornecedor.getRazaoSocial();
        this.nomeFantasia = fornecedor.getNomeFantasia();
        this.endereco = fornecedor.getEndereco();
        this.bairro = fornecedor.getBairro();
        this.municipio = new MunicipioDTO(fornecedor.getMunicipio());
        this.cep = fornecedor.getCep();
        this.estado = new EstadoDTO(fornecedor.getEstado());
        this.telefone = fornecedor.getTelefone();
        this.tipoInscricao = new TipoInscricaoDTO(fornecedor.getTipoInscricao());
        this.inscricaoEstadual = fornecedor.getInscricaoEstadual();
        this.cnpj = fornecedor.getCnpj();
        this.revenda = fornecedor.getRevenda();
        this.situacaoCadastro = new SituacaoCadastroDTO(fornecedor.getSituacaoCadastro());
        this.tipoPagamento = new TipoPagamentoDTO(fornecedor.getTipoPagamento());
        this.numeroDoc = fornecedor.getNumeroDoc();
        this.pedidoMinimoQtd = fornecedor.getPedidoMinimoQtd();
        this.pedidoMinimoValor = fornecedor.getPedidoMinimoValor();
        this.serienf = fornecedor.getSerienf();
        this.descontoFunRural = fornecedor.getDescontoFunRural();
        this.senha = fornecedor.getSenha();
        this.tipoRecebimento = new TipoRecebimentoDTO(fornecedor.getTipoRecebimento());
        this.agencia = fornecedor.getAgencia();
        this.digitoAgencia = fornecedor.getDigitoAgencia();
        this.conta = fornecedor.getConta();
        this.digitoConta = fornecedor.getDigitoConta();
        this.banco = new BancoDTO(fornecedor.getBanco());
        this.fornecedorFavorecido = new FornecedorDTO(fornecedor.getFornecedorFavorecido());
        this.enderecoCobranca = fornecedor.getEnderecoCobranca();
        this.bairroCobranca = fornecedor.getBairroCobranca();
        this.cepCobranca = fornecedor.getCepCobranca();
        this.municipioCobranca = new MunicipioDTO(fornecedor.getMunicipioCobranca());
        this.estadoCobranca = new EstadoDTO(fornecedor.getEstadoCobranca());
        this.bloqueado = fornecedor.getBloqueado();
        this.tipoMotivoFornecedor = new TipoMotivoFornecedorDTO(fornecedor.getTipoMotivoFornecedor());
        this.datasIntegra = fornecedor.getDatasIntegra();
        this.tipoEmpresa = new TipoEmpresaDTO(fornecedor.getTipoEmpresa());
        this.inscricaoSuframa = fornecedor.getInscricaoSuframa();
        this.utilizaIva = fornecedor.getUtilizaIva();
        this.familiaFornecedor = new FamiliaFornecedorDTO(fornecedor.getFamiliaFornecedor());
        this.tipoInspecao = new TipoInspecaoDTO(fornecedor.getTipoInspecao());
        this.numeroInspecao = fornecedor.getNumeroInspecao();
        this.tipoTroca = new TipoTrocaDTO(fornecedor.getTipoTroca());
        this.tipoFornecedor = new TipoFornecedorDTO(fornecedor.getTipoFornecedor());
        this.contaContabilFinanceiro = new ContaContabilFinanceiroDTO(fornecedor.getContaContabilFinanceiro());
        this.utilizaNfe = fornecedor.getUtilizaNfe();
        this.dataCadastro = fornecedor.getDataCadastro();
        this.utilizaConferencia = fornecedor.getUtilizaConferencia();
        this.numero = fornecedor.getNumero();
        this.permiteNfSemPedido = fornecedor.getPermiteNfSemPedido();
        this.modeloNf = fornecedor.getModeloNf();
        this.emiteNf = fornecedor.getEmiteNf();
        this.tipoNegociacao = fornecedor.getTipoNegociacao();
        this.utilizaCrossDocking = fornecedor.getUtilizaCrossDocking();
        this.lojaCrossDocking = new LojaDTO(fornecedor.getLojaCrossDocking());
        this.observacao = fornecedor.getObservacao();
        this.pais = new PaisDTO(fornecedor.getPais());
        this.inscricaoMunicipal = fornecedor.getInscricaoMunicipal();
        this.contaContabilFiscalPassivo = new ContaContabilFiscalDTO(fornecedor.getContaContabilFiscalPassivo());
        this.numeroCobranca = fornecedor.getNumeroCobranca();
        this.complemento = fornecedor.getComplemento();
        this.complementoCobranca = fornecedor.getComplementoCobranca();
        this.contaContabilFiscalAtivo = new ContaContabilFiscalDTO(fornecedor.getContaContabilFiscalAtivo());
        this.utilizaEdi = fornecedor.getUtilizaEdi();
        this.tipoRegraVencimento = fornecedor.getTipoRegraVencimento();
        this.nfEmitidaPostoFiscal = fornecedor.getNfEmitidaPostoFiscal();
        this.tipoIndicadorie = new TipoIndicadorieDTO(fornecedor.getTipoIndicadorie());
        this.indicativoCprb = new IndicativoCprbDTO(fornecedor.getIndicativoCprb());
        this.utilizaProdepe = fornecedor.getUtilizaProdepe();
        this.tipoNegociacaoCompra = new TipoNegociacaoCompraDTO(fornecedor.getTipoNegociacaoCompra());
        this.tipoCustoDevolucaoTroca = new TipoCustoDevolucaoTrocaDTO(fornecedor.getTipoCustoDevolucaoTroca());
        this.alteradoPaf = fornecedor.getAlteradoPaf();
        this.cpfProdutorRural = fornecedor.getCpfProdutorRural();
        this.indicativoSenar = new IndicativoSenarDTO(fornecedor.getIndicativoSenar());
        this.antecipacaoPagamento = fornecedor.getAntecipacaoPagamento();
        this.percentualCreditoIcmssn = fornecedor.getPercentualCreditoIcmssn();
    }
}
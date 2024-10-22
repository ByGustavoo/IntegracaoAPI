package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Fornecedor;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;

public class FornecedorDTO {

    Integer id;

    @NotNull
    @Size(max = 40)
    String razaoSocial;

    @NotNull
    @Size(max = 30)
    String nomeFantasia;

    @NotNull
    @Size(max = 40)
    String endereco;

    @NotNull
    @Size(max = 30)
    String bairro;

    @NotNull
    MunicipioDTO municipio;

    @NotNull
    BigDecimal cep;

    @NotNull
    EstadoDTO estado;

    @NotNull
    @Size(max = 14)
    String telefone;

    @NotNull
    TipoInscricaoDTO tipoInscricao;

    @NotNull
    @Size(max = 20)
    String inscricaoEstadual;

    @NotNull
    BigDecimal cnpj;

    @NotNull
    Boolean revenda;

    @NotNull
    SituacaoCadastroDTO situacaoCadastro;

    @NotNull
    TipoPagamentoDTO tipoPagamento;

    @NotNull
    Integer numeroDoc;

    @NotNull
    Integer pedidoMinimoQtd;

    @NotNull
    BigDecimal pedidoMinimoValor;

    @NotNull
    @Size(max = 4)
    String serienf;

    @NotNull
    Boolean descontoFunRural;

    @NotNull
    Integer senha;

    TipoRecebimentoDTO tipoRecebimento;

    @NotNull
    @Size(max = 6)
    String agencia;

    @NotNull
    @Size(max = 2)
    String digitoAgencia;

    @NotNull
    @Size(max = 12)
    String conta;

    @NotNull
    @Size(max = 2)
    String digitoConta;

    BancoDTO banco;

    @JsonIgnore
    FornecedorDTO fornecedorFavorecido;

    @NotNull
    @Size(max = 40)
    String enderecoCobranca;

    @NotNull
    @Size(max = 30)
    String bairroCobranca;

    @NotNull
    BigDecimal cepCobranca;

    MunicipioDTO municipioCobranca;

    EstadoDTO estadoCobranca;

    @NotNull
    Boolean bloqueado;

    TipoMotivoFornecedorDTO tipoMotivoFornecedor;

    Instant datasIntegra;

    @NotNull
    TipoEmpresaDTO tipoEmpresa;

    @NotNull
    @Size(max = 9)
    String inscricaoSuframa;

    @NotNull
    Boolean utilizaIva;

    FamiliaFornecedorDTO familiaFornecedor;

    TipoInspecaoDTO tipoInspecao;

    @NotNull
    Integer numeroInspecao;

    TipoTrocaDTO tipoTroca;

    @NotNull
    TipoFornecedorDTO tipoFornecedor;

    ContaContabilFinanceiroDTO contaContabilFinanceiro;

    @NotNull
    Boolean utilizaNfe;

    @NotNull
    LocalDate dataCadastro;

    @NotNull
    Boolean utilizaConferencia;

    @NotNull
    @Size(max = 6)
    String numero;

    @NotNull
    Boolean permiteNfSemPedido;

    @NotNull
    @Size(max = 2)
    String modeloNf;

    @NotNull
    Boolean emiteNf;

    @NotNull
    Integer tipoNegociacao;

    @NotNull
    Boolean utilizaCrossDocking;

    LojaDTO lojaCrossDocking;

    @NotNull
    @Size(max = 2500)
    String observacao;

    @NotNull
    PaisDTO pais;

    @Size(max = 20)
    String inscricaoMunicipal;

    ContaContabilFiscalDTO contaContabilFiscalPassivo;

    @NotNull
    @Size(max = 6)
    String numeroCobranca;

    @NotNull
    @Size(max = 30)
    String complemento;

    @NotNull
    @Size(max = 30)
    String complementoCobranca;

    ContaContabilFiscalDTO contaContabilFiscalAtivo;

    @NotNull
    Boolean utilizaEdi;

    @NotNull
    Integer tipoRegraVencimento;

    Boolean nfEmitidaPostoFiscal;

    TipoIndicadorieDTO tipoIndicadorie;

    IndicativoCprbDTO indicativoCprb;

    Boolean utilizaProdepe;

    @NotNull
    TipoNegociacaoCompraDTO tipoNegociacaoCompra;

    TipoCustoDevolucaoTrocaDTO tipoCustoDevolucaoTroca;

    Boolean alteradoPaf;

    BigDecimal cpfProdutorRural;

    IndicativoSenarDTO indicativoSenar;

    @NotNull
    Boolean antecipacaoPagamento;

    BigDecimal percentualCreditoIcmssn;

    BigDecimal valorMaximoVerbaPedido;


    public FornecedorDTO(Fornecedor fornecedor) {
                fornecedor.getId(),
                fornecedor.getRazaoSocial(),
                fornecedor.getNomeFantasia(),
                fornecedor.getEndereco(),
                fornecedor.getBairro(),
                new MunicipioDTO(fornecedor.getMunicipio()),
                fornecedor.getCep(),
                new EstadoDTO(fornecedor.getEstado()),
                fornecedor.getTelefone(),
                new TipoInscricaoDTO(fornecedor.getTipoInscricao()),
                fornecedor.getInscricaoEstadual(),
                fornecedor.getCnpj(),
                fornecedor.getRevenda(),
                new SituacaoCadastroDTO(fornecedor.getSituacaoCadastro()),
                new TipoPagamentoDTO(fornecedor.getTipoPagamento()),
                fornecedor.getNumeroDoc(),
                fornecedor.getPedidoMinimoQtd();
    }
}
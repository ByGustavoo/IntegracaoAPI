package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Fornecedor;
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

    @NotNull(message = "{razaoSocial.obrigatorio}")
    @Size(max = 40, message = "{razaoSocial.tamanhoMaximo}")
    private String razaoSocial;

    @NotNull(message = "{nomeFantasia.obrigatorio}")
    @Size(max = 30, message = "{nomeFantasia.tamanhoMaximo}")
    private String nomeFantasia;

    @NotNull(message = "{endereco.obrigatorio}")
    @Size(max = 40, message = "{endereco.tamanhoMaximo}")
    private String endereco;

    @NotNull(message = "{bairro.obrigatorio}")
    @Size(max = 30, message = "{bairro.tamanhoMaximo}")
    private String bairro;

    @NotNull(message = "{municipio.obrigatorio}")
    private MunicipioDTO municipio;

    @NotNull(message = "{cep.obrigatorio}")
    private BigDecimal cep;

    @NotNull(message = "{estado.obrigatorio}")
    private EstadoDTO estado;

    @NotNull(message = "{telefone.obrigatorio}")
    @Size(max = 14, message = "{telefone.tamanhoMaximo}")
    private String telefone;

    @NotNull(message = "{tipoInscricao.obrigatorio}")
    private TipoInscricaoDTO tipoInscricao;

    @NotNull(message = "{inscricaoEstadual.obrigatorio}")
    @Size(max = 20, message = "{inscricaoEstadual.tamanhoMaximo}")
    private String inscricaoEstadual;

    @NotNull(message = "{cnpj.obrigatorio}")
    private BigDecimal cnpj;

    @NotNull(message = "{revenda.obrigatorio}")
    private Boolean revenda;

    @NotNull(message = "{situacaoCadastro.obrigatorio}")
    private SituacaoCadastroDTO situacaoCadastro;

    @NotNull(message = "{tipoPagamento.obrigatorio}")
    private TipoPagamentoDTO tipoPagamento;

    @NotNull(message = "{numeroDoc.obrigatorio}")
    private Integer numeroDoc;

    @NotNull(message = "{pedidoMinimoQtd.obrigatorio}")
    private Integer pedidoMinimoQtd;

    @NotNull(message = "{pedidoMinimoValor.obrigatorio}")
    private BigDecimal pedidoMinimoValor;

    @NotNull(message = "{serienf.obrigatorio}")
    @Size(max = 4, message = "{serienf.tamanhoMaximo}")
    private String serienf;

    @NotNull(message = "{descontoFunRural.obrigatorio}")
    private Boolean descontoFunRural;

    @NotNull(message = "{senha.obrigatorio}")
    private Integer senha;

    private TipoRecebimentoDTO tipoRecebimento;

    @NotNull(message = "{agencia.obrigatorio}")
    @Size(max = 6, message = "{agencia.tamanhoMaximo}")
    private String agencia;

    @NotNull(message = "{digitoAgencia.obrigatorio}")
    @Size(max = 2, message = "{digitoAgencia.tamanhoMaximo}")
    private String digitoAgencia;

    @NotNull(message = "{conta.obrigatorio}")
    @Size(max = 12, message = "{conta.tamanhoMaximo}")
    private String conta;

    @NotNull(message = "{digitoConta.obrigatorio}")
    @Size(max = 2, message = "{digitoConta.tamanhoMaximo}")
    private String digitoConta;

    private BancoDTO banco;

    @NotNull(message = "{enderecoCobranca.obrigatorio}")
    @Size(max = 40, message = "{enderecoCobranca.tamanhoMaximo}")
    private String enderecoCobranca;

    @NotNull(message = "{bairroCobranca.obrigatorio}")
    @Size(max = 30, message = "{bairroCobranca.tamanhoMaximo}")
    private String bairroCobranca;

    @NotNull(message = "{cepCobranca.obrigatorio}")
    private BigDecimal cepCobranca;

    private MunicipioDTO municipioCobranca;

    private EstadoDTO estadoCobranca;

    @NotNull(message = "{bloqueado.obrigatorio}")
    private Boolean bloqueado;

    private TipoMotivoFornecedorDTO tipoMotivoFornecedor;

    private Instant datasIntegra;

    @NotNull(message = "{tipoEmpresa.obrigatorio}")
    private TipoEmpresaDTO tipoEmpresa;

    @NotNull(message = "{inscricaoSuframa.obrigatorio}")
    @Size(max = 9, message = "{inscricaoSuframa.tamanhoMaximo}")
    private String inscricaoSuframa;

    @NotNull(message = "{utilizaIva.obrigatorio}")
    private Boolean utilizaIva;

    private FamiliaFornecedorDTO familiaFornecedor;

    private TipoInspecaoDTO tipoInspecao;

    @NotNull(message = "{numeroInspecao.obrigatorio}")
    private Integer numeroInspecao;

    private TipoTrocaDTO tipoTroca;

    @NotNull(message = "{tipoFornecedor.obrigatorio}")
    private TipoFornecedorDTO tipoFornecedor;

    private ContaContabilFinanceiroDTO contaContabilFinanceiro;

    @NotNull(message = "{utilizaNfe.obrigatorio}")
    private Boolean utilizaNfe;

    @NotNull(message = "{dataCadastro.obrigatorio}")
    private LocalDate dataCadastro;

    @NotNull(message = "{utilizaConferencia.obrigatorio}")
    private Boolean utilizaConferencia;

    @NotNull(message = "{numero.obrigatorio}")
    @Size(max = 6, message = "{numero.tamanhoMaximo}")
    private String numero;

    @NotNull(message = "{permiteNfSemPedido.obrigatorio}")
    private Boolean permiteNfSemPedido;

    @NotNull(message = "{modeloNf.obrigatorio}")
    @Size(max = 2, message = "{modeloNf.tamanhoMaximo}")
    private String modeloNf;

    @NotNull(message = "{emiteNf.obrigatorio}")
    private Boolean emiteNf;

    @NotNull(message = "{tipoNegociacao.obrigatorio}")
    private Integer tipoNegociacao;

    @NotNull(message = "{utilizaCrossDocking.obrigatorio}")
    private Boolean utilizaCrossDocking;

    private LojaDTO lojaCrossDocking;

    @NotNull(message = "{observacao.obrigatorio}")
    @Size(max = 2500, message = "{observacao.tamanhoMaximo}")
    private String observacao;

    @NotNull(message = "{pais.obrigatorio}")
    private PaisDTO pais;

    @Size(max = 20, message = "{inscricaoMunicipal.tamanhoMaximo}")
    private String inscricaoMunicipal;

    private ContaContabilFiscalDTO contaContabilFiscalPassivo;

    @NotNull(message = "{numeroCobranca.obrigatorio}")
    @Size(max = 6, message = "{numeroCobranca.tamanhoMaximo}")
    private String numeroCobranca;

    @NotNull(message = "{complemento.obrigatorio}")
    @Size(max = 30, message = "{complemento.tamanhoMaximo}")
    private String complemento;

    @NotNull(message = "{complementoCobranca.obrigatorio}")
    @Size(max = 30, message = "{complementoCobranca.tamanhoMaximo}")
    private String complementoCobranca;

    private ContaContabilFiscalDTO contaContabilFiscalAtivo;

    @NotNull(message = "{utilizaEdi.obrigatorio}")
    private Boolean utilizaEdi;

    @NotNull(message = "{tipoRegraVencimento.obrigatorio}")
    private Integer tipoRegraVencimento;

    private Boolean nfEmitidaPostoFiscal;

    private TipoIndicadorieDTO tipoIndicadorie;

    private IndicativoCprbDTO indicativoCprb;

    private Boolean utilizaProdepe;

    @NotNull(message = "{tipoNegociacaoCompra.obrigatorio}")
    private TipoNegociacaoCompraDTO tipoNegociacaoCompra;

    private TipoCustoDevolucaoTrocaDTO tipoCustoDevolucaoTroca;

    private Boolean alteradoPaf;

    private BigDecimal cpfProdutorRural;

    private IndicativoSenarDTO indicativoSenar;

    @NotNull(message = "{antecipacaoPagamento.obrigatorio}")
    private Boolean antecipacaoPagamento;

    private BigDecimal percentualCreditoIcmssn;

    public FornecedorDTO(Integer id, String razaoSocial, String nomeFantasia) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }

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
        this.tipoRecebimento = fornecedor.getTipoRecebimento() != null ? new TipoRecebimentoDTO(fornecedor.getTipoRecebimento()) : null;
        this.agencia = fornecedor.getAgencia();
        this.digitoAgencia = fornecedor.getDigitoAgencia();
        this.conta = fornecedor.getConta();
        this.digitoConta = fornecedor.getDigitoConta();
        this.banco = fornecedor.getBanco() != null ? new BancoDTO(fornecedor.getBanco()) : null;
        this.enderecoCobranca = fornecedor.getEnderecoCobranca();
        this.bairroCobranca = fornecedor.getBairroCobranca();
        this.cepCobranca = fornecedor.getCepCobranca();
        this.municipioCobranca = fornecedor.getMunicipioCobranca() != null ? new MunicipioDTO(fornecedor.getMunicipioCobranca()) : null;
        this.estadoCobranca = fornecedor.getEstadoCobranca() != null ? new EstadoDTO(fornecedor.getEstadoCobranca()) : null;
        this.bloqueado = fornecedor.getBloqueado();
        this.tipoMotivoFornecedor = fornecedor.getTipoMotivoFornecedor() != null ? new TipoMotivoFornecedorDTO(fornecedor.getTipoMotivoFornecedor()) : null;
        this.datasIntegra = fornecedor.getDatasIntegra();
        this.tipoEmpresa = new TipoEmpresaDTO(fornecedor.getTipoEmpresa());
        this.inscricaoSuframa = fornecedor.getInscricaoSuframa();
        this.utilizaIva = fornecedor.getUtilizaIva();
        this.familiaFornecedor = fornecedor.getFamiliaFornecedor() != null ? new FamiliaFornecedorDTO(fornecedor.getFamiliaFornecedor()) : null;
        this.tipoInspecao = fornecedor.getTipoInspecao() != null ? new TipoInspecaoDTO(fornecedor.getTipoInspecao()) : null;
        this.numeroInspecao = fornecedor.getNumeroInspecao();
        this.tipoTroca = fornecedor.getTipoTroca() != null ? new TipoTrocaDTO(fornecedor.getTipoTroca()) : null;
        this.tipoFornecedor = new TipoFornecedorDTO(fornecedor.getTipoFornecedor());
        this.contaContabilFinanceiro = fornecedor.getContaContabilFinanceiro() != null ? new ContaContabilFinanceiroDTO(fornecedor.getContaContabilFinanceiro()) : null;
        this.utilizaNfe = fornecedor.getUtilizaNfe();
        this.dataCadastro = fornecedor.getDataCadastro();
        this.utilizaConferencia = fornecedor.getUtilizaConferencia();
        this.numero = fornecedor.getNumero();
        this.permiteNfSemPedido = fornecedor.getPermiteNfSemPedido();
        this.modeloNf = fornecedor.getModeloNf();
        this.emiteNf = fornecedor.getEmiteNf();
        this.tipoNegociacao = fornecedor.getTipoNegociacao();
        this.utilizaCrossDocking = fornecedor.getUtilizaCrossDocking();
        this.lojaCrossDocking = fornecedor.getLojaCrossDocking() != null ? new LojaDTO(fornecedor.getLojaCrossDocking().getId(), fornecedor.getLojaCrossDocking().getDescricao()) : null;
        this.observacao = fornecedor.getObservacao();
        this.pais = new PaisDTO(fornecedor.getPais());
        this.inscricaoMunicipal = fornecedor.getInscricaoMunicipal();
        this.contaContabilFiscalPassivo = fornecedor.getContaContabilFiscalPassivo() != null ? new ContaContabilFiscalDTO(fornecedor.getContaContabilFiscalPassivo()) : null;
        this.numeroCobranca = fornecedor.getNumeroCobranca();
        this.complemento = fornecedor.getComplemento();
        this.complementoCobranca = fornecedor.getComplementoCobranca();
        this.contaContabilFiscalAtivo = fornecedor.getContaContabilFiscalAtivo() != null ? new ContaContabilFiscalDTO(fornecedor.getContaContabilFiscalAtivo()) : null;
        this.utilizaEdi = fornecedor.getUtilizaEdi();
        this.tipoRegraVencimento = fornecedor.getTipoRegraVencimento();
        this.nfEmitidaPostoFiscal = fornecedor.getNfEmitidaPostoFiscal();
        this.tipoIndicadorie = fornecedor.getTipoIndicadorie() != null ? new TipoIndicadorieDTO(fornecedor.getTipoIndicadorie()) : null;
        this.indicativoCprb = fornecedor.getIndicativoCprb() != null ? new IndicativoCprbDTO(fornecedor.getIndicativoCprb()) : null;
        this.utilizaProdepe = fornecedor.getUtilizaProdepe();
        this.tipoNegociacaoCompra = new TipoNegociacaoCompraDTO(fornecedor.getTipoNegociacaoCompra());
        this.tipoCustoDevolucaoTroca = fornecedor.getTipoCustoDevolucaoTroca() != null ? new TipoCustoDevolucaoTrocaDTO(fornecedor.getTipoCustoDevolucaoTroca()) : null;
        this.alteradoPaf = fornecedor.getAlteradoPaf();
        this.cpfProdutorRural = fornecedor.getCpfProdutorRural();
        this.indicativoSenar = fornecedor.getIndicativoSenar() != null ? new IndicativoSenarDTO(fornecedor.getIndicativoSenar()) : null;
        this.antecipacaoPagamento = fornecedor.getAntecipacaoPagamento();
        this.percentualCreditoIcmssn = fornecedor.getPercentualCreditoIcmssn();
    }

    public Fornecedor toEntity() {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId(this.id);
        fornecedor.setRazaoSocial(this.razaoSocial);
        fornecedor.setNomeFantasia(this.nomeFantasia);
        fornecedor.setEndereco(this.endereco);
        fornecedor.setBairro(this.bairro);
        fornecedor.setMunicipio(this.municipio != null ? this.municipio.toEntity() : null);
        fornecedor.setCep(this.cep);
        fornecedor.setEstado(this.estado != null ? this.estado.toEntity() : null);
        fornecedor.setTelefone(this.telefone);
        fornecedor.setTipoInscricao(this.tipoInscricao != null ? this.tipoInscricao.toEntity() : null);
        fornecedor.setInscricaoEstadual(this.inscricaoEstadual);
        fornecedor.setCnpj(this.cnpj);
        fornecedor.setRevenda(this.revenda);
        fornecedor.setSituacaoCadastro(this.situacaoCadastro != null ? this.situacaoCadastro.toEntity() : null);
        fornecedor.setTipoPagamento(this.tipoPagamento != null ? this.tipoPagamento.toEntity() : null);
        fornecedor.setNumeroDoc(this.numeroDoc);
        fornecedor.setPedidoMinimoQtd(this.pedidoMinimoQtd);
        fornecedor.setPedidoMinimoValor(this.pedidoMinimoValor);
        fornecedor.setSerienf(this.serienf);
        fornecedor.setDescontoFunRural(this.descontoFunRural);
        fornecedor.setSenha(this.senha);
        fornecedor.setTipoRecebimento(this.tipoRecebimento != null ? this.tipoRecebimento.toEntity() : null);
        fornecedor.setAgencia(this.agencia);
        fornecedor.setDigitoAgencia(this.digitoAgencia);
        fornecedor.setConta(this.conta);
        fornecedor.setDigitoConta(this.digitoConta);
        fornecedor.setBanco(this.banco != null ? this.banco.toEntity() : null);
        fornecedor.setEnderecoCobranca(this.enderecoCobranca);
        fornecedor.setBairroCobranca(this.bairroCobranca);
        fornecedor.setCepCobranca(this.cepCobranca);
        fornecedor.setMunicipioCobranca(this.municipioCobranca != null ? this.municipioCobranca.toEntity() : null);
        fornecedor.setEstadoCobranca(this.estadoCobranca != null ? this.estadoCobranca.toEntity() : null);
        fornecedor.setBloqueado(this.bloqueado);
        fornecedor.setTipoMotivoFornecedor(this.tipoMotivoFornecedor != null ? this.tipoMotivoFornecedor.toEntity() : null);
        fornecedor.setDatasIntegra(this.datasIntegra);
        fornecedor.setTipoEmpresa(this.tipoEmpresa != null ? this.tipoEmpresa.toEntity() : null);
        fornecedor.setInscricaoSuframa(this.inscricaoSuframa);
        fornecedor.setUtilizaIva(this.utilizaIva);
        fornecedor.setFamiliaFornecedor(this.familiaFornecedor != null ? this.familiaFornecedor.toEntity() : null);
        fornecedor.setTipoInspecao(this.tipoInspecao != null ? this.tipoInspecao.toEntity() : null);
        fornecedor.setNumeroInspecao(this.numeroInspecao);
        fornecedor.setTipoTroca(this.tipoTroca != null ? this.tipoTroca.toEntity() : null);
        fornecedor.setTipoFornecedor(this.tipoFornecedor != null ? this.tipoFornecedor.toEntity() : null);
        fornecedor.setContaContabilFinanceiro(this.contaContabilFinanceiro != null ? this.contaContabilFinanceiro.toEntity() : null);
        fornecedor.setUtilizaNfe(this.utilizaNfe);
        fornecedor.setDataCadastro(this.dataCadastro);
        fornecedor.setUtilizaConferencia(this.utilizaConferencia);
        fornecedor.setNumero(this.numero);
        fornecedor.setPermiteNfSemPedido(this.permiteNfSemPedido);
        fornecedor.setModeloNf(this.modeloNf);
        fornecedor.setEmiteNf(this.emiteNf);
        fornecedor.setTipoNegociacao(this.tipoNegociacao);
        fornecedor.setUtilizaCrossDocking(this.utilizaCrossDocking);
        fornecedor.setLojaCrossDocking(this.lojaCrossDocking != null ? this.lojaCrossDocking.toEntity() : null);
        fornecedor.setObservacao(this.observacao);
        fornecedor.setPais(this.pais != null ? this.pais.toEntity() : null);
        fornecedor.setInscricaoMunicipal(this.inscricaoMunicipal);
        fornecedor.setContaContabilFiscalPassivo(this.contaContabilFiscalPassivo != null ? this.contaContabilFiscalPassivo.toEntity() : null);
        fornecedor.setNumeroCobranca(this.numeroCobranca);
        fornecedor.setComplemento(this.complemento);
        fornecedor.setComplementoCobranca(this.complementoCobranca);
        fornecedor.setContaContabilFiscalAtivo(this.contaContabilFiscalAtivo != null ? this.contaContabilFiscalAtivo.toEntity() : null);
        fornecedor.setUtilizaEdi(this.utilizaEdi);
        fornecedor.setTipoRegraVencimento(this.tipoRegraVencimento);
        fornecedor.setNfEmitidaPostoFiscal(this.nfEmitidaPostoFiscal);
        fornecedor.setTipoIndicadorie(this.tipoIndicadorie != null ? this.tipoIndicadorie.toEntity() : null);
        fornecedor.setIndicativoCprb(this.indicativoCprb != null ? this.indicativoCprb.toEntity() : null);
        fornecedor.setUtilizaProdepe(this.utilizaProdepe);
        fornecedor.setTipoNegociacaoCompra(this.tipoNegociacaoCompra != null ? this.tipoNegociacaoCompra.toEntity() : null);
        fornecedor.setTipoCustoDevolucaoTroca(this.tipoCustoDevolucaoTroca != null ? this.tipoCustoDevolucaoTroca.toEntity() : null);
        fornecedor.setAlteradoPaf(this.alteradoPaf);
        fornecedor.setCpfProdutorRural(this.cpfProdutorRural);
        fornecedor.setIndicativoSenar(this.indicativoSenar != null ? this.indicativoSenar.toEntity() : null);
        fornecedor.setAntecipacaoPagamento(this.antecipacaoPagamento);
        fornecedor.setPercentualCreditoIcmssn(this.percentualCreditoIcmssn);

        return fornecedor;
    }
}
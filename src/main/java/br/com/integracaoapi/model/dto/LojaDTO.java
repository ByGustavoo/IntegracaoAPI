package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Loja;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LojaDTO {

    private Integer id;

    @NotNull
    @Size(max = 25)
    private String descricao;

    @NotNull
    private FornecedorDTO fornecedor;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    @NotNull
    @Size(max = 30)
    private String nomeServidor;

    @NotNull
    private RegiaoDTO regiao;

    @NotNull
    private Boolean servidorCentral;

    @NotNull
    private Boolean geraConcentrador;

    private Boolean estoqueTerceiro;

    private Boolean lojaVirtual;

    @NotNull
    private Boolean atacado;

    public LojaDTO(Loja loja) {
        this.id = loja.getId();
        this.descricao = loja.getDescricao();
        this.fornecedor = new FornecedorDTO(loja.getFornecedor());
        this.situacaoCadastro = new SituacaoCadastroDTO(loja.getSituacaoCadastro());
        this.nomeServidor = loja.getNomeServidor();
        this.regiao = new RegiaoDTO(loja.getRegiao());
        this.servidorCentral = loja.getServidorCentral();
        this.geraConcentrador = loja.getGeraConcentrador();
        this.estoqueTerceiro = loja.getEstoqueTerceiro();
        this.lojaVirtual = loja.getLojaVirtual();
        this.atacado = loja.getAtacado();
    }
}
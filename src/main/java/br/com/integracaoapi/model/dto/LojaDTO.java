package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Loja;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
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
        this.fornecedor = new FornecedorDTO(loja.getFornecedor().getId(), loja.getFornecedor().getRazaoSocial(), loja.getFornecedor().getNomeFantasia());
        this.situacaoCadastro = new SituacaoCadastroDTO(loja.getSituacaoCadastro());
        this.nomeServidor = loja.getNomeServidor();
        this.regiao = new RegiaoDTO(loja.getRegiao());
        this.servidorCentral = loja.getServidorCentral();
        this.geraConcentrador = loja.getGeraConcentrador();
        this.estoqueTerceiro = loja.getEstoqueTerceiro();
        this.lojaVirtual = loja.getLojaVirtual();
        this.atacado = loja.getAtacado();
    }

    public LojaDTO(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Loja toEntity() {
        Loja loja = new Loja();
        loja.setId(this.id);
        loja.setDescricao(this.descricao);
        loja.setFornecedor(this.fornecedor.toEntity());
        loja.setSituacaoCadastro(this.situacaoCadastro.toEntity());
        loja.setNomeServidor(this.nomeServidor);
        loja.setRegiao(this.regiao.toEntity());
        loja.setServidorCentral(this.servidorCentral);
        loja.setGeraConcentrador(this.geraConcentrador);
        loja.setEstoqueTerceiro(this.estoqueTerceiro);
        loja.setLojaVirtual(this.lojaVirtual);
        loja.setAtacado(this.atacado);
        return loja;
    }
}
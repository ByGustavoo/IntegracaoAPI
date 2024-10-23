package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Banco;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BancoDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String descricao;

    @NotNull
    private SituacaoCadastroDTO situacaoCadastro;

    public BancoDTO(Banco banco) {
        this.id = banco.getId();
        this.descricao = banco.getDescricao();
        this.situacaoCadastro = new SituacaoCadastroDTO(banco.getSituacaoCadastro());
    }
}
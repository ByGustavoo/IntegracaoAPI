package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Banco;
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
    }

    public Banco toEntity() {
        Banco banco = new Banco();
        banco.setId(this.id);
        banco.setDescricao(this.descricao);
        return banco;
    }
}
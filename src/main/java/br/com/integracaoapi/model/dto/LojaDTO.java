package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.Fornecedor;
import br.com.integracaoapi.model.entity.Loja;
import br.com.integracaoapi.model.entity.Regiao;
import br.com.integracaoapi.model.entity.SituacaoCadastro;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record LojaDTO(

        Integer id,

        @NotNull
        @Size(max = 25)
        String descricao,

        @NotNull
        Fornecedor fornecedor,

        @NotNull
        SituacaoCadastro situacaoCadastro,

        @NotNull
        @Size(max = 30)
        String nomeServidor,

        @NotNull
        Regiao regiao,

        @NotNull
        Boolean servidorCentral,

        @NotNull
        Boolean geraConcentrador,

        Boolean estoqueTerceiro,

        Boolean lojaVirtual,

        @NotNull
        Boolean atacado

) {
        public LojaDTO(Loja loja) {
                this(
                  loja.getId(),
                  loja.getDescricao(),
                  loja.getFornecedor(),
                  loja.getSituacaoCadastro(),
                  loja.getNomeServidor(),
                  loja.getRegiao(),
                  loja.getServidorCentral(),
                  loja.getGeraConcentrador(),
                  loja.getEstoqueTerceiro(),
                  loja.getLojaVirtual(),
                  loja.getAtacado()
                );
        }
}
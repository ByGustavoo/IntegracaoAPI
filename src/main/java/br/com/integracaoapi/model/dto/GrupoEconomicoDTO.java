package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.GrupoEconomico;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrupoEconomicoDTO {

    private Integer id;

    @NotNull
    @Size(max = 30)
    private String descricao;

    private Integer formaTributacao;

    @Size(max = 1)
    private String formaApuracao;

    private Integer qualificacaoPj;

    private Integer naturezaJuridica;

    private Integer cnae;

    public GrupoEconomicoDTO(GrupoEconomico grupoEconomico) {
        this.id = grupoEconomico.getId();
        this.descricao = grupoEconomico.getDescricao();
        this.formaTributacao = grupoEconomico.getFormaTributacao();
        this.formaApuracao = grupoEconomico.getFormaApuracao();
        this.qualificacaoPj = grupoEconomico.getQualificacaoPj();
        this.naturezaJuridica = grupoEconomico.getNaturezaJuridica();
        this.cnae = grupoEconomico.getCnae();
    }
}
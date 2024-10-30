package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoEmpresa;
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
public class TipoEmpresaDTO {

    private Integer id;

    @NotNull
    @Size(max = 35)
    private String descricao;

    @NotNull
    private Boolean creditaIcms;

    @NotNull
    private Boolean creditaPisCofins;

    @NotNull
    private Boolean naoUtilizaReducao;

    @NotNull
    private Boolean produtorRural;

    @NotNull
    private TipoCrtDTO tipoCrt;

    public TipoEmpresaDTO(TipoEmpresa tipoEmpresa) {
        this.id = tipoEmpresa.getId();
        this.descricao = tipoEmpresa.getDescricao();
        this.tipoCrt = new TipoCrtDTO(tipoEmpresa.getTipoCrt());
    }

    public TipoEmpresa toEntity() {
        TipoEmpresa tipoEmpresa = new TipoEmpresa();
        tipoEmpresa.setId(this.id);
        tipoEmpresa.setDescricao(this.descricao);
        tipoEmpresa.setCreditaIcms(this.creditaIcms);
        tipoEmpresa.setCreditaPisCofins(this.creditaPisCofins);
        tipoEmpresa.setNaoUtilizaReducao(this.naoUtilizaReducao);
        tipoEmpresa.setProdutorRural(this.produtorRural);
        tipoEmpresa.setTipoCrt(this.tipoCrt.toEntity());
        return tipoEmpresa;
    }
}
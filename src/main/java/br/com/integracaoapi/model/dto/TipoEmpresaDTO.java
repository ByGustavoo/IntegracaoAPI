package br.com.integracaoapi.model.dto;

import br.com.integracaoapi.model.entity.TipoEmpresa;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
        this.creditaIcms = tipoEmpresa.getCreditaIcms();
        this.creditaPisCofins = tipoEmpresa.getCreditaPisCofins();
        this.naoUtilizaReducao = tipoEmpresa.getNaoUtilizaReducao();
        this.produtorRural = tipoEmpresa.getProdutorRural();
        this.tipoCrt = new TipoCrtDTO(tipoEmpresa.getTipoCrt());
    }
}
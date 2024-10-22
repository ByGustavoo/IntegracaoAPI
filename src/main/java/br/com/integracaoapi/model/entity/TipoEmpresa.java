package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipoempresa", schema = "public")
public class TipoEmpresa {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 35)
    @Column(name = "descricao", length = 35, nullable = false)
    private String descricao;

    @NotNull
    @Column(name = "creditaicms", nullable = false)
    private Boolean creditaIcms;

    @NotNull
    @Column(name = "creditapiscofins", nullable = false)
    private Boolean creditaPisCofins;

    @NotNull
    @Column(name = "naoutilizareducao", nullable = false)
    private Boolean naoUtilizaReducao;

    @NotNull
    @Column(name = "produtorrural", nullable = false)
    private Boolean produtorRural;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_tipocrt", nullable = false)
    private TipoCrt tipoCrt;
}
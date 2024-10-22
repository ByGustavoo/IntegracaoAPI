package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grupoeconomico", schema = "contabilidade")
public class GrupoEconomico {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 30)
    @Column(name = "descricao", length = 30, nullable = false)
    private String descricao;

    @Column(name = "formatributacao")
    private Integer formaTributacao;

    @Size(max = 1)
    @Column(name = "formaapuracao", length = 1)
    private String formaApuracao;

    @Column(name = "qualificacaopj")
    private Integer qualificacaoPj;

    @Column(name = "naturezajuridica")
    private Integer naturezaJuridica;

    @Column(name = "cnae")
    private Integer cnae;
}
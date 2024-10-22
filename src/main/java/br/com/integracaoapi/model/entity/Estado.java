package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estado", schema = "public")
public class Estado {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 2)
    @Column(name = "sigla", length = 2, columnDefinition = "bpchar", nullable = false)
    private String sigla;

    @NotNull
    @Size(max = 20)
    @Column(name = "descricao", length = 20, nullable = false)
    private String descricao;

    @NotNull
    @Column(name = "codigogia", nullable = false)
    private Integer codigoGia = 0;

    @Column(name = "codigodief")
    private Integer codigoDief;
}
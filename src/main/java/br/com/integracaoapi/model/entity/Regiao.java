package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "regiao", schema = "public")
public class Regiao {

    @Id
    @NotNull
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Size(max = 30)
    @Column(name = "descricao", length = 30, nullable = false)
    private String descricao;
}
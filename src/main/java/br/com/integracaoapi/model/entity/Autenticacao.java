package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "autenticacao", schema = "public")
public class Autenticacao {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 50)
    @Column(name = "username", length = 50, nullable = false)
    private String username;

    @NotNull
    @Column(name = "password", columnDefinition = "TEXT", nullable = false)
    private String password;
}
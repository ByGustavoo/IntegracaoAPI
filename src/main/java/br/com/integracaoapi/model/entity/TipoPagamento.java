package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tipopagamento", schema = "public")
public class TipoPagamento {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Size(max = 30)
    @Column(name = "descricao", length = 30, nullable = false)
    private String descricao;

    @NotNull
    @Column(name = "banco", nullable = false)
    private Boolean banco;

    @NotNull
    @Column(name = "cheque", nullable = false)
    private Boolean cheque;

    @NotNull
    @Column(name = "quantidadedias", nullable = false)
    private Integer quantidadeDias;

    @NotNull
    @Column(name = "boleto", nullable = false)
    private Boolean boleto = false;

    @NotNull
    @Column(name = "docted", nullable = false)
    private Boolean docted = false;

    @NotNull
    @Column(name = "debitocc", nullable = false)
    private Boolean debitocc = false;
}
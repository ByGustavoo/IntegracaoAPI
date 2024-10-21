package br.com.integracaoapi.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tiporecebimento", schema = "public")
public class TipoRecebimento {

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
    private Boolean banco = false;

    @NotNull
    @Column(name = "geraabatimentocontrato", nullable = false)
    private Boolean geraAbatimentoContrato = false;

    @NotNull
    @Column(name = "cheque", nullable = false)
    private Boolean cheque = false;

    @NotNull
    @Column(name = "cartao", nullable = false)
    private Boolean cartao = false;

    @NotNull
    @Column(name = "dinheiro", nullable = false)
    private Boolean dinheiro = false;

    @NotNull
    @Column(name = "descargapalete", nullable = false)
    private Boolean descargaPalete = false;

    @NotNull
    @Column(name = "boleto", nullable = false)
    private Boolean boleto = false;
}
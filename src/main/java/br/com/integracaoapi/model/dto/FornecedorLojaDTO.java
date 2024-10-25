package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FornecedorLojaDTO {

    private Integer id;

    @NotNull
    @Size(max = 40)
    private String razaoSocial;

    @NotNull
    @Size(max = 30)
    private String nomeFantasia;

    public FornecedorLojaDTO(Integer id, String razaoSocial, String nomeFantasia) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
    }
}
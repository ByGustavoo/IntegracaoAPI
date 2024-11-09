package br.com.integracaoapi.exceptions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.FieldError;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BadRequestDTO {

    private String campo;

    private String mensagem;

    public BadRequestDTO(FieldError fieldError) {
        this.campo = fieldError.getField();
        this.mensagem = fieldError.getDefaultMessage();
    }
}
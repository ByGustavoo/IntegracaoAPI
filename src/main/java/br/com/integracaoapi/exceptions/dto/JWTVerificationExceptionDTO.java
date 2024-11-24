package br.com.integracaoapi.exceptions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JWTVerificationExceptionDTO {

    private int statusCode;
    private String error;
    private String message;
    private String details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime timestamp;

    public JWTVerificationExceptionDTO(String errorMessage) {
        this.statusCode = 403;
        this.error = "Forbidden";
        this.message = "Erro na verificação do Token de Autenticação!";
        this.details = errorMessage;
        this.timestamp = LocalDateTime.now();
    }
}
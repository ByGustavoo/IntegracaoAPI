package br.com.integracaoapi.exceptions.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class AuthenticationExceptionResponseDTO {

    private int status;
    private String error;
    private String message;
    private String details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime timestamp;

    public AuthenticationExceptionResponseDTO(int status, String error, String message, String details) {
        this.status = status;
        this.error = error;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public static AuthenticationExceptionResponseDTO authenticationExceptionResponseDTO = new AuthenticationExceptionResponseDTO(
            401,
            "Unauthorized",
            "Credenciais Inválidas!",
            "Não foi possível autenticar o usuário com as credenciais informadas!"
    );
}
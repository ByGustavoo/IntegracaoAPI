package br.com.integracaoapi.infra.security.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class AuthenticationResponseDTO {

    private int statusCode;
    private String message;
    private String details;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy - HH:mm:ss")
    private LocalDateTime timestamp;

    public AuthenticationResponseDTO(int statusCode, String message, String details, LocalDateTime timestamp) {
        this.statusCode = statusCode;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }

    public static AuthenticationResponseDTO authenticationResponseDTO = new AuthenticationResponseDTO(
            200,
            "Ok!",
            "O Usuário foi criado com sucesso!",
            LocalDateTime.now()
    );
}
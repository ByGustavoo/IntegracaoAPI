package br.com.integracaoapi.exceptions;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public class ExceptionResponse {

    private int statusCode;
    private String error;
    private String message;
    private String details;
    private LocalDateTime timestamp;

   public ExceptionResponse(int statusCode, String error, String message, String details) {
        this.statusCode = statusCode;
        this.error = error;
        this.message = message;
        this.details = details;
        this.timestamp = LocalDateTime.now();
    }
}
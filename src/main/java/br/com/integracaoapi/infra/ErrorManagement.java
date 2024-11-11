package br.com.integracaoapi.infra;

import br.com.integracaoapi.exceptions.dto.ExceptionResponseDTO;
import br.com.integracaoapi.exceptions.dto.BadRequestDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorManagement {

    ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
            404,
            "Not Found",
            "Resource not found",
            "The resource you are looking for was not found"
    );

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> notFoundException() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> badRequestException(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(BadRequestDTO::new).toList());
    }
}
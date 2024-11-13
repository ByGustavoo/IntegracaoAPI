package br.com.integracaoapi.exceptions;

import br.com.integracaoapi.exceptions.dto.NotFoundResponseDTO;
import br.com.integracaoapi.exceptions.dto.BadRequestResponseDTO;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorManagement {

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<?> notFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(NotFoundResponseDTO.notFoundResponseDTO);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> badRequestException(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(BadRequestResponseDTO::new).toList());
    }
}
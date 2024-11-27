package br.com.integracaoapi.exceptions;

import br.com.integracaoapi.exceptions.dto.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorManagement {

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> notFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(NotFoundResponseDTO.notFoundResponseDTO);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> badRequestException(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(BadRequestResponseDTO::new).toList());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> httpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<?> invalidCredentialsException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(BadCredentialsResponseDTO.badCredentialsResponseDTO);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<?> authenticationException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(AuthenticationResponseDTO.authenticationResponseDTO);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<?> accessDeniedException() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ForbiddenResonseDTO.forbiddenResponseDTO);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> internalServerErrorException(Exception ex) {
        InternalServerErrorResponseDTO internalServerErrorResponseDTO = new InternalServerErrorResponseDTO(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "Internal Server Error",
                "Ocorreu um erro interno no Servidor! Por favor, tente novamente.",
                ex.getLocalizedMessage());

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(internalServerErrorResponseDTO);
    }
}
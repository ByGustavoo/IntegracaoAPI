package br.com.integracaoapi.exceptions;

import br.com.integracaoapi.exceptions.dto.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.IOException;

@RestControllerAdvice
public class ErrorManagement implements AuthenticationEntryPoint {

    @Autowired
    private ObjectMapper objectMapper;

    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<?> notFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(NotFoundExceptionResponseDTO.notFoundExceptionResponseDTO);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> badRequestException(MethodArgumentNotValidException ex) {
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(BadRequestExceptionResponseDTO::new).toList());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> httpMessageNotReadableException(HttpMessageNotReadableException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

    @ExceptionHandler(BadCredentialsException.class)
    public ResponseEntity<?> invalidCredentialsException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(BadCredentialsExceptionResponseDTO.badCredentialsExceptionResponseDTO);
    }

    @ExceptionHandler(AuthenticationException.class)
    public ResponseEntity<?> authenticationException() {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(BadCredentialsExceptionResponseDTO.badCredentialsExceptionResponseDTO);
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ResponseEntity<?> accessDeniedException() {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(ForbiddenExceptionResonseDTO.forbiddenResponseDTO);
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

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException {
        TokenExceptionResponseDTO tokenExceptionResponseDTO = TokenExceptionResponseDTO.requestWithoutTokenResponseDTO;

        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setContentType("application/json");

        response.getWriter().write(objectMapper.writeValueAsString(tokenExceptionResponseDTO));
    }
}
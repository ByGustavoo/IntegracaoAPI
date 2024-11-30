package br.com.integracaoapi.infra.security.config;

import br.com.integracaoapi.exceptions.dto.TokenExceptionResponseDTO;
import br.com.integracaoapi.infra.security.repository.AutenticacaoRepository;
import br.com.integracaoapi.infra.security.service.TokenService;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private AutenticacaoRepository autenticacaoRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            var token = getToken(request);

            if (token != null) {
                var subject = tokenService.getSubject(token);
                var usuario = autenticacaoRepository.findByUsername(subject);

                if (usuario != null) {
                    var authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities());
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            }

            filterChain.doFilter(request, response);
        }
        catch (TokenExpiredException ex) {
            expiredTokenResponse(response);
        }
        catch (JWTVerificationException ex) {
            invalidTokenResponseDTO(response);
        }
    }

    private String getToken(HttpServletRequest request) {
        var authorizationHeader = request.getHeader("Authorization");

        if (authorizationHeader != null) {
            return authorizationHeader.replace("Bearer ", "");
        }

        return null;
    }

    private void expiredTokenResponse(HttpServletResponse response) throws IOException {
        TokenExceptionResponseDTO expiredTokenResponseDTO = TokenExceptionResponseDTO.expiredTokenResponseDTO;

        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.setContentType("application/json;charset=UTF-8");

        response.getWriter().write(objectMapper.writeValueAsString(expiredTokenResponseDTO));
    }

    private void invalidTokenResponseDTO(HttpServletResponse response) throws IOException {
        TokenExceptionResponseDTO invalidTokenResponseDTO = TokenExceptionResponseDTO.invalidTokenResponseDTO;

        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.setContentType("application/json;charset=UTF-8");

        response.getWriter().write(objectMapper.writeValueAsString(invalidTokenResponseDTO));
    }
}
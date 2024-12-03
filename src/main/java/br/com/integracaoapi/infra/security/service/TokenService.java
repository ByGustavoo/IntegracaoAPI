package br.com.integracaoapi.infra.security.service;

import br.com.integracaoapi.infra.security.model.dto.AutenticacaoDTO;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    @Value("${integracao.api.security.jwt.secret}")
    private String secret;

    public String generateToken(AutenticacaoDTO autenticacaoDTO) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            return JWT.create()
                    .withIssuer("Integração API")
                    .withSubject(autenticacaoDTO.getUsername())
                    .withExpiresAt(expirationDate())
                    .sign(algorithm);
        }
        catch (JWTCreationException ex) {
            throw new RuntimeException("Ocorreu um erro ao gerar o Token!", ex);
        }
    }

    public String getSubject(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(secret);

            return JWT.require(algorithm)
                    .withIssuer("Integração API")
                    .build()
                    .verify(token)
                    .getSubject();
        }
        catch (JWTVerificationException ex) {
            throw new JWTVerificationException("O Token de acesso está inválido ou expirado!", ex);
        }
    }

    private Instant expirationDate() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
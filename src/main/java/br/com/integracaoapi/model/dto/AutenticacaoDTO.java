package br.com.integracaoapi.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AutenticacaoDTO {

    private Integer id;

    @NotNull
    @Size(max = 50)
    private String username;

    @NotNull
    private String password;

    public UsernamePasswordAuthenticationToken convertAuthentication() {
        return new UsernamePasswordAuthenticationToken(this.username, this.password);
    }
}
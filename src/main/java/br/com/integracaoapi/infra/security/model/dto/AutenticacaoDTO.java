package br.com.integracaoapi.infra.security.model.dto;

import br.com.integracaoapi.infra.security.model.entity.Autenticacao;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AutenticacaoDTO {

    private Integer id;

    @Email
    @Size(max = 255)
    @NotBlank(message = "{username.obrigatorio}")
    private String username;

    @NotBlank(message = "{password.obrigatorio}")
    private String password;

    public AutenticacaoDTO(Autenticacao autenticacao) {
        this.id = autenticacao.getId();
        this.username = autenticacao.getUsername();
        this.password = autenticacao.getPassword();
    }

    public Autenticacao toEntity() {
        Autenticacao autenticacao = new Autenticacao();
        autenticacao.setId(this.id);
        autenticacao.setUsername(this.username);
        autenticacao.setPassword(this.password);
        return autenticacao;
    }

    public UsernamePasswordAuthenticationToken convertAuthentication() {
        return new UsernamePasswordAuthenticationToken(this.username, this.password);
    }
}
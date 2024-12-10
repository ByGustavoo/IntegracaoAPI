package br.com.integracaoapi.controller;

import br.com.integracaoapi.model.dto.FornecedorDTO;
import br.com.integracaoapi.service.FornecedorService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class FornecedorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FornecedorService fornecedorService;

    @Autowired
    private JacksonTester<FornecedorDTO> fornecedorDTO;

    @Autowired
    private JacksonTester<FornecedorDTO> responseFornecedorDTO;

    @Test
    @WithMockUser
    @DisplayName("Deve retornar todos os Fornecedores")
    void getAll() throws Exception {
        var response = mockMvc.perform(get("/fornecedor/v1"))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
    }

//    @Test
//    @WithMockUser
//    @DisplayName("Deve salvar um Fornecedor")
//    void saveFornecedor() throws Exception {
//
//        var savedFornecedorResponse = new FornecedorDTO();
//        when(fornecedorService.saveFornecedor(any())).thenReturn(savedFornecedorResponse);
//
//        var response = mockMvc.perform(post("/fornecedor/v1")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .content(fornecedorDTO.write(new FornecedorDTO()).getJson()))
//                .andReturn().getResponse();
//
//        var json = fornecedorDTO.write(savedFornecedorResponse).getJson();
//
//        assertThat(response.getStatus()).isEqualTo(HttpStatus.OK.value());
//        assertThat(response.getContentAsString()).isEqualTo(json);
//    }

    @Test
    @DisplayName("Deve retornar código 403 ao tentar acessar a endpoint sem Token")
    void requestWithoutToken() throws Exception {
        var response = mockMvc.perform(get("/fornecedor/v1"))
                .andReturn().getResponse();

        assertThat(response.getStatus()).isEqualTo(HttpStatus.FORBIDDEN.value());
    }
}
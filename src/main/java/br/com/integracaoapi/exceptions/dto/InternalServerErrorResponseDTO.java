package br.com.integracaoapi.exceptions.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InternalServerErrorResponseDTO {

        private int status;
        private String error;
        private String message;

        @JsonProperty("Exception")
        private String details;

        public InternalServerErrorResponseDTO(int status, String error, String message, String details) {
            this.status = status;
            this.error = error;
            this.message = message;
            this.details = details;
        }
}
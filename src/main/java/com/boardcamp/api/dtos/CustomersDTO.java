package com.boardcamp.api.dtos;

import org.hibernate.validator.constraints.br.CPF;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomersDTO {
    @NotBlank(message = "Name is mandatory!")
    private String name;

    @NotBlank(message = "Cpf is mandatory!")
    @CPF
    private String cpf;
}

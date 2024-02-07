package com.boardcamp.api.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class GamesDTO {

    @NotBlank(message = "Name is mandatory!")
    private String name;

    @NotBlank()
    private String image;
    
    @NotNull()
    private Long stockTotal;

    @NotNull()
    private Long pricePerDay;
}

package com.boardcamp.api.dtos;

import java.time.LocalDate;

import com.boardcamp.api.models.CustomersModel;
import com.boardcamp.api.models.GamesModel;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RentalsDTO {
    @NotNull(message = "CustomerId is mandatory!")
    private CustomersModel customerId;

    @NotNull(message = "GameId is mandatory!")
    private GamesModel gameId;

    @NotNull(message = "rentDate is mandatory!")
    private LocalDate rentDate;

    @NotNull(message = "Days rented is mandatory")
    private Long daysRented;

    @NotNull()
    private LocalDate returnDate;

    @NotNull(message = "Price must be at least 0.")
    private Long originalPrice;

    @Min(value = 0, message = "DelayFee must be at least 0.")
    private Long delayFee;
}

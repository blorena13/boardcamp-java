package com.boardcamp.api.models;

import java.time.LocalDate;

import com.boardcamp.api.dtos.RentalsDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "rentals")
public class RentalsModel {

    public RentalsModel(RentalsDTO dto, CustomersModel customer, GamesModel games) {
        this.customerId = customer;
        this.gameId =  games;
        this.rentDate = dto.getRentDate();
        this.daysRented = dto.getDaysRented();
        this.returnDate = dto.getReturnDate();
        this.originalPrice = dto.getOriginalPrice();
        this.delayFee = dto.getDelayFee();
    }  

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private CustomersModel customerId;

    @Column(nullable = false)
    private GamesModel gameId;

    @Column(nullable = false)
    private LocalDate rentDate;

    @Column(nullable = false)
    private Long daysRented;

    private LocalDate returnDate;

    @Column(nullable = false)
    private Long originalPrice;

    @Column(nullable = false)
    private Long delayFee;
}

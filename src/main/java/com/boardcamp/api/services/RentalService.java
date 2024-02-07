package com.boardcamp.api.services;

import java.util.List;

import com.boardcamp.api.models.RentalsModel;
import com.boardcamp.api.repositories.RentalRepository;

public class RentalService {
    final RentalRepository rentalRepository;

    RentalService(RentalRepository rentalRepository){
        this.rentalRepository = rentalRepository;
    }

    public List<RentalsModel> findAll(){
        return rentalRepository.findAll();
    }
}

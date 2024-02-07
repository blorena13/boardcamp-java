package com.boardcamp.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boardcamp.api.models.CustomersModel;

@Repository
public interface CustomerRepository extends JpaRepository<CustomersModel, Long>{ 

}

package com.boardcamp.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boardcamp.api.models.GamesModel;

@Repository
public interface GameRepository extends JpaRepository<GamesModel, Long>{
    
}

package com.boardcamp.api.services;

import java.util.List;
import java.util.Optional;

import com.boardcamp.api.dtos.GamesDTO;
import com.boardcamp.api.models.GamesModel;
import com.boardcamp.api.repositories.GameRepository;

public class GameService {
    final GameRepository gameRepository;

    GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    // public Optional<GamesModel> save(GamesDTO dto){

    // }

    public List<GamesModel> findAll(){
        return gameRepository.findAll();
    }
}

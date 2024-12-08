package com.example.game_service.services.impl;

import com.example.game_service.commons.entities.Game;
import com.example.game_service.commons.exceptions.GameExeption;
import com.example.game_service.repositories.GameRepository;
import com.example.game_service.services.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {

    private final GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public Game saveGame(Game gameRequest) {
        return this.gameRepository.save(gameRequest);
    }

    @Override
    public Game getGameById(String id) {
        return this.gameRepository.findById(Long.valueOf(id)).orElseThrow(() -> new GameExeption(HttpStatus.NOT_FOUND, "Game not found"));
    }
}
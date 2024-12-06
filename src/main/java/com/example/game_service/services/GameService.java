package com.example.game_service.services;

import com.example.game_service.entities.Game;
import com.example.game_service.repositories.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public Game saveGame(Game gameRequest) {
        Game gameCreatedInDatabase = this.gameRepository.save(gameRequest);
        return gameCreatedInDatabase;
    }
}

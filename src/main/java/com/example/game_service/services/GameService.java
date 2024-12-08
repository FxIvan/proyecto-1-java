package com.example.game_service.services;

import com.example.game_service.commons.entities.Game;
import org.springframework.http.ResponseEntity;

public interface GameService {
    Game saveGame(Game gameRequest);
    Game getGameById(String id);
}
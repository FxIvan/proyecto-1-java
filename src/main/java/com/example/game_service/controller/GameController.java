package com.example.game_service.controller;

import com.example.game_service.entities.Game;
import com.example.game_service.services.GameService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")

public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<Game> saveGame(@RequestBody Game game){
        Game gameCreated = this.gameService.saveGame(game);
        return ResponseEntity.ok(gameCreated);
    }
}

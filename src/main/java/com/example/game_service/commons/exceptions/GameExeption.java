package com.example.game_service.commons.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter // Para en el controller poder acceder a los atributos
public class GameExeption extends RuntimeException {
    private HttpStatus httpStatus;
    public GameExeption(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }
}

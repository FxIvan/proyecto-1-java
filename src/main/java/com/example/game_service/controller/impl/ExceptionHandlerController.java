package com.example.game_service.controller.impl;

import com.example.game_service.commons.dto.ErrorResponse;
import com.example.game_service.commons.exceptions.GameExeption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j //permite hacer los console.log
public class ExceptionHandlerController {
    @ExceptionHandler(value = {GameExeption.class})

    ResponseEntity<ErrorResponse> handlerError(GameExeption gameException){

        log.error("new Exception: ", gameException);
        var errorResponse = ErrorResponse.builder()
                .codeStatus(gameException.getHttpStatus().value())
                .message(gameException.getMessage())
                .build();
        return ResponseEntity.status(gameException.getHttpStatus()).body(errorResponse);
    }
}

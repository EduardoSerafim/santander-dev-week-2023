package me.dio.desafiojavaapi.controller.exception;

import me.dio.desafiojavaapi.domain.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handle(IllegalArgumentException businessException){
        return new ResponseEntity<>(businessException.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY) ;
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handle(NoSuchElementException notFoundException){
        return new ResponseEntity<>("Resource ID not found", HttpStatus.NOT_FOUND) ;
    }

//    @ExceptionHandler(Throwable.class)
//    public ResponseEntity<String> handleUnexpectedException(Throwable unexpectedException){
//        return new ResponseEntity<>("Unexpected Server Error, see the logs", HttpStatus.INTERNAL_SERVER_ERROR) ;
//    }


}

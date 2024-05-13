package dev.durgesh.EcomProductService.exception;

import dev.durgesh.EcomProductService.controller.CartController;
import dev.durgesh.EcomProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = CartController.class) //to know from which class
public class CartControllerExceptionHandler {
    @ExceptionHandler(CartNotFoundException.class)// which particular exception wants to handle
    public ResponseEntity handleCartNotFoundException(CartNotFoundException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        ); //404 is http code
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(RandomException.class)// which particular exception wants to handle
    public ResponseEntity handleCartRandomException(RandomException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        ); //404 is http code
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}

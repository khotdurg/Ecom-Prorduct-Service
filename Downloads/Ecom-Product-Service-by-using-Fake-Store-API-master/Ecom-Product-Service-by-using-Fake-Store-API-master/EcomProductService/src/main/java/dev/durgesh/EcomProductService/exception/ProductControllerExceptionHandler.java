package dev.durgesh.EcomProductService.exception;

import dev.durgesh.EcomProductService.controller.ProductController;
import dev.durgesh.EcomProductService.dto.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackageClasses = ProductController.class)
public class ProductControllerExceptionHandler {   //in 1st handle we handle same e
    @ExceptionHandler({ProductNotFoundException.class, NoProductPresentException.class})// which particular exception wants to handle
    public ResponseEntity handleProductNotFoundException(ProductNotFoundException pe){ //variable could be anything
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        ); //404 is http code
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(InvalidInputException.class)// which particular exception wants to handle
    public ResponseEntity handleInvalidInputException(InvalidInputException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                400
        ); //404 is http code
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RandomException.class)// which particular exception wants to handle
    public ResponseEntity handleProductRandomException(RandomException pe){
        ExceptionResponseDTO exceptionResponseDTO = new ExceptionResponseDTO(
                pe.getMessage(),
                404
        ); //404 is http code
        return new ResponseEntity<>(exceptionResponseDTO, HttpStatus.NOT_FOUND);
    }
}

package com.blogapp12.exception;

import com.blogapp12.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResourceNotFound.class)
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(

            ResourceNotFound e , WebRequest webRequest
    ){
        ErrorDetails error = new ErrorDetails( new Date() , e.getMessage()  , webRequest.getDescription(false));
        return  new ResponseEntity<>(error , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> globalExceptionHandler(

            Exception e , WebRequest webRequest
    ){
        ErrorDetails er = new ErrorDetails(new Date() , e.getMessage(), webRequest.getDescription(true));
        return  new ResponseEntity<>(er , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

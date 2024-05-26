package com.example.demo.SpringBoot1.Exceptions;

import com.example.demo.SpringBoot1.entity.ErrorMessage;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
@ResponseStatus
public class RestEntityException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(DepartmentNotFound.class)
    public ResponseEntity<ErrorMessage>  departmentNotFound(@NotNull DepartmentNotFound exception, WebRequest request){
    ErrorMessage message = new ErrorMessage(HttpStatus.NOT_FOUND,exception.getMessage());

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }

}

package com.ale.sneakerstoreapi.util.exception;

import com.ale.sneakerstoreapi.util.MessageContent;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.data.mapping.PropertyReferenceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class AppExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return errors;
    }

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler({AccessDeniedException.class})
    public void handleAccessDeniedException(Exception ex) {
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ PropertyReferenceException.class, IllegalArgumentException.class})
    public Map<String, String> handleRequest(Exception e) {
        e.printStackTrace();
        Map<String, String> errors = new HashMap<>();
        errors.put("message", e.getMessage());
        return errors;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ AppException.class})
    public Map<String, String> handleAppException(AppException e) {
        e.printStackTrace();
        Map<String, String> errors = new HashMap<>();
        errors.put("message", e.getMessage());
        return errors;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler({ Exception.class })
    public Map<String, String> handleException(Exception e) {
        e.printStackTrace();
        Map<String, String> errors = new HashMap<>();
        errors.put("message", MessageContent.UNKNOWN_ERROR);
        return errors;
    }
}

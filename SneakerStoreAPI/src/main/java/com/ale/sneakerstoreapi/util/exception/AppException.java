package com.ale.sneakerstoreapi.util.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AppException extends RuntimeException{
    private String message;
}

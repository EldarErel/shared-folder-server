package com.project.sharedfolderserver.utils.http.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
public class BaseError extends RuntimeException {
    private String message;
    private HttpStatus status;
}

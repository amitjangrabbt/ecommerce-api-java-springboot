package com.bytequest.ecommerce.respone;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CustomResponseEntity<T> {

    private String message;
    private T data;

    public CustomResponseEntity(String message, T data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> ResponseEntity<CustomResponseEntity<T>> ok(String message, T data) {
        CustomResponseEntity<T> responseEntity = new CustomResponseEntity<>(message, data);
        return new ResponseEntity<>(responseEntity, HttpStatus.OK);
    }

    public static <T> ResponseEntity<CustomResponseEntity<T>> created(String message, T data) {
        CustomResponseEntity<T> responseEntity = new CustomResponseEntity<>(message, data);
        return new ResponseEntity<>(responseEntity, HttpStatus.CREATED);
    }

    public static <T> ResponseEntity<CustomResponseEntity<T>> badRequest(String message, T data) {
        CustomResponseEntity<T> responseEntity = new CustomResponseEntity<>(message, data);
        return new ResponseEntity<>(responseEntity, HttpStatus.BAD_REQUEST);
    }

    // Add more custom response methods as needed

}


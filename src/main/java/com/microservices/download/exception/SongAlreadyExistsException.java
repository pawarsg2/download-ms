package com.microservices.download.exception;

public class SongAlreadyExistsException  extends RuntimeException {
    private String message;
    public SongAlreadyExistsException(String message) {
        super(message);
        this.message = message;
    }
    public SongAlreadyExistsException() {
    }

}

package com.group.backend.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id){
        super("User could not be found with id " + id);
    }
}

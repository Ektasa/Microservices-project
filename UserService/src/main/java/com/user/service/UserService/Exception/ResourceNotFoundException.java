package com.user.service.UserService.Exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("resource not found me, fieldName, fieldValue");
    }


    public ResourceNotFoundException(String message) {
        super("%s not found with %s : '%s'"+message);

    }
}

package com.swl.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @version 1.0.0
 * @description
 * @author: SanWaiLwin
 * @date: 4/13/2024 4:39 PM
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyException extends RuntimeException{

    public CustomerAlreadyException(String message){
        super(message);
    }
}

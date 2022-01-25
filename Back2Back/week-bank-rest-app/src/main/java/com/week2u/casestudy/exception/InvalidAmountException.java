package com.week2u.casestudy.exception;

public class InvalidAmountException extends RuntimeException
{
    public InvalidAmountException(String message) {
        super(message);
    }
}

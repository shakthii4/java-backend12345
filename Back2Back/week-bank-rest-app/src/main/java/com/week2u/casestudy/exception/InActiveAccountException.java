package com.week2u.casestudy.exception;

public class InActiveAccountException extends RuntimeException
{
    public InActiveAccountException(String message) {
        super(message);
    }
}

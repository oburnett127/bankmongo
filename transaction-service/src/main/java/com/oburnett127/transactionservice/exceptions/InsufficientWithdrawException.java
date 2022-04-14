package com.oburnett127.transactionservice.exceptions;

public class InsufficientWithdrawException extends RuntimeException {
    public InsufficientWithdrawException(){
        super("Insufficient funds. Cannot withdraw the requested amount.");
    }
}

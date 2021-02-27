package com.hcl.payment.sanction.exception;

public class SanctionException extends Exception {
    public SanctionException(String msg){
        super("Payment exception"+msg);
    }
}

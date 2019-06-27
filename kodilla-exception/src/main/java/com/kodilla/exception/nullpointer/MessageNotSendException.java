package com.kodilla.exception.nullpointer;

public class MessageNotSendException extends Exception {
    public MessageNotSendException(String message) {
        super(message);
    }
}

package com.mile1.exception;

public class NullNameException extends Throwable {
    @Override
    public String toString() {
        return "name is null";
    }
}

package com.mile1.exception;

public class NullStudentObjectException extends Throwable {
    @Override
    public String toString() {
        return "object is null";
    }
}

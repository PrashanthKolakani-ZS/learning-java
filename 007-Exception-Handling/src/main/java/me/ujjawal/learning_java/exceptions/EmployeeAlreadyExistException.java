package me.ujjawal.learning_java.exceptions;

public class EmployeeAlreadyExistException extends Exception{
    public EmployeeAlreadyExistException() {
    }

    public EmployeeAlreadyExistException(String message) {
        super(message);
    }
}

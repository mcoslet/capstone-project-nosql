package com.gridu.capstone.exception;

public class InvalidDatabaseNameException extends Exception{
    public InvalidDatabaseNameException(){
        super();
    }

    public InvalidDatabaseNameException(String msg){
        super(msg);
    }
}

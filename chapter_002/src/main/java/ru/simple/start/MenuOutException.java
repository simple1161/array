package ru.simple.start;

public class MenuOutException extends RuntimeException  {
    public MenuOutException(){
    }
    public MenuOutException(String msg){
        super(msg);
    }
}

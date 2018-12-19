package ru.simple.tracker.start;

public class MenuOutException extends RuntimeException  {
    public MenuOutException(){
    }
    public MenuOutException(String msg){
        super(msg);
    }
}

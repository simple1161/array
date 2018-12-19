package ru.simple.tracker.start;

public interface Input {
    String ask(String question);
    int ask(String question, int[] range) throws MenuOutException;
}

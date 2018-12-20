package ru.simple.start;

import java.util.Scanner;

public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
    @Override
    public int ask(String question, int[] range) throws MenuOutException {
        System.out.print(question);
        int key = Integer.valueOf(scanner.nextLine());
        boolean exist = false;
        for(int value: range){
            if(value == key){
                exist = true;
                break;
            }
        }
        if (exist){
            return key;
        }else {
            throw new MenuOutException();
        }

    }
}

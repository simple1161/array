package ru.simple.start;

public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = 0;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            }catch (MenuOutException moe){
                System.out.println("Выбрирете значение из диапазона");
            }
            catch (NumberFormatException nfp){
                System.out.println("Необходимо ввести корректное значение");
            }
        }while (invalid);
        return value;
    }
}


package ru.simple.start;

public class ValidateInput implements Input {
    private final Input input;

    public ValidateInput(final Input input) {
        this.input = input;
    }

    @Override
    public String ask(String question) {
        return this.input.ask(question);
    }

    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = 0;
        do {
            try {
                value = input.ask(question, range);
                invalid = false;
            }catch (MenuOutException moe){
                System.out.println("Выбрирете значение из диапазона");
                invalid = false;
            }
            catch (NumberFormatException nfp){
                System.out.println("Необходимо ввести корректное значение");
            }
        }while (invalid);
        return value;
    }
}

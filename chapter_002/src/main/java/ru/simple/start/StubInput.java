package ru.simple.start;

public class StubInput implements Input {

    private final String[] value;

    private int position = 0;

    public StubInput(final String[] value) {
        this.value = value;
    }

    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

    @Override
    public int ask(String question, int[] range){
        boolean key = false;
        for(int i = 0; i<this.value.length; i++){
            for(int j = 0; j<range.length; j++){
                if(value[i].equals(String.valueOf(range[j]))){
                    key = true;
                }
            }
        }
        if(key){
            return Integer.valueOf(this.value[this.position++]);
        }else {
            throw new MenuOutException();
        }
    }
}

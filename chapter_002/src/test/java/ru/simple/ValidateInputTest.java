package ru.simple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.simple.start.StubInput;
import ru.simple.start.ValidateInput;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ValidateInputTest {
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    @Test
    public void whenInvalidInputWord() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"invalid", "1"})
        );
        input.ask("Enter", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Необходимо ввести корректное значение%n")
                )
        );
    }

    @Test
    public void whenInvalidInputValue() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"50", "invalid"})
        );
        input.ask("Enter", new int[] {1, 2, 3, 4, 5, 6});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Выбрирете значение из диапазона%n")
                )
        );
    }

}

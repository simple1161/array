package ru.simple;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.simple.pseudo.Paint;
import ru.simple.pseudo.Square;
import ru.simple.pseudo.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append("+  +")
                                .append("+  +")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                new String(this.out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("  ^  ")
                                .append(" ^ ^ ")
                                .append("^^^^^")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }

}


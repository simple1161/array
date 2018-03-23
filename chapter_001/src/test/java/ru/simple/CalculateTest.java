package ru.simple;


import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Class Класс для вычисления арефметических операций
* @author semenov
* @since 22.03.2018
* @version 1
*/
public class CalculateTest {
	/**
	*Тест
	*/
	@Test
	public void whenTakeNameThenTreeEchoPlusName() {
		String input = "Semenov";
    	String expect = "Echo, echo, echo : Semenov"; 
    	Calculate calc = new Calculate();
    	String result = calc.echo(input);
    	assertThat(result, is(expect));
	}
}
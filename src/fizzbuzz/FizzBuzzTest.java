package fizzbuzz;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	public void that100LinesAreGenerated() {
		List<String> lines = fizzbuzz.fizzbuzz();

		assertEquals(100, lines.size());
	}

	@Test
	public void thatNumbersAreGenerated() {
		List<String> lines = fizzbuzz.fizzbuzz();

		assertEquals("1", lines.get(0));
		assertEquals("2", lines.get(1));
		assertEquals("4", lines.get(3));
		assertEquals("7", lines.get(6));
		assertEquals("98", lines.get(97));
	}

	@Test
	public void fizzTest() {
		List<String> lines = fizzbuzz.fizzbuzz();
		assertEquals("fizz", lines.get(2));
		assertEquals("fizz", lines.get(5));
		assertEquals("fizz", lines.get(8));
	}

	@Test
	public void buzzTest() {
		List<String> lines = fizzbuzz.fizzbuzz();
		assertEquals("buzz", lines.get(4));
		assertEquals("buzz", lines.get(9));
		assertEquals("buzz", lines.get(19));
		assertEquals("buzz", lines.get(99));
	}

	@Test
	public void fizzbuzzTest() {
		List<String> lines = fizzbuzz.fizzbuzz();
		assertEquals("fizz&buzz", lines.get(14));
		assertEquals("fizz&buzz", lines.get(29));
		assertEquals("fizz&buzz", lines.get(44));
	}
}

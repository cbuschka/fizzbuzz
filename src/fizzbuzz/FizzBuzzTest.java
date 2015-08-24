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

}

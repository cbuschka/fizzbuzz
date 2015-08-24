package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzbuzz() {
		List<String> lines = new ArrayList<>();

		int x = 0;
		while (x < 100) {
			x++;

			if (isDividable(x, 3) && isDividable(x, 5)) {
				lines.add("fizz&buzz");
			} else {

				if (isDividable(x, 3)) {
					lines.add("fizz");
				} else {
					if (isDividable(x, 5)) {
						lines.add("buzz");
					} else {
						lines.add("" + x);
					}
				}
			}
		}

		return lines;
	}

	private static boolean isDividable(int a, int divisor) {
		return (a % divisor == 0);
	}
}
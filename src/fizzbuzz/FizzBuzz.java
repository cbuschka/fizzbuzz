package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzbuzz() {
		List<String> lines = new ArrayList<>();

		int x = 0;
		while (x < 100) {
			x++;

			if (isFizzBuzz(x)) {
				lines.add("fizz&buzz");
			} else {

				if (isFizz(x)) {
					lines.add("fizz");
				} else {
					if (isBuzz(x)) {
						lines.add("buzz");
					} else {
						lines.add("" + x);
					}
				}
			}
		}

		return lines;
	}

	private boolean isBuzz(int x) {
		return isDividable(x, 5);
	}

	private boolean isFizz(int x) {
		return isDividable(x, 3);
	}

	private boolean isFizzBuzz(int x) {
		return isFizz(x) && isBuzz(x);
	}

	private static boolean isDividable(int a, int divisor) {
		return (a % divisor == 0);
	}
}
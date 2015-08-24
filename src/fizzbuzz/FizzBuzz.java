package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public List<String> fizzbuzz() {
		List<String> lines = new ArrayList<>();

		int x = 0;
		while (x < 100) {
			x++;

			int rest3 = (x % 3);
			int rest5 = (x % 5);

			if (rest3 == 0 && rest5 == 0) {
				lines.add("fizz&buzz");
			} else {

				if (rest3 == 0) {
					lines.add("fizz");
				} else {
					if (rest5 == 0) {
						lines.add("buzz");
					} else {
						lines.add("" + x);
					}
				}
			}
		}

		return lines;
	}
}
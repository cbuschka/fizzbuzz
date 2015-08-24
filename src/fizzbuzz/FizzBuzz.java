package fizzbuzz;

public class FizzBuzz {
	public static void main(String[] args) {

		int x = 0;
		while (x < 100) {
			x++;

			// int rest35 = (x%15);
			// if (rest35==0)
			// System.out.println("fizz&buzz");
			// }

			int rest3 = (x % 3);
			if (rest3 == 0) {
				System.out.println("fizz");
			} else {

				int rest5 = (x % 5);
				if (rest5 == 0) {
					System.out.println("buzz");
				} else {
					System.out.println(x);

				}
			}
		}
	}
}

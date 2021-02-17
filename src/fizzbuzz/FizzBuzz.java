package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(9);
		fizzBuzz(10);
		fizzBuzz(15);

	}

	public static void fizzBuzz(int a) {
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("FizzBuzz");
		} else if (a % 3 == 0) {
			System.out.println("Fizz");
			;
		} else if (a % 5 == 0) {
			System.out.println("Buzz");
			;
		}

	}

}

package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(9));
		System.out.println(fizzBuzz(10));
		System.out.println(fizzBuzz(15));
		System.out.println(fizzBuzz(19));

	}

	public static String fizzBuzz(int a) {
		if (a % 3 == 0 && a % 5 == 0) {
			return "FizzBuzz";
		} else if (a % 3 == 0) {
			return "Fizz";
		} else if (a % 5 == 0) {
			return "Buzz";
		} else {
			return String.valueOf(a);

		}

	}

}

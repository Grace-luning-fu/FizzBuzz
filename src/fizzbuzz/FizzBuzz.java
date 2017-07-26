package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This is a program that prints the numbers from 1 to 100.
		 * But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
		 * For numbers which are multiples of both three and five print “FizzBuzz”
		 * 
		 * @author Grace
		 * 
		 ***/
		// loop from number 1 to 100
		for (int counter = 1; counter <= 100; counter++) {
			// If the number is a multiple of 3, display "Fizz"
			if (counter % 3 == 0 && counter % 5 != 0) {
				System.out.println("Fizz!");
			}

			//If the number is a multiple of 5, display "Buzz"
			else if (counter % 5 == 0 && counter % 3 != 0) {
				System.out.println("Buzz!");

			}

			// If the number is a multiple of both 3 and 5, display "FizzBuzz"
			else if (counter % 5 == 0 && counter % 3 == 0) {
				System.out.println("FizzBuzz!");

			}
            // print the number if neither
			else {
				System.out.println(counter);
			}
		}

	}

}


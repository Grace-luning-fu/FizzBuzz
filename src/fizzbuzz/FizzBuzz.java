package fizzbuzz;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * This is a program that prints the numbers from 1 to 100. 
		 * But for multiples of 3, print “Fizz” instead of the number; 
		 * for multiples of 5, print “Buzz”. 
		 * for numbers which are multiples of both 3 and 5, print “FizzBuzz”
		 * 
		 * @author Grace
		 * 
		 ***/
		// loop from number 1 to 100
		for (int counter = 1; counter <= 100; counter++) {
			
			//Initialize an empty string 
			String PrintOut = "";
		
			// If the number is a multiple of 3, display "Fizz"
			if (counter % 3 == 0) {
				PrintOut += "Fizz";
			}

			// If the number is a multiple of 5, display "Buzz"
			if (counter % 5 == 0) {
				PrintOut += "Buzz";
			}

			// If not the above conditions, convert the integer into string and print the integer as string
			if(counter % 3 !=0 && counter % 5 !=0){
				PrintOut = "" + counter; 
			}
			
			System.out.println(PrintOut);
		}

	}

}


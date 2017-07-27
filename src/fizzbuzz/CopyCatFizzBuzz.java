package fizzbuzz;

public class CopyCatFizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 
		 * This is a program that prints the numbers from 1 to 100. 
		 * But for multiples of 3, print “Fizz” instead of the number; 
		 * for multiples of 5, print/add “Buzz”;
		 * for multiple of 2, print/add "copy";
		 * for multiple of 10, print/add "cat" 
		 * 
		 * @author Grace
		 * 
		 **/
			
		// loop from number 1 to 100
		for (int counter = 1; counter <= 100; counter++) {
			//Initialize an empty string 
			String PrintOut = "";
		
			// If the number is a multiple of 2, display "Copy"
			if (counter % 2 == 0) {
				PrintOut += "Copy";
			}
			
			// If the number is a multiple of 3, also display "Fizz"
			if (counter % 3 == 0) {
				PrintOut += "Fizz";
			}

			// If the number is a multiple of 5, also display "Buzz"
			if (counter % 5 == 0) {
				PrintOut += "Buzz";
			}

			// If the number is a multiple of 10, also display "Cat"
			if (counter % 10 == 0) {
				PrintOut += "Cat";
			}
	
			// If not the above conditions, convert the integer into string and 
			if(counter%2!=0 && counter % 3 !=0 && counter % 5 !=0 && counter %10 != 0){
				PrintOut = "" + counter; 
			}
			
			System.out.println(PrintOut);
		}

	}

}

// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    // Replace this comment with your code

		// in this question im going to use mod and deviding by ten 
		
		int Value = Integer.parseInt(args[0]);

		if (Value == 0) {
            System.out.println("Digits of the number: 0");
            return;
        }

		/* 

		// here i will run on the digits, use mod 10 to and store it in a temporary value called digit i will use it and then remove the last number by deviding by 10

		// i am having a hard time thinking how to print the words such as units tens hundreds... apart from having a already defined array to use such as  String[] prefix = {"units", "tens", "hundreds", "thousands" ... } 
		// so for now i will just print the numbers as is with no words wrapped around it :(
        while ( Value > 0 ) {
            int digit = (int) (Value % 10);  // Get the last digit
            System.out.println(digit);         // Print the digit
            Value /= 10;  // Remove the last digit
        }
		*/

		// did it the easy way in the end 

		 int num = Integer.parseInt(args[0]);

        // Extract ones
        int ones = num % 10;
        num = num / 10;  // remove the ones digit

        // Extract tens
        int tens = num % 10;
        num = num / 10;  // remove the tens digit

        // Whatever is left is hundreds (could be multi-digit)
        int hundreds = num;

        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");



	}
}

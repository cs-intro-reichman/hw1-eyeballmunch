// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:

		//here im jiust takeing the first 3 arguments that where passed thure my input
	    String name1 = args[0];  
		String name2 = args[1];
		String name3 = args[2];

		// i know this will be a intiger but all of args are strings so i need to cast it into a intiger :)
		double bill = Double.parseDouble(args[3]);

		//rounding up the ammount after deviding it bu 3
		double ammount = Math.ceil(bill/3);
		
		//here i will create my printline
		System.out.println("Dear " + name3 + ", " + name2 + ", and " + name1 + ": pay " +(ammount) +" Shekels each."  );

	    // Replace this comment with the rest of your code   
	}
}

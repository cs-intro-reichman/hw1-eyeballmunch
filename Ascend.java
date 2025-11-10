/*

feedback:

Great wrok,
Well done!
Yam

*/


// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your code

	
        int limit = Integer.parseInt(args[0]);
        
        // Generate three random numbers in the range [0, lim)
        int a = (int) (Math.random() * limit);
        int b = (int) (Math.random() * limit);
        int c = (int) (Math.random() * limit);

        // Print the random numberss=
        System.out.println(a + " " + b + " " + c);

        // Find the minimum maximum is pretty easy
        int min = Math.min(a, Math.min(b, c));  // Find the smallest value
        int max = Math.max(a, Math.max(b, c));  // Find the largest value

		//finding middle without if statment took me a couple of minutes but its just the sum minus min and max
        int middle = a + b + c - min - max;     

        // Print the numbers in ascending order
        System.out.println(min + " " + middle + " " + max);
	}
}


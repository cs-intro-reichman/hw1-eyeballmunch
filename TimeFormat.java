// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		// In Java, the command-line arguments args[0], args[1], ... are represented
		// each by a string. In this program, the single "hh:mm" input is represented
		// by the single command-line string argument args[0]. 
		//   
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		//int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		//int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        // Replace this comment with the rest of your code


		/*
		 i didnt quite understand the point of all the stuff above 
		but im guessing that i will always need to take the hours and check if its grater than 12 if( hours > 12){ im going to subtract 12 to get the time and know to add PM for example 15 - 12 is 3} 
		if its not if(hours < 12){ great its AM :) }
		but if(hours == 12 ){then it will still be 12 but add PM after }
		*/

		String time = args[0];

		//so ill just use split insted
		String[] timeParts = time.split(":");
        
        String hourStr = timeParts[0];  
        String minuteStr = timeParts[1]; 

		//here im just casting into int

		int hour = Integer.parseInt(hourStr);
        //int minute  = Integer.parseInt(minuteStr);

		// now i think there is a problem with numbers like 15:08 becasue the 08 will be casted into 8 so i will not cast the minutes into a int that will help :)
		// now all i have left is to fix 00 case of 00:12 for example 
		if ( hour == 0 ) { 
    		// This handles hours with 00 for example (00:12)
    		System.out.println("00:" + minuteStr + " AM"); 
			} else if ( hour == 12 ) {
				// this will handle cases where the hour is 12 
   				System.out.println(hour + ":" + minuteStr + " PM"); 

			} else if ( hour > 12 ) {
    			// this will handle cases where the hour > 12
    			System.out.println((hour - 12) + ":" + minuteStr + " PM"); 

			} else {
				//if i get to here it means that the hour is ( 0 < hour < 12)
    			System.out.println(hour + ":" + minuteStr + " AM"); 
			}
		
	}
}
// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// Replace this comment with your code

		int current_Value = Integer.parseInt(args[0]);
		double interest_rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		
		//here im converting it to a percentage
		double rate = interest_rate / 100.0;

		// calculating futureValue = currentValue ⋅ (1 + rate)^n
		double future_value = current_Value * Math.pow(1 + rate, years);

		System.out.println("After " + years + " years, $" + current_Value + " saved at " + interest_rate + "% will yield $" + (int) future_value);
	}
}
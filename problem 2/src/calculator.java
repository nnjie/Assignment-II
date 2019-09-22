import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		double kiloPerPound = 0.453;
		double meterPerInch = 0.025;
		
		Scanner userInput = new Scanner (System.in);
		
		//Input information
		System.out.println("Enter user's body weight: ");
		double weight = userInput.nextDouble();
		
		System.out.println("Enter user's height: ");
		double height = userInput.nextDouble();
		
		
		
		//BMI formulas
		System.out.println("What BMI calculator would you like to use:1.Imperial or 2.Metrix ");
		int userRequest = userInput.nextInt();
		
		double calcBmi;
		
		if (userRequest == 1) {
			calcBmi = (703 * weight) / (height * height);
		} 
		else {
			calcBmi = (weight  / (height * height));
		}
		
		System.out.println(calcBmi);
		
		//BMI Categories
		if (calcBmi < 18.5)
			System.out.println("Underweight");
		else if (calcBmi <= 24.9)
			System.out.println("Normal weight");
		else if (calcBmi <= 29.9)
			System.out.println("Overweight");
		else if (calcBmi >= 30)
			System.out.println("Obesity");
	}

}

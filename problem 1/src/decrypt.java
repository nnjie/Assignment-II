import java.util.Scanner;

public class decrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		int userDigitNum;
		int a;
		int x;
		int y;
		int z;
		
		System.out.print("Enter the four-digit number: ");
		userDigitNum = scnr.nextInt();
		
		z = (userDigitNum % 10000/1000) - 7; //first number
		System.out.print(z);
		y = (userDigitNum % 1000/100) - 7; // second number
		System.out.print(y);
		x = ((userDigitNum % 100/10) + 10) - 7;// third number
		System.out.print(x);
		a = ((userDigitNum % 10) + 10) - 7 ; // last number
		System.out.println(a);

	}

}

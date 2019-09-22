import java.util.Scanner;

public class encrypt {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		int userDigitNum;
		int a;
		int x;
		int y;
		int z;
		int swap;
		
		System.out.print("Enter the four-digit number: ");
		userDigitNum = scnr.nextInt();
		
		a = ((userDigitNum % 10) + 7) % 10; // last number
		x = (((userDigitNum % 100)/10) + 7) % 10;// third number
		y = (((userDigitNum % 1000)/100) + 7) % 10; // second number
		z = (((userDigitNum % 10000)/1000) + 7) % 10; //first number
		//do the swap
		swap = z;
		z = x;
		x = swap;	
		
		swap = y;
		y = a;
		a = swap;
		
		System.out.println("" + z + y + x + a);
		
		
	}

}

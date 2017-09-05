/*	Randy Sims
 *	2017-09-05
 *	Chapter 2 Project
 *	Looked up formatting because I saw the output was supposed to have 2 decimal places. 
 *	Changed wording to be "no more than 40" so that way 40 could also be an answer.
 */	
import java.util.Scanner;
public class Chpt2_Project {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the hours the employee worked this week (must be no more than 40):");
		int hours = input.nextInt();
		if (hours > 40)
			hours = 40;
		System.out.print("Enter the hourly rate for the employee (example: 10.00 - do not use \"$\" symbol):");
		double rate = input.nextDouble();
		System.out.format("The total pay for the employee is: %.2f",(hours * rate));
	}
}

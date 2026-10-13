package practiceProject;
import java.util.Scanner;

/***
 *  Ask for the bill total
 *  Ask for how many people are splitting the bill
		Ask for the tip percent
		Print the tip amount and the total with tip
		
 * 
 * 
 * 
 * 
 */


public class ReceiptGenerator {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		System.out.print("What is the bill total? ");
		double billTotal = kbd.nextDouble();

		System.out.print("How many people are splitting the bill? ");
		int nmbrOfPpl = kbd.nextInt();
		// Number of people stuff
		while (nmbrOfPpl<1) {

			System.out.print("How many people are splitting the bill? ");
			nmbrOfPpl= kbd.nextInt();

		} 

		System.out.print("What percent do you want to tip? ");
		int tip = kbd.nextInt();


		//calculation for tip
		double tipPercentage = (double) tip * .010;
		double tipTotal = billTotal * tipPercentage;
		double totalAmount = billTotal + tipTotal;
		double dividedPrice = (double) totalAmount / nmbrOfPpl;




		//Final print 

		System.out.printf("Tip amount:   $%.2f%n" ,tipTotal);
		System.out.printf("Total amount: $%.2f%n",totalAmount);
		System.out.printf("Each Person owes: $%.2f%n",dividedPrice);





	}

}

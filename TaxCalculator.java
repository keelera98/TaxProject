import java.util.*;
public class TaxCalculator{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		double gross;
		double tax;
		double netPay;
		int payPeriod;
		double hours = 0;
		double payRate = 9.70;
		System.out.printf("Enter 1 if you get paid weekly and 2 if you get paid bi-weekly: ");
		payPeriod = input.nextInt();
		while((payPeriod < 1) || (payPeriod > 2)){
			System.out.printf("Enter a valid input!\n");
			System.out.printf("Enter 1 if you get paid weekly and 2 if you get paid bi-weekly: ");
			payPeriod = input.nextInt();
		}
		if(payPeriod == 1){
			System.out.printf("How many hours did you work: ");
			hours = input.nextDouble();
			System.out.printf("Enter your pay rate: ");
			payRate = input.nextDouble();
		}
		if(payPeriod == 2){
			System.out.printf("How many hours did you work week one: ");
			hours = input.nextDouble();
			System.out.printf("How many hours did you work week two: ");
			hours = hours + input.nextDouble();
			System.out.printf("Enter your pay rate: ");
			payRate = input.nextDouble();
		}
		System.out.printf("What is your tax percent: ");
		tax = input.nextDouble() / 100;
		gross = findGross(hours, payRate);
		netPay = tax(gross, tax);
		System.out.printf("Here is your net pay is %.2f\n", netPay);
	}
	public static double tax(double a, double b){
		double tax;
		double netPay;
		tax = a * b;
		netPay = a - tax;
		return netPay;
	}
	public static double findGross(double a, double b){
		double gross;
		gross = a * b;
		return gross;
	}
}
package youdoit;

import java.util.Scanner;

public class ParadiseInfo2 {
	static double price;
	static double discount;
	static double savings;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter cutoff price for dicount >> ");
		price = in.nextDouble();
		System.out.print("Enter discount rate as a whole number >> ");
		discount = in.nextDouble();
		savings = computeDiscountInfo(price, discount);
		in.close();
		ParadiseInfo.displayInfo();
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a savings of at least $" + savings);
	}
	
	private static double computeDiscountInfo(double pr, double dscnt) {
		double saving;
		saving = pr * dscnt /100;
		return saving;
	}
}

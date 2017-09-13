package exercises;

import java.util.Scanner;

public class NumbersDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer >> ");
		int num1 = in.nextInt();
		System.out.print("Enter another integer >> ");
		int num2 = in.nextInt();
		passThrough(num1);
		passThrough(num2);
		in.close();
	}
	
	private static void passThrough(int n) {
		displayTwiceTheNumber(n);
		displayNumberPlusFive(n);
		displayNumberSquared(n);
	}
	
	private static void displayTwiceTheNumber(int n) {
		System.out.println(n + " times two is " + (n * 2));
	}
	
	private static void displayNumberPlusFive(int n) {
		System.out.println(n + " plus five is " + (n + 5));
	}
	
	private static void displayNumberSquared(int n) {
		System.out.println(n + " squared is " + Math.pow(n, 2));
	}
}

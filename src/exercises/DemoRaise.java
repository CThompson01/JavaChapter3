package exercises;

import java.util.Scanner;

public class DemoRaise {
	// Rate to raise all salaries
	final static double RAISE_RATE = 1.10;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Demonstrating some raises");
		System.out.println(predictRaise(400.00));
		System.out.println(predictRaise(in.nextDouble()));
		System.out.println(predictRaise(in.nextDouble()));
		in.close();
	}
	private static String predictRaise(double salary) {
		double newSalary;
		newSalary = salary * RAISE_RATE;
		return ("Current salary: " + salary + "     After raise: " + newSalary);
	}
}

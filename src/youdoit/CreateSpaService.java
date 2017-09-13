package youdoit;

import java.util.Scanner;

public class CreateSpaService {
	
	public static void main(String[] args) {
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		setServices(firstService);
		setServices(secondService);
		displayServices(firstService, "First");
		displayServices(secondService, "Second");
	}
	
	@SuppressWarnings("resource")
	private static void setServices(SpaService service) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter service >> ");
		service.setServiceDescription(in.nextLine());
		System.out.print("Enter price >> ");
		service.setPrice(in.nextDouble());
	}
	
	private static void displayServices(SpaService service, String order) {
		System.out.println(order + " service details:");
		System.out.println(service.getServiceDescription() + " $" + service.getPrice());
	}
}

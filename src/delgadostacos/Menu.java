package delgadostacos;

import java.util.Scanner;

public class Menu {
	final static String[] ALL_MENU_ITEMS = {"Taco","Burrido","Chalupa","Taco Salad", "Enchilada",
			"Chimichanga","Wrap","Beans","Rice","Corn"};
	final static Double[] ALL_MENU_PRICES = {2.75,3.45,4.00,2.25,6.25,7.75,1.25,1.15,1.15,1.15};
	
	public static void drawMenu() {
		System.out.println("               WELCOME TO DELGADOS TACOS");
		for (int i = 0; i < ALL_MENU_ITEMS.length; i++) {
			if (i % 2 == 0) {
				System.out.print(menuItems(i) + "  ");
			} else {
				System.out.println(menuItems(i));
			}
		}
	}
	
	public static double getOrder() {
		Scanner in = new Scanner(System.in);
		double total = 0.0;
		System.out.println("Type something not on the menu to complete your order!");
		while (true) {
			System.out.print("What would you like to order?");
			String order = in.nextLine();
			if (isItem(order)) {
				total += getTotal(order);
			} else {
				in.close();
				return total;
			}
		}
	}
	
	private static double getTotal(String order) {
		for (int i = 0; i < ALL_MENU_ITEMS.length; i++) {
			if (order.toLowerCase().equals(ALL_MENU_ITEMS[i].toLowerCase())) {
				return ALL_MENU_PRICES[i];
			}
		}
		return 0.0;
	}
	
	private static Boolean isItem(String order) {
		for (int i = 0; i < ALL_MENU_ITEMS.length; i++) {
			if (order.toLowerCase().equals(ALL_MENU_ITEMS[i].toLowerCase())) {
				return true;
			}
		}
		return false;
	}
	
	private static String menuItems(int i) {
		String menuItem = ALL_MENU_ITEMS[i] + " ";
		int diff = 20 - menuItem.length();
		for (int x = 0; x < diff; x++) {
			menuItem += ".";
		}
		menuItem += " " + DecimalFormatting.formatIt(ALL_MENU_PRICES[i]);
		return menuItem;
	}
}

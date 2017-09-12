package delgadostacos;

public class Main {
	public static void main(String[] args) {
		TacoTruck.makeTacoTruck();
		blankSpace(1);
		Menu.drawMenu();
		blankSpace(2);
		double totalCost = Menu.getOrder();
		System.out.println("Total cost: " + SalesTax.calculateSalesTax(totalCost));
	}

	private static void blankSpace(int amount) {
		for (int i = 0; i < amount; i++) {
			System.out.print("\n");
		}
	}
}

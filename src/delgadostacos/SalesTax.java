package delgadostacos;

public class SalesTax {
	public static String calculateSalesTax(double cost) {
		return DecimalFormatting.formatIt(cost *= 1.07);
	}
}

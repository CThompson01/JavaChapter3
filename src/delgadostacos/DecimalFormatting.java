package delgadostacos;

import java.text.DecimalFormat;

public class DecimalFormatting {
	final static DecimalFormat MONEY = new DecimalFormat("0.00");
	
	public static String formatIt(double input) {
		return "$" + MONEY.format(input);
	}
}

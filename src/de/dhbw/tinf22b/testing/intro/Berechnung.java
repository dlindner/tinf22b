package de.dhbw.tinf22b.testing.intro;

public class Berechnung {

	public Berechnung() {
		super();
	}
	
	public int für(int num1, int num2) {
		return num1 * num2;
	}
	
	public int für_alt(int num1, int num2) {
		int result = 0;
		int ithBit;

		boolean isNegativeSign = (num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0);
		num1 = Math.abs(num1);
		num2 = Math.abs(num2);

		for (int i = 0; i < 32; i++) {
			ithBit = num2 & (1 << i);
			if (ithBit > 0) {
				result += (num1 << i);
			}
		}
		if (isNegativeSign) {
			result = ((~result) + 1);
		}
		return result;
	}
}

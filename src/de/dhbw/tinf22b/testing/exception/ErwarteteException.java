package de.dhbw.tinf22b.testing.exception;

public class ErwarteteException {

	public ErwarteteException() {
		super();
	}
	
	public int liefere() {
		throw new NullPointerException(
			"Das muss so!"
		);
	}
}

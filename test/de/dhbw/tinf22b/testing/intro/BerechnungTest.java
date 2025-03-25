package de.dhbw.tinf22b.testing.intro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BerechnungTest {

	@Test
	void Eine_Null_ergibt_Null() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 0;
		int given2 = Integer.MAX_VALUE;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 0;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Eins_und_Eins_ergibt_Eins() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 1;
		int given2 = 1;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Zwei_und_Zwei_ergibt_Vier() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 2;
		int given2 = 2;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 4;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Zwei_und_Drei_ergibt_Sechs() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 2;
		int given2 = 3;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 6;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void MAX_VALUE_und_MAX_VALUE_ergibt_Eins() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = Integer.MAX_VALUE;
		int given2 = Integer.MAX_VALUE;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 1;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void Eins_und_MAX_VALUE_ergibt_MAX_VALUE() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 1;
		int given2 = Integer.MAX_VALUE;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = Integer.MAX_VALUE;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Zwei_und_MAX_VALUE_ergibt_Minus_Zwei() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 2;
		int given2 = Integer.MAX_VALUE;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = -2;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void Eins_und_Minus_Eins_ergibt_Minus_Eins() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 1;
		int given2 = -1;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = -1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Minus_Eins_und_Eins_ergibt_Minus_Eins() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = -1;
		int given2 = 1;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = -1;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void Eins_und_Minus_Eins_ergibt_Minus_Eins2() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 10;
		int given2 = -10;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = -100;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Minus_Eins_und_Eins_ergibt_Minus_Eins2() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = -10;
		int given2 = 10;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = -100;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Minus_Zehn_und_Minus_Zehn_ergibt_Hundert() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = -10;
		int given2 = -10;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = +100;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	void Assoziativität_1() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 10;
		int given2 = 20;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 200;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void Assoziativität_2() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 200;
		int given2 = 30;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 6000;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void Assoziativität_3() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 20;
		int given2 = 30;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 600;
		Assertions.assertEquals(expected, actual);
	}

	@Test
	void Assoziativität_4() {
		// Arrange
		Berechnung target = new Berechnung();
		int given1 = 600;
		int given2 = 10;
		
		// Act
		int actual = target.für(given1, given2);
		
		// Assert
		int expected = 6000;
		Assertions.assertEquals(expected, actual);
	}
}

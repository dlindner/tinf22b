package de.dhbw.tinf22b.testing.exception;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ErwarteteExceptionTest {

	// JUnit 5
	@Test
	void NullPointerException_wird_erwartet5() {
		Executable code = () -> {
			// Arrange
			ErwarteteException target = new ErwarteteException();
					
			// Act
			int actual = target.liefere(); // actual wird nie geliefert!
		};
		
		// Assert
		Assertions.assertThrows(
			NullPointerException.class,
			code
		);
	}
	
	// JUnit 4
	@Test(expected = NullPointerException.class)
	void NullPointerException_wird_erwartet4() {
		// Arrange
		ErwarteteException target = new ErwarteteException();
				
		// Act
		int actual = target.liefere(); // actual wird nie geliefert!
				
		// Assert - Siehe Annotation
	}
	
	// JUnit 3
	@Test
	void NullPointerException_wird_erwartet3() {
		// Arrange
		ErwarteteException target = new ErwarteteException();
				
		try {
			// Act
			int actual = target.liefere(); // actual wird nie geliefert!
			// Assert 2
			Assertions.fail("Die NullPointerException fehlt!");
		} catch (NullPointerException e) {
			// Assert 1
			Assertions.assertEquals("Das muss so!", e.getMessage());
		}
	}
}

package de.dhbw.tinf22b.testing.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class DokumentenbasierterStudierendenLaderTest {

	@Test
	public void Sonnenscheinfall() {
		// Arrange
		DokumentenbasierterStudierendenLader target = new DokumentenbasierterStudierendenLader();
		Map<String, String> given = new HashMap<>();
		given.put("Matrikelnummer", "0123456");
		given.put("Vorname", "Max");
		given.put("Nachname", "Mustermann");
		
		// Act
		Studierend actual = target.ladeAus(given);

		// Assert
		assertEquals("0123456", actual.matrikelnummer());
		assertEquals("MUSTERMANN, Max", actual.name());
	}
}

package de.dhbw.tinf22b.testing.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.mockito.Mockito;

public class DokumentenbasierterStudierendenLaderTest {

	@Test
	public void Sonnenscheinfall() {
		// Arrange
		Dokumentendatenbank abhängigkeit = Mockito.mock(Dokumentendatenbank.class);
		// "Leere", "dumme" Instanz
		
		// Training
		Map<String, String> prepared = new HashMap<>();
		prepared.put("Matrikelnummer", "0123456");
		prepared.put("Vorname", "Max");
		prepared.put("Nachname", "Mustermann");
		Mockito.when(abhängigkeit.dokumentFür(Mockito.eq("0123456"))).thenReturn(prepared);
		// "Gerade ausreichend gefüllt", "gerade undumm genug" Instanz
		
		DokumentenbasierterStudierendenLader target = new DokumentenbasierterStudierendenLader(
			abhängigkeit
		);
		
		// Act
		Studierend actual = target.ladeFür("0123456");

		// Assert
		assertEquals("0123456", actual.matrikelnummer());
		assertEquals("MUSTERMANN, Max", actual.name());
	}
}

package de.dhbw.tinf22b.testing.mock;

import java.util.Map;

public class DokumentenbasierterStudierendenLader {

	public DokumentenbasierterStudierendenLader() {
		super();
	}
	
	/*
	 * key0 -> value0
	 * key1 -> value1
	 * key2 -> value2
	 */
	public Studierend ladeAus(
		final Map<String, String> dokument
	) {
		final String vorname = dokument.getOrDefault("Vorname", "");
		final String nachname = dokument.getOrDefault("Nachname", "");
		final String matrikelnummer = dokument.get("Matrikelnummer");
		Studierend result = new Studierend() {
			@Override
			public String name() {
				return nachname.toUpperCase() + ", " + vorname;
			}
			
			@Override
			public String matrikelnummer() {
				return matrikelnummer;
			}
		};
		return result;
	}

//	public Optional<Studierend> ladeAus(
//		final Map<String, String> dokument
//	) {
//		final String vorname = dokument.getOrDefault("Vorname", "");
//		final String nachname = dokument.getOrDefault("Nachname", "");
//		final Optional<String> matrikelnummer = Optional.ofNullable(dokument.get("Matrikelnummer"));
//		if (matrikelnummer.isEmpty()) {
//			return Optional.empty();
//		}
//		Studierend result = new Studierend() {
//			@Override
//			public String name() {
//				return nachname.toUpperCase() + ", " + vorname;
//			}
//			
//			@Override
//			public String matrikelnummer() {
//				return matrikelnummer.get();
//			}
//		};
//		return Optional.of(result);
//	}
}

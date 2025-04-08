package de.dhbw.tinf22b.testing.mock;

import java.util.Map;

public interface Dokumentendatenbank {

	boolean kennt(String id);
	
	Map<String, String> dokumentFür(String id);
}

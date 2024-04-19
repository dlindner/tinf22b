package de.dhbw.tinf22b.intro;

public class Krümelmonster {

	private final String name;

	public Krümelmonster(String name) {
		super();
		this.name = name;
	}
	
	public void schenke(Keks keks) {
		System.out.println("S1: " + name + " freut sich über den Keks.");
	}
	
	public void schenke(Oreo keks) {
		System.out.println("S2: " + name + " hat die Creme geschlonzt!");
	}
	
	public void schenke(SubwayKeks keks) {
		System.out.println("S3: " + name + " verkauft ihn gewinnbringend weiter.");
	}
}

package de.dhbw.tinf22b.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<OurDouble> eins = Stream.generate(OurDouble::new);
		Stream<OurDouble> eins2 = Stream.generate(() -> new OurDouble());
		
		Predicate<OurDouble> unsereBedingung = od -> od.booleanValue();
		// ambigious method reference
		//Predicate<OurDouble> unsereBedingung2 = OurDouble::booleanValue;
		
		Predicate<OurDouble> bedingung = new Predicate<OurDouble>() {
			@Override
			public boolean test(OurDouble n) {
				return n.intValue() < 1000;
			}
		};
		
		Stream<OurDouble> zwei = eins.filter(bedingung);
		
		Predicate<Object> weird = new Predicate<Object>() {
			@Override
			public boolean test(Object o) {
				return o.hashCode() % 2 == 0;
			}
		};
		
		zwei.filter(weird);
	}
}

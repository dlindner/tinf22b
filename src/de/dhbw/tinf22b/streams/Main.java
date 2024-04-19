package de.dhbw.tinf22b.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<OurDouble> eins = Stream.generate(OurDouble::new).limit(1000L);
		Stream<OurDouble> eins2 = Stream.generate(() -> new OurDouble()).limit(10L);
		
		Predicate<OurDouble> unsereBedingung = od -> od.booleanValue();
		// ambigious method reference
		//Predicate<OurDouble> unsereBedingung2 = OurDouble::booleanValue;
		
		Predicate<OurDouble> bedingung = new Predicate<OurDouble>() {
			@Override
			public boolean test(OurDouble n) {
				return n.intValue() < 1000;
			}
		};
		
		Stream<OurDouble> zwei = eins2.filter(bedingung);
		
		Predicate<Object> weird = new Predicate<Object>() {
			@Override
			public boolean test(Object o) {
				return o.hashCode() % 2 == 0;
			}
		};
		
		Stream<OurDouble> drei = zwei.filter(weird);
		//Stream<OurDouble> vier = drei.limit(1000L);
		
		Stream<OurDouble> vier = drei.peek(x -> System.out.println("*** " + x));
		//drei.forEach(x -> System.out.println("*** " + x));
		
		Function<OurDouble, String> text = new Function<OurDouble, String>() {
			@Override
			public String apply(OurDouble t) {
				return "Nö";
			}
		};
		Function<OurDouble, String> text2 = od -> {
			return "Nö";
		};
		Function<OurDouble, String> text3 = od -> "Nö";
		//Function<OurDouble, String> text4 = () -> "Nö";
		Function<OurDouble, String> text5 = OurDouble::toString;
		OurDouble nö = new OurDouble();
		//Function<OurDouble, String> text6 = nö::toString;

		System.out.println(text.getClass().getName());
		System.out.println(text2.getClass().getName());
		System.out.println(text3.getClass().getName());
		
		//(OurDouble) null;
		OurDouble gehtdas = (OurDouble) null;

		AuchEgal<OurDouble, String, Integer, Long> berechnung = (alpha, beta, gamma) -> 42L;
		
		List<OurDouble> ergebnis = vier.collect(Collectors.toList());
		System.out.println(ergebnis.size());
	}
	
	public static interface AuchEgal<Eins, Zwei, Drei, Ergebnis> {
		Ergebnis egal(Eins e, Zwei z, Drei d);
	}
}

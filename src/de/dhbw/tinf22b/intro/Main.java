package de.dhbw.tinf22b.intro;

import java.security.AllPermission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		final Oreo oreo = new Oreo();
		final SubwayKeks subway = new SubwayKeks();
		
		Map<Class<? extends Keks>, Runnable> essen = new HashMap<>();
		essen.put(Keks.class, () -> System.out.println("KX1: Oh! Krümel..."));
		essen.put(Oreo.class, () -> System.out.println("KX2: Mhm, vergenussferkelisch!"));
		essen.put(SubwayKeks.class, () -> System.out.println("KX3: Du bist für das Geld hoffentlich lecker!"));
		
		essen.get(subway.getClass()).run();
		final List<Keks> alleMeineKekse = List.of(oreo, subway);
		
		System.out.println(
		subway.getClass().getSimpleName()
		);
		switch (subway.getClass().getSimpleName()) {
			case "Oreo" -> System.out.println("KX2: Mhm, vergenussferkelisch!");
			case "SubwayKeks" -> System.out.println("KX2: Mhm, vergenussferkelisch!");
			default -> System.out.println("KX2: Mhm, vergenussferkelisch!");
		}

		for (Keks each : alleMeineKekse) {
			essen.get(each.getClass()).run();
		}
		
		oreo.verspeise();
		subway.verspeise();
		//alleMeineKekse.forEach(Keks::verspeise);
		for (Keks each : alleMeineKekse) {
			each.verspeise();
		}
		
		final Krümelmonster monster = new Krümelmonster("Sid");
		monster.schenke((Keks) oreo);
		monster.schenke(subway);
		alleMeineKekse.forEach(monster::schenke);
	}
}

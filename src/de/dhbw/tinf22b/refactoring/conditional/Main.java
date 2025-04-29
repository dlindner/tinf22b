package de.dhbw.tinf22b.refactoring.conditional;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
	
	private static final Map<EmployeeType, Supplier<? extends Employee>> konstruktoren = Map.of(
		EmployeeType.DEVELOPER, () -> new Developer(1000),
		EmployeeType.SALESMAN, () -> new Salesman(1000)
	);

	public static void main(String[] args) {
		EmployeeType myType = EmployeeType.SALESMAN;
		Employee myWorker = hire(myType);
	}

	private static Employee hire(EmployeeType type) {
		switch (type) {
			case DEVELOPER -> new Developer(1000);
			case SALESMAN -> new Salesman(1000);
			default -> throw new IllegalArgumentException();
		}
		
		return Optional.ofNullable(
			konstruktoren.get(
				type
			)
		).map(Function.identity())
		.orElseThrow(() -> new IllegalArgumentException())
		
//		if (type == EmployeeType.SALESMAN) {
//			return new Salesman(1000);
//		}
//		if (type == EmployeeType.DEVELOPER) {
//			return new Developer(1000);
//		}
//		throw new IllegalArgumentException();
	}
}

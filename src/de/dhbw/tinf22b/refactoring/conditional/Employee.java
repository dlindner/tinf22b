package de.dhbw.tinf22b.refactoring.conditional;

public abstract class Employee {

	private final int baseSalary;
	
	public Employee(int salary) {
		super();
		this.baseSalary = salary;
	}
	
	protected final int baseSalary() {
		return this.baseSalary;
	}

    public abstract int getSalaryFor(long lastMonth);
}

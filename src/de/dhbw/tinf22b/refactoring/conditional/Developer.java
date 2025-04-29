package de.dhbw.tinf22b.refactoring.conditional;

public class Developer extends Employee {
	
	public Developer(int salary) {
		super(salary);
	}
	
	@Override
	public int getSalaryFor(long lastMonth) {
		return baseSalary();
	}
}

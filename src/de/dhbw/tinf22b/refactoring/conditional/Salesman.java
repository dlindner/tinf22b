package de.dhbw.tinf22b.refactoring.conditional;

public class Salesman extends Employee {
	
	public Salesman(int salary) {
		super(salary * 2);
	}
	
	@Override
	public int getSalaryFor(long lastMonth) {
		return baseSalary() + (int) lastMonth;
	}
}

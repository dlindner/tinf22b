package de.dhbw.tinf22b.memorymodel.quiz;

public class Main {
	
	public static void main(String[] args) {
		System.out.println(Scenario.runFor((int) 1E5, Scenario1::new));
		//System.out.println(Scenario.runFor((int) 1E6, Scenario2::new));
		//System.out.println(Scenario.runFor((int) 1E5, Scenario3::new));
		//System.out.println(Scenario.runFor((int) 1E5, Scenario4::new));
		//System.out.println(Scenario.runFor((int) 1E5, Scenario5::new));
	}
}

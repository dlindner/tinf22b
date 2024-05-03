package de.dhbw.tinf22b.memorymodel.mutex;

public class Hochzählende implements Runnable {

	private final String name;
	private final Zähler ziel;
	private int spielzüge;

	public Hochzählende(
		String name,
		Zähler ziel
	) {
		super();
		this.name = name;
		this.ziel = ziel;
		this.spielzüge = 0;
	}
	
	@Override
	public void run() {
		while (this.spielzüge < 500_000_000) {
			this.ziel.erhöheUm(1);
			this.spielzüge++;
		}
		System.out.println(name + " ist fertig: " + this.spielzüge);
	}

	private void sleepFor(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}

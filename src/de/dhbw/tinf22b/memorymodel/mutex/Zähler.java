package de.dhbw.tinf22b.memorymodel.mutex;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 * This class provides self-contained thread-safety.
 */
public class Zähler extends Object {

	private final Object lock;
	private int stand;
	
	public Zähler() {
		super();
		this.lock = new Object();
		this.stand = 0;
	}
	
	public void erhöheUm(int offset) {
		modifiziereThreadSafe(
			s -> s + offset
		);
	}
	
	public void modifiziereThreadSafe(
		Function<Integer, Integer> effekt
	) {
		synchronized (this.lock) {
			this.stand = effekt.apply(this.stand);
		}
	}
	
	public void führeThreadSafeDurch(
		Consumer<Integer> effekt
	) {
		synchronized (this.lock) {
			effekt.accept(this.stand);
		}
	}
	
	public static synchronized void tueWas() {
		synchronized (Zähler.class) {
			// aktionen hier
		}
	}
}

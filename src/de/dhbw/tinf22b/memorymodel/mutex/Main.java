package de.dhbw.tinf22b.memorymodel.mutex;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		long begin = System.nanoTime();
		Zähler ziel = new Zähler();
		Hochzählende eins = new Hochzählende("t1", ziel);
		Hochzählende zwei = new Hochzählende("t2", ziel);
		Thread t1 = new Thread(eins);
		Thread t2 = new Thread(zwei);
		t1.start();
		t2.start();
		
		List<Hochzählende> alle = new ArrayList<Hochzählende>();
		
		t2.join();
		t1.join();
		
		long ende = System.nanoTime();
		System.out.println("Fertig nach: " + (ende - begin) / 1E9);
		ziel.führeThreadSafeDurch(
			System.out::println
		);
	}
}

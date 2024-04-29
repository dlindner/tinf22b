package de.dhbw.tinf22b.memorymodel.prediction;

import java.util.Arrays;
import java.util.Random;

public class NotUnderOurControl {

	private static final int seed = 666;
	private static final int dataSize = 80_000;
	
    public static void main(final String[] arguments) {
    	final int[] data = fillDataRandomly(dataSize);

    	System.out.println("Starting...");
        final long start = System.nanoTime();
        
        // Optimized for CPU enabled branch prediction
        Arrays.sort(data);
        
        long sum = 0;
               
        for (int j = 0; j < data.length; ++j) {
        	for (int i = 0; i < 100_000; ++i) {
                if (data[j] >= 128) {
                    sum += data[j];
                }
            }
        }

        //System.out.println("duration (sec): " + (System.nanoTime() - start) / 1E9);
        System.out.println("sum: " + sum);
        System.out.println("duration (sec): " + (System.nanoTime() - start) / 1E9);
    }

	private static int[] fillDataRandomly(int size) {
		final int[] data = new int[size];
        final Random random = new Random(seed);
        for (int i = 0; i < data.length; ++i) {
            data[i] = random.nextInt() % 256;
        }
		return data;
	}
}

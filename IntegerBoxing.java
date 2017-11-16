package de.htw.app;

import java.lang.Runtime;
import java.util.ArrayList;
import java.util.List;

public class IntegerBoxing {

	private final long start;

	/**
	 * Create a integerBoxing object.
	 */
	public IntegerBoxing() {
		start = System.currentTimeMillis();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntegerBoxing box = new IntegerBoxing();
		List<Integer> values = new ArrayList<Integer>();
		int[] valuesArray = new int[1000];
		
		Runtime rt = Runtime.getRuntime();
		long tM = rt.totalMemory();
		long mM= rt.maxMemory();
		long fM = rt.freeMemory();
		
		for (int i = 0; i < 1000; i++) {
			values.add(i);
			valuesArray[i] = i;
		}
		// wrapper
		//while (true) {
			for (int j = 0; j < 10000; j++) {
				for (int i = 0; i < valuesArray.length; i++) {
					if (j % 100 == 0 && i % 100 == 0) {
						//fM = rt.freeMemory();
						//System.out.println("max memory: " + fM);
					}
					valuesArray[i]++;
				}
			}
		//}
		
			
			
		System.out.println("elapsed time " + box.elapsedTime());
		//System.out.println("total Memory: " + tM + "\nmax Memory: " + mM + "\nfree Memory:" + fM);
	}

	/**
	 * Return elapsed time (in seconds) since this object was created.
	 */
	public long elapsedTime() {
		
		return System.currentTimeMillis()-start;
		// your code here :-)
	}

}

package de.htw.app;

public class FibonacciIterative implements Fibonacci{
	
	public static void main(String[] args) {
		FibonacciIterative fibIt = new FibonacciIterative();
		
		int maxzahl = Integer.parseInt(args[0]);
		maxzahl = Integer.parseInt(args[0]);
		
		Runtime rT = Runtime.getRuntime();
		long fM = rT.freeMemory();
		long mM = rT.maxMemory();
		long tM = rT.totalMemory();

		fibIt.fibonacci(maxzahl);
		
		System.out.println("free M: " + fM + " max M: " + mM + " total M: " + tM);
	}

	public void fibonacci(int maxzahl) {
		int[] fib = new int[maxzahl + 1];
		fib[1] = 1;
		fib[2] = 1;
		System.out.println("1: " + fib[1]);
		System.out.println("2: " + fib[2]);
		for (int i = 3; i <= maxzahl; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
			System.out.println(i + ": " + fib[i]);
		}
	}
}

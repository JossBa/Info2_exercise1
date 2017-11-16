package de.htw.app;

public class FibonacciRecursive {

	static int counter = 1;
	public static void main(String[] args) {

		Runtime rT =  Runtime.getRuntime();
        long fM = rT.freeMemory();
        long mM = rT.maxMemory();
        long tM = rT.totalMemory();
        int grenze = Integer.parseInt(args[0]);
		
		System.out.print(grenze + ": " + fibonnaci(grenze));
		System.out.println("free M: " + fM + " max M: " + mM + " total M: " + tM);
	}
//rekursiv mit back tail
	public static int fibonnaci(int number) {
		return fibonnaciHelper(number, 0, 1);
	}

	public static int fibonnaciHelper(int term, int lower, int higher) {
		if (term < 2) {
			return higher;

		}
		
		System.out.println(counter + ": " + higher + " ");
		counter++;
		int results = fibonnaciHelper(term - 1, higher, higher + lower);
		return results;
	}
//alternative rekursive Funktion
	public static int rekFib(int n) {

		if (n <= 2) {
			return 1;
		} else {
			return rekFib(n - 1) + rekFib(n - 2);
		}
	}
}

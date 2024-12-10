package com.dsa.recursion;

// 0 1 1 2 3 5 8 13 21 ...
// find the number at nth index (0 indexing)

public class FibonacciNumber {

	/*
	 * TC - > O(2^n)
	 * SC -> O(n)
	 */
	static int fibo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibo(n - 1) + fibo(n - 2);
	}

	public static void main(String[] args) {
		int n = 5;
		int fibo = fibo(n);
		System.out.println(fibo);
	}

}

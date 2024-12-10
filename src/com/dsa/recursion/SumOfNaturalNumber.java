package com.dsa.recursion;

public class SumOfNaturalNumber {

	/*
	 * using Recursive approach
	 * TC -> O(n)
	 * SC -> O(n)
	 */
	static int sumOfNaturalNumber(int n) {
		if (n == 1) {
			return n;
		}

		return n + sumOfNaturalNumber(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		int sumOfNaturalNumber = sumOfNaturalNumber(n);
		System.out.println(sumOfNaturalNumber);
	}

}

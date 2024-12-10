package com.dsa.SumOfNaturalNumber;

public class SumOfNaturalNumber {

/*
 * using formula
 * TC -> O(1)
 * SC -> O(1)
 */
	static int sumNatural(int n) {
		int sum = n * (n + 1) / 2;
		return sum;
	}

/*
 * using for-loop Iterative approach
 * TC -> O(n)
 * SC -> O(1)
 */
	static int sumNNatural(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 5; // 1,2,3,4,5
//		int sumNatural = sumNatural(n);
		int sumNNatural = sumNNatural(n);
		System.out.println(sumNNatural);
	}

}

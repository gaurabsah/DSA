package com.dsa.recursion;

/*
 * n is the number of players
 * k is the step
 */
public class JosephusProblem {

	static int josephus(int n, int k) {
		if (n == 1) {
			return 0;
		}

		return (josephus(n - 1, k) + k) % n;
	}

	public static void main(String[] args) {
		int n = 5;
		int k = 3;

		int josephus = josephus(n, k);
		System.out.println(josephus);
	}

}

package com.dsa.recursion;

// Pascal's Triangle
public class nCr {

	static int ncr(int n, int r) {
		if (n == r || r == 0)
			return 1;
		return ncr(n - 1, r - 1) + ncr(n - 1, r);
	}

	public static void main(String[] args) {

		int nCr = ncr(5, 0);
		System.out.println(nCr);

	}

}

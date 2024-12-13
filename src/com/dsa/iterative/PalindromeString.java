package com.dsa.iterative;

public class PalindromeString {

	static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();

		if (str.equals(sb.toString())) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String str = "MADAM";
		boolean palindrome = isPalindrome(str);
		if (palindrome) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}

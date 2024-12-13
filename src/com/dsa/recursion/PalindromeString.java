package com.dsa.recursion;

public class PalindromeString {

	static boolean isPalindrome(String str) {
		return isPalindromeHelper(str, 0, str.length() - 1);
	}

	static boolean isPalindromeHelper(String s, int l, int r) {
		if (l >= r) {
			return true;
		}

		if (s.charAt(l) == s.charAt(r)) {
			return isPalindromeHelper(s, l + 1, r - 1);
		} else {
			return false;
		}
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

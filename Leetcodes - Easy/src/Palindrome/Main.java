package Palindrome;

public class Main {

	public static void main(String[] args) {
		int x = 121;
		Solution sol = new Solution();
		
		System.out.println("Case 1 : x = 121 is palindrome? R: " + sol.isPalindrome(x));
		
		x = -121;
		System.out.println("Case 2 : x = -121 is palindrome? R: " + sol.isPalindrome(x));
		
		x = 10;
		System.out.println("Case 3 : x = 10 is palindrome? R: " + sol.isPalindrome(x));
	}

}

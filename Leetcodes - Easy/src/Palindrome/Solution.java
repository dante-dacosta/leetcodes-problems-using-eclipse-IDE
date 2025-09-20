package Palindrome;

public class Solution {
	public boolean isPalindrome(int x) {
		int number = x;
		int reversedX = 0;
		
		// To reverse number without turning it into a string
		while(number > 0) {
			// Reversed number * 10 moves the digit one unit to the left leaving space for the next digit resulting of number % 10
			reversedX = (reversedX * 10) + (number % 10);
			// Removes the right digit from the number
			number = number /10;
		}
			
		if(reversedX == x)
			return true;
		
		return false;
    }
}

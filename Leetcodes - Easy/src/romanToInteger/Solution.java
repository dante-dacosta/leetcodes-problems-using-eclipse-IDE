package romanToInteger;

import java.util.Map;

public class Solution {
	public int romanToInt(String s) {
		// Making a hashmap of the values for the roman numbers
		Map<String, Integer> romans = Map.of(
				"I",1,
				"V",5,
				"X",10,
				"L",50,
				"C",100,
				"D",500,
				"M",1000
				);
		int number = 0;
		boolean subtractive = false;
		
		// Cycle to explore each character of the string
		for (int i = 0; i < s.length(); i++) {
			// To make sure there's a next number
			if(i+1 < s.length()) {
				
				/*
				 * Evaluating the conditions from which a roman number can be subtractive
				 * I can precede V or X
				 * X can precede L or C
				 * C can precede D or M
				*/
				
				subtractive = (s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) ||
							  (s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) ||
							  (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'));
				
				// If subtractive, then subtract the actual number from the next number
				if(subtractive) {
					number += romans.get(s.charAt(i+1)+"") - romans.get(s.charAt(i)+"");
					i++;
				}else
					number += romans.get(s.charAt(i)+""); //If not, just sum the value
				
			}else
				number += romans.get(s.charAt(i)+"");
		}
		
		return number;
	}
}

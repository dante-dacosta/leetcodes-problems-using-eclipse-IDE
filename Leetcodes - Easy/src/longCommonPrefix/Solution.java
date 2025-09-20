package longCommonPrefix;

import java.util.Arrays;

public class Solution {
	
	public String longPrefix(String[] strs) {
		
		// Sorting the array of strings to ease the process
		Arrays.sort(strs);
	
		String commonPrefix = "";
		
		// Comparing the first and the last String, if they have different starting letters then there will not be a common prefix 
		for (int i = 0; i < strs[0].length(); i++) {
			
			if(strs[0].charAt(i) == strs[strs.length-1].charAt(i))
				commonPrefix += strs[0].charAt(i);
			else
				break;
			
		}
		
		return commonPrefix;
	}
}

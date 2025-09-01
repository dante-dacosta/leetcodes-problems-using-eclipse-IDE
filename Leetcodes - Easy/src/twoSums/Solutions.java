package twoSums;

import java.util.HashMap;
import java.util.Map;

public class Solutions {
	
	public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
			int ntarget = target - nums[i];
			
        	if(map.containsKey(ntarget)) {
        		return new int[] {map.get(ntarget),i};
        	}
			
        	map.put(nums[i],i);
		}
        
        return new int[] {};
	}
}

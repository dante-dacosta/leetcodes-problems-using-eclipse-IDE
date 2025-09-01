package twoSums;

public class Main {

	public static void main(String[] args) { 
		int target = 6;
		int[] nums = {3,2,4};
		Solutions exe = new Solutions();
		int[] solution = exe.twoSum(nums, target);
		
		System.out.println("["+ solution[0] + "," + solution[1] + "]");
	}

	
}

package programs.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String... args) {
		int[] a= twoSum(new int[] {2,4,5,3,7},10);
		for(int i:a) {
			System.out.println(i);
		}
	}

	//Time Complexity O(n) by using HashMap
	private static int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		int complement;
		Map<Integer,Integer> hashMap= new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			complement= target-nums[i];
			if(hashMap.containsKey(complement)) {
				return new int[] {hashMap.get(complement),i};
			}
			hashMap.put(nums[i], i);
		}
		return new int[] {};
	}
}

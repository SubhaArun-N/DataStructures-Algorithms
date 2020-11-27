package ProblemSheet;

import java.util.HashMap;

public class SubarraySumEqualsK{
	
	public int getTotalSubarrays(int[] nums, int k) {
		if(nums == null || nums.length==0) {
			return 0;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int rsum = 0,  count = 0;
		int diff = 0;
		map.put(0, 1);
		for(int i =0;i<nums.length;i++) {
			 int n = nums[i];
			 rsum = rsum + n;
			 diff = rsum - k;
			 
			 if(map.containsKey(diff)) {
				 count = count + map.get(diff);
			 }
			 
			 if(map.containsKey(rsum)) {
				 map.put(rsum, map.get(rsum)+1);
			 }else {
				 map.put(rsum, 1);
			 }
		}
		
		return count;
		
	}
	public static void main(String[] args) {
		SubarraySumEqualsK obj = new SubarraySumEqualsK();
		int[] nums= {1,2,3};
		int k = 3;
		System.out.println(obj.getTotalSubarrays(nums, k));
	}
}
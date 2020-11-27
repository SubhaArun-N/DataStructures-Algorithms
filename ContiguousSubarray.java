package ProblemSheet;

import java.util.HashMap;
public class ContiguousSubarray{
	
	public int getMaxLength(int[] nums) {
		if(nums.length==0 || nums==null) {
			return 0;
		}
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int rsum = 0, max = 0;
		map.put(0, -1);
		int diff = 0;
		
		for(int i = 0;i<nums.length;i++) {
			
			if(nums[i]==1) {
				rsum = rsum+1;
			}else {
				rsum = rsum -1;
			}
			
		 
			if(!map.containsKey(rsum)) {
				map.put(rsum,  i);
			}else {
				diff = i-map.get(rsum);
				max = Math.max(max, diff);
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		ContiguousSubarray obj = new ContiguousSubarray();
		int[] nums= {0,1,0};
		System.out.println(obj.getMaxLength(nums));
		
	}
}
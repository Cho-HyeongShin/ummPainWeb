package algorithm;

import java.util.*;

public class leetcode_twosum {
	
	class Solution {
	    public int[] twoSum(int[] nums, int target) {
	       int[] ans = new int[2];
	       HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	        
	        for(int i=0; i<nums.length ; i++){
	            if(hm.containsKey(target-nums[i])){
	                ans[0] = i;
	                ans[1] = hm.get(target-nums[i]);
	            }
	            hm.put(nums[i],i);
	        }
	        return ans;
	    }
	}

}

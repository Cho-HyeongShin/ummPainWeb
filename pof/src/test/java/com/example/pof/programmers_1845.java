import java.util.HashSet;
import java.util.Set;
	
public class programmers_1845 {

	public static void main(String[] args) {
		// 1845
		class Solution {
		    public int solution(int[] nums) {
		        int answer = 0;
		        
		        Set<Integer> set = new HashSet<>();
		        int size=nums.length;
		        
		        for(int i=0; i<size; i++) {
		        	if(!set.contains(nums[i])) {
		        		set.add(nums[i]);
		        		if(++answer==size/2) break;
		        	}
		        }
		        
		        return answer;
		    }
		}
	}


}

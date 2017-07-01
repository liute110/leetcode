package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllDuplicatesInArray fd = new FindAllDuplicatesInArray();
		int[] nums = {2,2};
		for(Integer i:fd.findDuplicates(nums))
			System.out.println(i);
		
	}
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i < nums.length;i++) {
        	int index = Math.abs(nums[i]);
        	if(nums[index-1] < 0)
        		result.add(index);
        	else
        		nums[index-1] = nums[index-1] * (-1);
        }
        return result;
    }
	
}

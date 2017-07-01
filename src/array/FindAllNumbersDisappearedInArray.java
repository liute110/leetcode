package array;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i < nums.length;i++) {
        	int index = Math.abs(nums[i]);
        	nums[index-1] = Math.abs(nums[index-1]) * (-1);
        }
        for(int i=0;i<nums.length;i++) {
        	if(nums[i] > 0)
        		result.add(i);
        }
        return result;
    }
	

}

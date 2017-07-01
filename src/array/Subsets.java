package array;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		//res.add(new ArrayList<Integer>());
		int lenNums = nums.length;
		for(int i=0; i<lenNums;i++) {
			int lenRes = res.size();
			for(int j=0; j<lenRes; j++) {
				List<Integer> tmp =  (List<Integer>)((ArrayList<Integer>)res.get(j)).clone();
				tmp.add(nums[i]);
				res.add(tmp);
			}
			List<Integer> tmp = new ArrayList<Integer>() {};
			tmp.add(nums[i]);
			res.add(tmp);
		}
		res.add(new ArrayList<Integer>() {});
		return res;
        
    }

}

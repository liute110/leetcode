package array;
import java.util.ArrayList;
import java.util.List;
public class CombinationSum {
	List<List<Integer>> res;
	List<Integer> elem;
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        elem = new ArrayList<>();
        getCombination(candidates, target, 0, 0);
        return res;
    }
	
	public void getCombination(int[] candidates, int target, int sum, int level) {
		if(sum>target) return;
		if(sum==target) {
			res.add(new ArrayList<>(elem));
		}
		for(int i=level; i<candidates.length; i++) {
			elem.add(candidates[i]);
			getCombination(candidates, target, sum+candidates[i], i);
			elem.remove(elem.size()-1);
		}
	}
}

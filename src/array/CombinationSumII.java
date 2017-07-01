package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> elem = new ArrayList<>();
        int[] can = candidates.clone();
        Arrays.sort(can);
        for(int i=0; i<can.length; i++) {
            if((i==0)||(i>0&&can[i]!=can[i-1])){
                sub(res, can, elem, i, target);
            }
        	
        }
        return res;
    }
    
    public void sub(List<List<Integer>> res, int[] can, List<Integer> elem, int index, int target) {
    	
    	if(target==can[index]) {
    		elem.add(can[index]);
    		res.add(new ArrayList<>(elem));
    		elem.remove(elem.size()-1);
    		return;
    	}else if(target>can[index]) {
    		for(int i=index+1; i<can.length; i++) {
    		    if((i==index+1)||(i>index+1&&can[i]!=can[i-1])){
        			elem.add(can[index]);
        			sub(res, can, elem, i, target-can[index]);
        			elem.remove(elem.size()-1);
    		    }
			}
    	}
    	return;
    }
    
}

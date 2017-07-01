package array;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set; 
public class SubsetsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    	List<List<Integer>> res  = new ArrayList<>();
    	int len = nums.length;
    	int[] num = nums;
    	Arrays.sort(nums);
    	res.add(new ArrayList<>());
    	sub(0,new ArrayList<>(),len,num,res);
    	return res;
    }
    
    public void sub(int start, List<Integer> ans,int len,int[] num,List<List<Integer>> res) {
    	int flag = 0;
    	for(int i=start; i<len; i++) {
    		if(i>0 && flag==1 && num[i]==num[i-1]) continue;
    		ans.add(num[i]);
    		flag = 1;
    		res.add(new ArrayList<Integer>(ans));
    		sub(i+1,ans,len,num,res);
    		ans.remove(ans.size()-1);
    	}
    	return;
    	
    }
}

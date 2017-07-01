package array;


import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CombinationSumIII cs3 = new CombinationSumIII();
		List<List<Integer>> res = cs3.combinationSum3(3,7);
		System.out.println(res.get(0).size());
		for(List<Integer> i :res)
			for(int j:i)
				System.out.println(j);

	}
	
	
	
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> res = new LinkedList<>();
		List<Integer> ele = new LinkedList<Integer>();
		subCombine(k, n, 1, res, ele);
		return res;
        
    }
	
	public void subCombine(int k,int n,int index,List<List<Integer>> res,List<Integer> ele) {
		if(n < 0) return;
		if (n == 0 && ele.size() == k) {
			res.add(new LinkedList(ele));
			return;
		}
		for(int i=index;i<10;i++) {
			ele.add(i);
			subCombine(k, n-i, i+1, res, ele);
			ele.remove(ele.size()-1);
		}
		
	}

}

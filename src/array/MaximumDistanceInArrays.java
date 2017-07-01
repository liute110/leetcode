package array;
import java.util.ArrayList;
import java.util.List;
public class MaximumDistanceInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> num = new ArrayList<>();
		ArrayList<Integer> tmp1 = new ArrayList<Integer>();
		tmp1.add(1);
		tmp1.add(4);
		List<Integer> tmp2 = new ArrayList<Integer>();
		tmp2.add(0);
		tmp2.add(5);
		num.add(tmp1);
		num.add(tmp2);
		MaximumDistanceInArrays mc = new MaximumDistanceInArrays();
		System.out.println(mc.maxDistance(num));
	}
	
    public int maxDistance(List<List<Integer>> arrays) {
        int min = 0;
        int max = 0;
        int i;
        int res = 0;
        for(i=0; i<arrays.size(); i++) {
        	if(arrays.get(i).size()==0)
        		continue;
        	else {
        		min = arrays.get(i).get(0);
        		max = arrays.get(i).get(arrays.get(i).size()-1);
        		break;
        	}
        }
        int index = i;
        for(i=index+1; i<arrays.size(); i++) {
        	if(arrays.get(i).size()==0) continue;
        	res = Math.max(res, Math.max(Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-min), Math.abs(arrays.get(i).get(0)-max)));
        	min = Math.min(min,arrays.get(i).get(0));
        	max = Math.min(max,arrays.get(i).get(arrays.get(i).size()-1));
        }

        return res;
    }

}

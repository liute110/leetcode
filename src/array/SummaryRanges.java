package array;
import java.util.List;
import java.util.ArrayList;
public class SummaryRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SummaryRanges sr = new SummaryRanges();
		int[] nums = {-2147483648,-2147483647,2147483647};
		for(String s:sr.summaryRanges(nums))
			System.out.println(s);

	}
	
	
    public List<String> summaryRanges(int[] nums) {
        int curs = 0;
        int cure = 0;
        List<String> res = new ArrayList<String>();
        if(nums.length<=0) return res;
        for(int i=1; i<nums.length; i++) {
        	if(Math.abs(nums[i]-nums[cure]) == 1)
        		cure++;
        	else if(Math.abs(nums[i]-nums[cure]) > 1) {
        		if(curs==cure)
        			res.add(String.valueOf(nums[cure]));
        		else {
        			res.add(nums[curs]+"->"+nums[cure]);
        		}
        		curs = i;
        		cure = i;
        	}
        }
        if(curs==cure)
			res.add(String.valueOf(nums[cure]));
		else {
			res.add(nums[curs]+"->"+nums[cure]);
		}
        return res;
    }

}

package string;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MinimumTimeDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nums = new LinkedList<>();
		nums.add("02:00");
		nums.add("00:00");
		nums.add("23:59");
		
		MinimumTimeDifference mt = new MinimumTimeDifference();
		mt.findMinDifference(nums);

	}
	
    public int findMinDifference(List<String> timePoints) {
    	int min = Integer.MAX_VALUE;
    	Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[] tm1 = o1.split(":");
				String[] tm2 = o2.split(":");
				int re1 = Integer.parseInt(tm1[0]) * 60 + Integer.parseInt(tm1[1]);
				int re2 = Integer.parseInt(tm2[0]) * 60 + Integer.parseInt(tm2[1]);
				return re1 - re2;
			}
			 
		};
		Collections.sort(timePoints, comparator);
		for(int i=0; i<timePoints.size(); i++) {
			System.out.println(timePoints.get(i));
		}
		for(int i=1; i<timePoints.size(); i++) {
			String[] tm1 = timePoints.get(i-1).split(":");
			String[] tm2 = timePoints.get(i).split(":");
			int re1 = Integer.parseInt(tm1[0]) * 60 + Integer.parseInt(tm1[1]);
			int re2 = Integer.parseInt(tm2[0]) * 60 + Integer.parseInt(tm2[1]);
			if(re2-re1<min) min = re2-re1;
		}
		
		String[] tm1 = timePoints.get(0).split(":");
		String[] tm2 = timePoints.get(timePoints.size()-1).split(":");
		int re1 = Integer.parseInt(tm1[0]) * 60 + Integer.parseInt(tm1[1]);
		int re2 = Integer.parseInt(tm2[0]) * 60 + Integer.parseInt(tm2[1]);
		if(re2-re1<min) min = re2-re1;
		if(re1+60*24-re2<min) min = re1+60*24-re2;
		return min;
        
    }

}

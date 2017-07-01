package array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}
public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<Interval>();
        if(intervals==null || intervals.size()==0)
        	return intervals;
        Comparator<Interval> comp = new Comparator<Interval>() {
        	@Override
        	public int compare(Interval i1, Interval i2) {
        		if(i1.start==i2.start)
        			return i1.end - i2.end;
        		return i1.start - i2.start;
        	}
		};
		
		Collections.sort(intervals,comp);
		
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		
		for (int i = 1; i < intervals.size(); i++) {
    		Interval inter = intervals.get(i);
    		if (inter.start > end) {
    			res.add(new Interval(start, end));
    			start = inter.start;
    			end = inter.end;
    		} else {
    			end = Math.max(end, inter.end);
    		}
    	}
    	res.add(new Interval(start, end));
	    return res; 
    }

}

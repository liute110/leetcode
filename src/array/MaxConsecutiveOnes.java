package array;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxnum = 0;
        int curmax = 0;
        for(int i:nums) {
        	if(i == 1)
        		curmax++;
        	else
        		curmax = 0;
        	if(curmax > maxnum)
        		maxnum = curmax;
        }
        return maxnum;
    }

}

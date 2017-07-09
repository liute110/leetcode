package string;

public class OptimalDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1000,100,10,2};
		OptimalDivision od = new OptimalDivision();
		System.out.println(od.optimalDivision(nums));
	}
	
    public String optimalDivision(int[] nums) {
        if(nums.length==0) return "";
        if(nums.length==1) return String.valueOf(nums[0]);
        if(nums.length==2) return nums[0] + "/" + nums[1];
        StringBuilder res = new StringBuilder(String.valueOf(nums[0])+"/(");
        for(int i=1; i<nums.length; i++) {
        	res.append(String.valueOf(nums[i])+"/");
        }
        res.delete(res.length()-1, res.length());
        res.append(")");
        return res.toString();
    }

}

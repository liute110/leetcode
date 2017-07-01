package array;

public class TwoSumIIInputArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumIIInputArrayIsSorted ts = new TwoSumIIInputArrayIsSorted();
		int[] num = {2, 7, 11, 15};
		for(int i:ts.twoSum(num, 9))
			System.out.println(i);

	}
	
	public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
        	if(numbers[low] + numbers[high] == target) {
        		output[0] = low + 1;
        		output[1] = high + 1;
        		break;
        	}
        	else if(numbers[low] + numbers[high] > target)
        		high --;
        	else
        		low ++ ;	
        }
        return output;
        
    }

}

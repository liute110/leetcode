package array;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {0,0,3,0,0,0,0};
		int[] nums2 = {-1,1,2,3};
		MergeSortedArray ms = new  MergeSortedArray();
		ms.merge(nums1, 3, nums2, 4);

	}
	
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0; i<n; i++)
                nums1[i] = nums2[i];
            return;
        }
        for(int i=0; i<n; i++) {
        	int index = 0;
        	while(nums2[i]>nums1[index] && index < m) {
        		index++;
        	}
        	m++;
        	for(int j=m-1; j>index; j--) 
        		nums1[j] = nums1[j-1];
        	nums1[index] = nums2[i];
        }
    }
}

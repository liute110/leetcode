package sort;

public class QuickSort {
	public int getKeyIndex(int[] numbers,int low,int high) {
		int temp = numbers[low];
		while(low < high) {
			while(low < high && numbers[high] > temp) {
				high--;
			}
			while(low < high && numbers[high] <= temp) {
				numbers[low] = numbers[high];
				low++;
				numbers[high] = numbers[low];
			}
		}
		numbers[low] = temp;
		return low;
	}
	
	
	public void quickSort(int[] numbers,int low ,int high) {
		if(low < high) {
			int keyIndex = getKeyIndex(numbers, low, high);
			quickSort(numbers, low, keyIndex-1);
			quickSort(numbers, keyIndex+1, high);
		}
	}

}

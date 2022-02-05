
public class MergeSortDes {

	public static void main(String[] args) {
		int[] intArray = { 20, 35, -15, 7, 55, 1, -22};
		
		mergeSort(intArray, 0, intArray.length);
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void mergeSort(int[] input, int start, int end) {
		
		if(end - start < 2) {
			return;
		}
		
		int mid = (start + end) / 2;
		mergeSort(input, start, mid);
		mergeSort(input, mid, end);
		merge(input, start, mid, end);		
		
	}
	
	// { 20, 35, -15, 7, 55, 1, -22};
	public static void merge(int[] input, int start, int mid, int end) {
		
		if(input[mid -1] >= input[mid]) {
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex = 0;
		
		int[] temp = new int[end - start];
		while(i < mid && j < end) {
			//if i is <= than j, i++ goes to tempIndex++ and viseversa
			temp[tempIndex++] = input[i] >= input[j] ? input[i++] : input[j++];
		}

		// source array, index that has not been handled, destination array, destination index, int length
		// this line handles left over number after merge
		System.arraycopy(input, i, input, start + tempIndex, mid - i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}

}

// merge sort is divide and conquer. It is faster than insertion/ selection/shell or bubble sort.
// stable algorithm
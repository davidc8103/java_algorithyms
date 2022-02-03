
public class SelectionSort {

	public static void main(String[] args) {
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
				lastUnsortedIndex--) {
			
			int largest = 0;
			
			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}
			
			swap(intArray, largest, lastUnsortedIndex);
		}
		
		for (int i = 0; i < intArray.length; i++ ) {
			System.out.println(intArray[i]);
		}

	}
	
	//swap method
	public static void swap(int[] array, int i, int j) {
		if(i == j) {
			return;
		}
		
		// position of i and j are swapped
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}

// selection sort is unstable sort algorithms.
// swap last index number with largest number. swap starts from backward(last index - 1)
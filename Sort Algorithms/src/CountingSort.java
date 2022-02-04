
public class CountingSort {

	public static void main(String[] args) {
		
		int[] intArray = { 2, 5, 9, 8, 3, 8, 7, 10, 4, 3 };
		
		countingSort(intArray, 1, 10);
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}

	}
	
	public static void countingSort(int[] input, int min, int max) {
		
		// create array large enough to hold intArray length
		int[] countArray = new int[(max - min) + 1];
		
		//counting phase
		for(int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}
		
		// j is index to write input array
		int j = 0;
		// i is index to use traverse countArray
		for (int i = min; i <= max; i++) {
			while(countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
		}
		
	}

}

// only works with whole number, not negative or float.
// this won't work on big array with huge length.
// this is unstable algorithms.
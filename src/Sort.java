
//Christopher Valerio

/**
 * Integer Sort class with bubble and selection sort methods
 * 
 * Both sorting algorithms average time complexity of O(n^2)
 * @author Christopher Valerio
 */
public class Sort {

	/**
	 * Implements selection sort algorithm on a given unsorted array of integers.
	 * 
	 * Selection Sort repeatedly loops through the given unsorted array, each loop iteration finds the smallest number
	 * and swaps the newly found min num number with the next value contained at start of unsorted portion of inputted array 
	 * 
	 * @param sortArr - integer array of some size containing, random unsorted numbers. Array to be sorted by function call
	 */
	public void selectionSort(int[] sortArr) {
		int sLoc = 0;
		int min;// = sort[0];
		int indexMin;// = 0;
		for(int i = 0; i < sortArr.length; i++) {
			min = sortArr[i];
		    indexMin = i;
		    
			for(int j = sLoc + 1; j < sortArr.length; j++) {
				if(sortArr[j] < min) {
					min = sortArr[j];
					indexMin = j;
				}
			}
			swap(sortArr, sLoc++, indexMin);
		}
		
	}
	
	/**
	 * Implements Bubble Sort algorithm on a given unsorted array of integers.
	 * 
	 * Repeatedly loops through unsorted array, comparing adjacent elements and swapping them
	 * if they're in the wrong order
	 * 
	 * @param sortArr - integer array of some size containing, random unsorted numbers. Array to be sorted by function call
	 */
	public void bubbleSort(int[] sortArr) {
		int len = sortArr.length;
		int rearIndex = len - 1; 
		for(int i = 0; i < len; i++) {
			int swaps = 0;
			for(int j = 0; j < rearIndex; j++) {
				if(sortArr[j] > sortArr[j + 1]) {
					swap(sortArr, j, j + 1);
					swaps++;
				}
			}
			if(swaps == 0)
				return;
			rearIndex--;
			
		}
		
	}
	
	/**
	 * 
	 * simple swap method which is given an array as input along with 
	 * two array indexes. swaps value currently at index1 with value currently at index2 
	 * 
	 * @param srcArray - given array to perform value swap on
	 * @param index1 - array index of first value to swap
	 * @param index2 - array index of second value to swap 
	 */
	public void swap(int[] srcArray, int index1, int index2) {
		int temp = srcArray[index1];
		srcArray[index1] = srcArray[index2];
		srcArray[index2] = temp;
	}
	
}


//Christopher Valerio

public class Sort {

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
	
	public void swap(int[] srcArray, int index1, int index2) {
		int temp = srcArray[index1];
		srcArray[index1] = srcArray[index2];
		srcArray[index2] = temp;
	}
	
}

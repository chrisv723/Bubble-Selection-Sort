import java.math.BigDecimal;
import java.util.Random;

//Christopher Valerio

public class Main {
	
	public static void main(String[] args) {
		
		Sort test = new Sort();
		Random ran = new Random();
		
		int[] my = {ran.nextInt(505050),ran.nextInt(505050), ran.nextInt(505050),
				ran.nextInt(505050), ran.nextInt(505050), ran.nextInt(505050)};
		
		int[] copyArr = my.clone();

		System.out.println("Original Array: ");
		for(int i: my) {
			System.out.println(i);
		}
		
		// HERE STARTS SELECTION SORT
		
		long startTime = System.nanoTime();
		test.selectionSort(my);
		long duration = System.nanoTime() - startTime;
		float seconds = ((float)duration / (float)1000000000);
		System.out.println("\nArray After Selection-Sort: with a total runtime of " + duration + "ns OR " + new BigDecimal(seconds + "") + "s\n");
		for(int i: my) {
			System.out.println(i);
		}
		
		
		// HERE STARTS BUBBLE SORT
		
		startTime = System.nanoTime();

		test.bubbleSort(copyArr);
		
	    duration = System.nanoTime() - startTime;
	    seconds = ((float)duration / (float)1000000000);
	    
		System.out.print("\nArray After bubble-Sort: with a total runtime of " + duration + "ns OR " + new BigDecimal(seconds + "") + "s\n");
		//System.out.println("\nArray After Bubble-Sort: with a total runtime of: \"" + new BigDecimal(seconds + "") + "s\"\n");
		
		for(int i: copyArr) {
			System.out.println(i);
		}
		
			
	}
}

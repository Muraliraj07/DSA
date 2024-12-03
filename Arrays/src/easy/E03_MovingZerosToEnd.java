package easy;

import java.util.Arrays;

public class E03_MovingZerosToEnd {
	public static void main(String args[]) {
		int[] elements = {0, 2, 4, 8, 0, 3, 0};
		System.out.println(Arrays.toString(moveZerosToEndSol2(elements)));
	}
	public static int[] moveZerosToEndSol1(int[] elements) {
		if(elements.length > 0) {
			int[] orderedArray = new int[elements.length -1];
			int counter = 0;
			for(int i=0; i<elements.length; i++) {
				if(elements[i] != 0) {
					orderedArray[counter] = elements[i];
					counter++;
				}
			}
			while(counter != elements.length -1) {
				orderedArray[counter] = 0;
				counter++;
			}
			return orderedArray;
		}
		return null;
	}
	
// Optimized Solution	
	public static int[] moveZerosToEndSol2(int[] elements) {
		if (elements == null || elements.length == 0) {
            return elements; 
        }
		 int nonZeroIndex = 0; 
		 for(int i=0; i<elements.length; i++) {
			 if(elements[i] != 0) {
				 elements[nonZeroIndex] = elements[i];
				 if(nonZeroIndex != i) {
					 elements[i] = 0;
				 }
				 nonZeroIndex++;
			 }
		 }
		return elements;
	}
}

package easy;

public class E04_CheckArrayIsSorted {
	public static void main(String args[]) {
		int[] elements = {0, 2, 4, 8};
		System.out.println((isSortedSol1(elements)));
		System.out.println((isSortedSol2(elements)));

	}
	
/*
	Time Complexity: O(N^2)

	Space Complexity: O(1)
*/
	public static boolean isSortedSol1(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					return false;
				}
			}
		}
		return true;
	}

/* Optimized 
	 Time Complexity: O(N)

	 Space Complexity: O(1)
*/
	public static boolean isSortedSol2(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}

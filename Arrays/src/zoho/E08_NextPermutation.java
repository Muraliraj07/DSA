package zoho;

import java.util.Arrays;

public class E08_NextPermutation {

	public static void main (String args[]) {
		int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 2]

	}
	
	public static void nextPermutation(int[] arr) {
		int n = arr.length;
		int i = n - 2;
		
		// finding first decreasing element from the right
		while(i >= 0 && arr[i] >= arr[i+1]) {
			i--;
		}
		
		if(i >= 0) {
			// finding the just greater element to the right of i
			int j = n-1;
			while(arr[j] <= arr[j-1]) {
				j--;
			}
			
			// Swap nums[i] and nums[j]
			swap(arr, i, j);
			
			// Reverse the subarray after i
	        reverse(arr, i + 1, n - 1);
		}
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			swap(arr, start, end);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] =  arr[j];
		arr[j] =  tmp;
	}
	
}

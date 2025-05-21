package zoho;

import java.util.Arrays;

public class E12_MergeTwoSortedArray {

	public static void main (String args[]) {
		int[] nums1 = {1,2,3}; 
		int[] nums2 = {2,5,6};
		
		int[] nums3 = {1,2,3,0,0,0};
		
		int[] result = mergeAndReturnNewArr(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}
	
	// Creating new Array
	public static int[] mergeAndReturnNewArr(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];
		
		int i = 0, j = 0, k = 0;
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] <= arr2[j]) {
				result[k++] =  arr1[i++];
			}
			else {
				result[k++] = arr2[j++];
			}
		}
		while(i<arr1.length) result[k++] = arr1[i++];
		while(j<arr2.length) result[k++] = arr2[j++];
		
		return result;
	}
	
	// Merging into first array
	public static int[] mergeToFirstArray(int[] arr1, int[] arr2) {
		
		
		
		return arr1;
	}
	
}

package easy;

import java.util.Arrays;

public class E01_Largest_Ele {
	public static void main(String args[]) {
		int arr[] = {1, 8, 7, 56, 90};
		System.out.println("Approach 1 --> "+largestApr1(arr));
		System.out.println("Approach 2 --> "+largestApr2(arr));
	}
	/*
	 * Approach 1 : Brute Force
	 * 
	 * Time Complexity : O(N*log(N))
	 * Space Complexity: O(n)
	 */	
	static int largestApr1(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length -1];
	}
	
	/*
	 * Approach 2 : Recursive Approach
	 * 
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 */	
	static int largestApr2(int arr[]) {
		int n = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > n) {
				n=arr[i];
			}
		}
		return n;
	}
	
}

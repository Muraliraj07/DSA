package easy;

import java.util.Arrays;

public class E01_Largest_Ele {
	public static void main(String args[]) {
		
	}
	/*
	 * Approach 1 : Brute Fource
	 * 
	 * Time Complexity : O(N*log(N))
	 * Space Complexity: O(n)
	 */	
	static int largest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length -1];
	}
	
	/*
	 * Approach 2 : Recursive Approach
	 * 
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 */	
	
}
package easy;

public class E02_SecLarg_SecSmall_Ele {
	public static void main(String args[]) {
		int arr[] = {12, 35, 1, 60, 1};
		System.out.println("Second Largest ---> "+secLargApr1(arr));
		System.out.println("Second Smallest ---> "+secSmallestApr1(arr));
	}

	/* Approach 1 :
	 * 
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 */		
	static int secLargApr1(int arr[]) {
		if(arr == null || arr.length < 2) {
			return -1;
		}
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for(int n : arr) {
			if(n > largest) {
				secLargest = largest;
				largest = n;
			}
			else if(n > secLargest && n != largest) {
				secLargest = n;
			}
		}
		return (secLargest == Integer.MIN_VALUE) ? -1 : secLargest;
	}
	
	/* Approach 1 :
	 * 
	 * Time Complexity: O(N)
	 * Space Complexity: O(1)
	 */	
	static int secSmallestApr1(int arr[]) {
		if(arr == null || arr.length < 2) {
			return -1;
		}
		int smallest = Integer.MAX_VALUE;
		int secSmallest = Integer.MAX_VALUE;
		
		for(int n : arr) {
			if(n < smallest) {
				secSmallest = smallest;
				smallest = n;
			}
			else if(n < secSmallest && n != smallest) {
				secSmallest = n;
			}
		}
		return (secSmallest == Integer.MAX_VALUE) ? -1 : secSmallest;
	}
	
}

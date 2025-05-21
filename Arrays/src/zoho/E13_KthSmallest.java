package zoho;

import java.util.Collections;
import java.util.PriorityQueue;

public class E13_KthSmallest {

	public static void main(String args[]) {
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		System.out.println(kthSmallest(arr, k));
	}
	
	public static int kthSmallest(int[] arr, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int num : arr) {
			maxHeap.add(num);
			if(maxHeap.size() > k) {
				maxHeap.poll(); // removing first ele when it having size more than k
			}
		}
		return maxHeap.peek(); // Returning first ele
	}
	
}

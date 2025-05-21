package zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class E07_TripletSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, -1, 0, -2, 1};
        int target = 0;
        List<List<Integer>> triplets = threeSum(arr, target);
        for(List<Integer> triplet: triplets) {
        	System.out.println(triplet);
        }
	}
	
	public static List<List<Integer>> threeSum(int[] arr, int target){
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			if(i > 0 && arr[i] ==  arr[i-1]) {
				continue;
			}
			
			int left = i+1;
			int right = arr.length-1;
			
			while(left < right) {
				int sum = arr[i] + arr[left] + arr[right];
				
				if(sum == target) {
					result.add(Arrays.asList(arr[i], arr[left], arr[right]));
					
					// Skip Duplicates
					while(left < right && arr[left] == arr[left+1]) left++;
					while(left <right && arr[right] ==  arr[right-1]) right--;
					
					left++;
					right--;
				}
				else if(sum < target) {
					left++;
				}
				else {
					right--;
				}
			}
		}
		return result;
		
	}

}

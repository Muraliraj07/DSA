package hard;

public class E02_Permutation_Operation_Count {

	public static void main(String args[]) {
		int arr[] = {1,1,3,3,4};
		System.out.println(findCount(arr));
	}
	
	static int findCount(int[] arr) {
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			int exp = i+1;
			if(arr[i] != exp) {
				count += Math.abs(arr[i] - exp);
			}
		}
		return count;
	}
}

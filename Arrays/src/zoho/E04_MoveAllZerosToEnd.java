package zoho;

public class E04_MoveAllZerosToEnd {

	public static void main(String args[]) {
		int[] arr = {1, 2, 0, 5, 0, 1};
		moveZeros(arr);
		for (int num : arr) {
            System.out.print(num + " ");
        }
	}
	
	public static void moveZeros(int[] arr) {
		int j = 0;
		int n = arr.length; 
		for(int i=0; i<n; i++) {
			if(arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		while(j<n) {
			arr[j] = 0;
			j++;
		}
		
	}
	
}

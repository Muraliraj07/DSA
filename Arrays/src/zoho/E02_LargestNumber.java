package zoho;

import java.util.Arrays;
import java.util.Comparator;

public class E02_LargestNumber {
	
	public static String arrangeLargest(int []arr) {
		
		String [] s1 = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			s1[i]=String.valueOf(arr[i]);
		}
		
		Comparator<String> comp=(a,b)-> {
			String order1=a+b;
			String order2=b+a;
			return order2.compareTo(order1);
		//	return order1.compareTo(order2) > 0 ? -1 : 1;
			
		};
		System.out.println(Arrays.toString(s1));

		Arrays.sort(s1, comp);
		
		System.out.println(Arrays.toString(s1));
		
		
		StringBuilder res = new StringBuilder();
		for(String s: s1) {
			res.append(s);
		}
		return  res.toString();
	}
	
	
	public static void main(String[] args) {
		int []arr= {546, 54, 548, 60};
		String ans= arrangeLargest(arr);
		System.out.println(ans);
	}

}

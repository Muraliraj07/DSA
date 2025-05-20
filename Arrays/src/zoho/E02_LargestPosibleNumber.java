package zoho;

import java.util.Arrays;
import java.util.Comparator;

public class E02_LargestPosibleNumber {
	
	public static String arrangeLargest(int []arr) {
		
		// Integer to string conversion
		String [] s1 = new String[arr.length];
		for(int i=0; i<arr.length; i++) {
			s1[i]=String.valueOf(arr[i]);
		}
		
		Comparator<String> comp=(a,b)-> {
			String order1=a+b;
			String order2=b+a;
			return order2.compareTo(order1);
			
		};
		System.out.println(Arrays.toString(s1));
		
		Arrays.sort(s1, comp);
		
		if (s1[0].equals("0")) {
            return "0";
        }
		
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

package zoho;

import java.util.*;

public class E03_CountBetweenSameChar {

	public static void main(String[] args) {
		
		String s="ansrseevsada";
		int currMax;
		int max=0;
		int[] index=new int[128];
		
		for(int i=0; i<index.length; i++) {
			index[i]=-1;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			int n = (int) c;
			
			if(index[n] == -1) {
				index[n]=i;
			}
			else {
				currMax= i-index[n]-1;
				if(currMax>max) {
					max=currMax;
				}
			}
		}
		System.out.println(max);
		
		
		SortedSet<Integer> rollNo = new TreeSet<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
			return 0;
			}
			});

			rollNo.add(10);
			rollNo.add(0);
			rollNo.add(20);
			rollNo.add(30);
			System.out.println(rollNo);
	}

}

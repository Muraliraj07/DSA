package zoho;

import java.util.*;

public class E03_CountBetweenSameChar {

	public static void main(String[] args) {
		
		String s="nasrseevsada";
		
		System.out.println("Count Sol 1 --> " + countBetweenSol1(s));
		System.out.println("Count Sol 2 --> " + countBetweenSol2(s));
	}
	
	// Best approach to find all gap for all characters
	public static int countBetweenSol1(String input) {
		int max = 0;
		HashMap<Character, Integer> firstIndex = new HashMap<>();
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			if(!firstIndex.containsKey(c)) {
				firstIndex.put(c, i);
			}
			else {
				int gap = i - firstIndex.get(c) - 1;
				if(gap > max) {
					max = gap;
				}
			}
		}
		return max;
	}
	
	public static int countBetweenSol2(String input) {
		int max = 0;
		
		for(int i=0; i<input.length(); i++) {
			char c = input.charAt(i);
			int first = input.indexOf(c);
			int last = input.lastIndexOf(c);
			if(first != last) {
				max = last - first - 1; 
				return max;
			}
		}
		return 0;
	}
	
}

package zoho;

import java.util.HashMap;

public class E09_LongestUniqueSubString {

	public static void main(String args[]) {
		 String s = "abcabcdbb";
	     System.out.println(lengOfLongSubString(s));
	}
	
	// Sliding window 
	public static int lengOfLongSubString(String s) {
		int maxLength = 0; int left = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int right = 0; right < s.length(); right++) {
			char currentChar = s.charAt(right);
			
            // If duplicate character is inside the current window
			if(map.containsKey(currentChar) && map.get(currentChar) >= left) {
				left = map.get(currentChar)+1;
			}
			
			map.put(currentChar, right);
			maxLength = Math.max(maxLength, right - left + 1); // right - left + 1 -- gives length of current window
		}
		
		return maxLength;
		
	}
}

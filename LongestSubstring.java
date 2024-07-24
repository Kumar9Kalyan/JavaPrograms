package programs.leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstring  {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s= sc.next();
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	
	 public static int lengthOfLongestSubstring(String s) {
		 int lengthOfSubstring =0;
		 int size= s.length();
		 int left=0;
		 Set<Character> setChar = new HashSet<Character>();
		 for(int right=0;right<size;right++) {
			 if(!setChar.contains(s.charAt(right))) {
				 setChar.add(s.charAt(right));
				 lengthOfSubstring= Math.max(lengthOfSubstring, right-left+1);
			 }
			 else {
				 while(setChar.contains(s.charAt(right))) {
				 setChar.remove(s.charAt(left));
				 left++;
				 }
				 setChar.add(s.charAt(right));
				 
			 }
			 
		 }
		 return lengthOfSubstring;
	 }
}
	
	
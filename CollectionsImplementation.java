package programs.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsImplementation {
	
	


	public static void main(String[] args) {
		
		List<String> words = new ArrayList<String>();
		
		words.add("Grapes");
		words.add("Banana");
		words.add("Apple");
		
		
		
		System.out.println("Element before any operation: ");
		System.out.println(words);
		
		System.out.println("Elements after operation: ");
		
		//Using Collections utility static method to add elements to collection 'List'
		Collections.addAll(words, "Papaya","Muskmelon");
		
		System.out.println(words);
		
		Collections.sort(words);
		
		//Elements after sorting is performed
		System.out.println("\nElements after sorting is performed: ");
		System.out.println(words);
		
	}
	

}

	
	 

	


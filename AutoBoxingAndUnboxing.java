package programs.leetcode;

public class AutoBoxingAndUnboxing {

	public static void main(String args[]) {
		
		//Example 1
		int a =10;
		
		//Autoboxing: Converting primitive type to Integer type object
		Integer num = Integer.valueOf(a);
		
		//Autounboxing or unboxing is converting wrapper class objects(Example: Integer,Float) to primitive type (Example: int,float)
		int x = num;
		
		//Example 2
		char m ='f';
		
		Character c = Character.valueOf(m);
		
		char r = c;
		
	}
}

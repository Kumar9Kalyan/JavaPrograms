package programs.leetcode;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		MainClass m1= new SubClass1();
		MainClass m2= new SubClass2();
		m1.print();
		
		m2.print();
		}
}

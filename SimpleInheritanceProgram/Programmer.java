package programs.leetcode;


//Class programmer extending class Employee by using inheritance concept of java
public class Programmer extends Employee {



	public static void main(String[] args)  {
	
		Programmer pro = new Programmer();
		
		pro.setSalary(10000.0f);
		
		System.out.println("Salary of the programmer:"+ pro.getSalary());
		
	
	
	}
}
	
	
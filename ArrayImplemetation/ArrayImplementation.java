package programs.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayImplementation {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7};
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Element at index"+i+":"+arr1[i]);
		}
		
		//Performing deep copy of array elements
		int arr2[] = arr1.clone();
		//References of two arrays are compared,equals() also compares the references but the latter is disallowed
		//System.out.println(arr2.equals(arr1));
		System.out.println(arr2==arr1);
		//Compares the number and pair of elements in both the arrays
		System.out.println(Arrays.equals(arr1, arr2));
		
		
		Student[] studentArr = new Student[5];
		
		studentArr[0]=new Student(1,"Shrike");
		studentArr[1]=new Student(2,"Peter");
		studentArr[2]=new Student(3,"Kishore");
		studentArr[3]=new Student(4,"Harish");
		studentArr[4]=new Student(5,"John");
		
		for(int i=0;i<studentArr.length;i++) {
			System.out.println(studentArr[i].roll_no+" "+studentArr[i].name);
			
		}
		
		//Accessing objects directly
		for(Student i: studentArr)
			System.out.println(i);
		
		
		//Collection Array
		
		List<Integer> a1= new ArrayList<>();
		a1.add(23);
		a1.add(33);
		a1.add(34);
		
		Set<Integer> a2=new HashSet<>();
		
		a2.add(2);
		a2.add(2);
		
		
		Collection[] a = {a1,a2};
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(Collection i: a){
		System.out.println(i);
		}
}
}

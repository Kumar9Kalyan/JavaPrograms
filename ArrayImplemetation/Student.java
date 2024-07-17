package programs.leetcode;

public class Student {

 int roll_no;
 String name;

public Student(int roll_no,String name) {
	this.roll_no=roll_no;
	this.name=name;
}

@Override
public String toString() {
	return "Roll no of student:"+roll_no+" "+"Name of student:"+name;
}
		

}

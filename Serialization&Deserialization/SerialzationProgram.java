package programs.leetcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialzationProgram{

	
		public static void main(String... args) {
		
			Student student = new Student(1L,"Kumar Kalyan",23);
			String file ="C:\\Users\\kumar\\Desktop\\daddy.txt";
			
			FileOutputStream output =null;
			ObjectOutputStream obj_out = null;
			
			//Serialization
			try {
				output = new FileOutputStream(file);
				obj_out = new ObjectOutputStream(output);
				
				obj_out.writeObject(student);;
				
				obj_out.close();
				output.close();
				
				System.out.println("Object has been serialized:\n" + student);
			
			}
			catch(FileNotFoundException e) {
				System.out.println("File not found exception occured");
			}
			
			catch(IOException e) {
				System.out.println("IO exception occured");
			}
			
			FileInputStream input = null;
			ObjectInputStream obj_in = null;
			
			//Deserialization
			try {
				input = new FileInputStream(file);
				obj_in = new ObjectInputStream(input);
				Student stu = (Student) obj_in.readObject(); 
				
				obj_in.close();
				input.close();
				System.out.println("Object has been deserialized: \n"+stu);
			}
			
			catch(FileNotFoundException e) {
				e.printStackTrace();
			}
			
			
			catch(IOException e) {
				e.printStackTrace();
			} 
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	
}

	


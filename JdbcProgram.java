package programs.leetcode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram  {



	public static void main(String[] args)  {
	
		
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String username="rootuser";
		String password= "rootpassword";
		String query ="select* from students";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 // (Or) Use this java inbuilt class to load the driver: DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection established successfully");
		Statement stat = con.createStatement();
		
		ResultSet result = stat.executeQuery(query );
		while(result.next()) {
			String name = result.getString("name");
			System.out.println("Name: "+ name);
		}
		result.close();
		stat.close();  
		con.close();
		System.out.println("Connection is closed");
		}
		catch(ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("Error occured in ClassNotFound");
		}
		catch(SQLException e) {
			//e.printStackTrace();
			System.out.println("Error occured in SQL");
		}
		
	}
	
	
	}
	
	
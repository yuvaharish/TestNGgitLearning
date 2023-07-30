package executionPack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class TestExe {
	
	
	
	@Test(groups = {"regerssion"})
	public void one() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 String url1 = "jdbc:mysql://localhost:3306/qadbt";
         String user = "root";
         String password = "root";
         
		Connection connoctor =DriverManager.getConnection(url1,user,password);
		
		Statement createStatement = connoctor.createStatement();
		ResultSet executeQuery = createStatement.executeQuery("SELECT * FROM Employeeinfo");
		while (executeQuery.next()) {
			String name = executeQuery.getString("name");
			String id = executeQuery.getString("id");
			String location = executeQuery.getString("location");
			String age = executeQuery.getString("age");
			
			System.out.println(name+" "+id+" "+location+age);
		}
		
	}
	
	@Test(groups = {"smoke"})
	public void two() {
		System.out.println("Two");
	}

}

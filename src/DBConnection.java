import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {	
	
		
	 
	
	public Connection connect(String dbUrl, String userName, String passWord) throws Exception {
		
			//establish connection to database		
			Connection conn = DriverManager.getConnection(dbUrl, userName, passWord);
			
			return conn;
			//conn.close();
			
			//create statement variable
			 		 
			 
			
			//creates variable to store results of executed query
			/*
			 *
			 */
			 
			
			//iterates over each entry in result set and prints to console			
			
			//System.out.println(title);
			//System.out.println(author);
			//System.out.println(isbn);
			//System.out.println(price);
			
			//closes connection to database
					
		
	}
	
	
	
	
}

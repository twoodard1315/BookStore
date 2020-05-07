import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StoreCode {	
	static String dbUrl = "jdbc:mysql://localhost:3306/bookstore";
	static String userName = "root";
	static String passWord = "Marlin67";
	
	public static void main(String[] args) throws Exception {
		//makeConn(dbUrl, userName, passWord);	
		//DBConnection conn = new DBConnection();
		//conn.conn(dbUrl, userName, passWord);
		
		StoreFrame store = new StoreFrame();
	}

}

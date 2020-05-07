import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ResultSets {	
	
	
	public ArrayList<String> resultTitle(Connection c) throws Exception {
		 ArrayList<String> title = new ArrayList<String>();
		 		 
		 Statement statement = c.createStatement();
		 
		 ResultSet rsTitle = statement.executeQuery("SELECT title FROM books");
		  while(rsTitle.next()) { 
			  title.add(rsTitle.getString("title")); 
		  }	  
		  
		  return title;
	}
	
	public ArrayList<String> resultAuthor(Connection c) throws Exception {		 
		 ArrayList<String> author = new ArrayList<String>();
				 
		 Statement statement = c.createStatement();		
		  
		  ResultSet rsAuthor = statement.executeQuery("SELECT author FROM books");
		  while(rsAuthor.next()) { 
			  author.add(rsAuthor.getString("author"));
		  
		  }
		  
		  return author;
	}
	
	public ArrayList<String> resultIsbn(Connection c) throws Exception {		 
		 ArrayList<String> isbn = new ArrayList<String>();		
		 
		  Statement statement = c.createStatement();
		 
		  ResultSet rsISBN = statement.executeQuery("SELECT isbn FROM books");
		  while(rsISBN.next()) { 
			  isbn.add(rsISBN.getString("isbn"));
		  
		  }
		  
		  return isbn;
	}
	
	public ArrayList<String> resultPrice(Connection c) throws Exception {		
		 ArrayList<String> price = new ArrayList<String>();
		 
		 Statement statement = c.createStatement();
		  ResultSet rsPrice = statement.executeQuery("SELECT price FROM books");
		  while(rsPrice.next()) {
			  price.add(rsPrice.getString("price"));		  
		  }
		  
		  return price;
	}

}

package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnexion {

	private final static String URL = "jdbc:mysql://localhost/db_emp_java_guide";
	private final static String PASSWORD = "";
	private final static String USER = "";
	
	public static Connection getConnection() {
	
	Connection cnx = null;
	
	
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connexion établie");
		
		
		return cnx;
		
	}
}

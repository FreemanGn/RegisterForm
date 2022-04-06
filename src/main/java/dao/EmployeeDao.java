package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Employee;
import utils.DbConnexion;

public class EmployeeDao {
	
	private Connection cnx;
	private Statement query;
	private ResultSet result;
	private PreparedStatement statement;
	public EmployeeDao() {
		cnx = DbConnexion.getConnection();
	}

	
	 public int registerEmployee(Employee employee) throws ClassNotFoundException {
	        String INSERT_USERS_SQL = "INSERT INTO employee" +
	            "  (id, first_name, last_name, username, password, address, contact) VALUES " +
	            " (?, ?, ?, ?, ?,?,?);";
	        
	        int result = 0;
	        
	        try {
	        	query= cnx.createStatement();
	        	statement= cnx.prepareStatement(INSERT_USERS_SQL);
	        	
	        	statement.setInt(1, 1);
	        	statement.setString(2, employee.getFirstName());
	        	statement.setString(3, employee.getLastName());
	        	statement.setString(4, employee.getUsername());
	        	statement.setString(5, employee.getPassword());
	        	statement.setString(6, employee.getAddress());
	        	statement.setString(7, employee.getContact());
	        	
	        	result = statement.executeUpdate();

	        	
	        }catch(SQLException e) {
	        	e.printStackTrace();
	        	}
	        return result;
	        }

}

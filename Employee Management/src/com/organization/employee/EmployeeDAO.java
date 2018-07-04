package com.organization.employee;
/***
 * Name: EmployeeDAO
 * Descr: The class holding SQL connection parameters and implementing the core functionality of project
 * @author Krishna
 *
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmployeeDAO {
	private Connection connection = null;
	private Statement statement=null;
	private PreparedStatement pstmt = null;
	private ResultSet resultSet = null;
	private ConnectionFact connectionFactory = null;
/*
 * Constructor class initiating the connection factory object	
 */
public EmployeeDAO() 
{
	connectionFactory=ConnectionFact.getInstance();
	
}
/*
 * addEmployee accepts Employee as a parameter
 * The method retrieves a connection to database and performs the operation of insertion through PrepareStatement
 */
public void addEmp(Employee project){
	
	try{
		connection=connectionFactory.getConnection();
		String insertQuery="insert into employee(employeecode,employeename, employeesalary) values(?,?,?)";
		pstmt=connection.prepareStatement(insertQuery);
		pstmt.setInt(1, project.getEmployeeCode());
		pstmt.setString(2, project.getEmployeeName());
		pstmt.setInt(3, project.getEmployeeSalary());
		int rowsSaved =pstmt.executeUpdate();
		if(rowsSaved>0)
			System.out.println(rowsSaved+"record(S) added!");
		else
			System.out.println("error during insertion");
	}
	catch(SQLException e){
		e.printStackTrace();
	}
}
/*
 * displayAll method pulls the db connections and retrieves all the rows of data stored in employee table
 */
public void displayAll()
{
	try
	{
		connection=connectionFactory.getConnection();
		String insertQuery="Select * from employee";
		statement=connection.createStatement();
		resultSet=statement.executeQuery(insertQuery);
		while(resultSet.next())
		{
			System.out.println(resultSet.getString(2));
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}//end-class

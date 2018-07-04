package com.organization.employee;
/***
 * Name: ConnectionFact
 * Descr: The class holding the db connection parameters and only single object is created.
 * @author Krishna
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFact {
	private static ConnectionFact instance=null;
	private final String Driverr_Class="com.mysql.jdbc.Driver";
	private final static String DB_URL="jdbc:mysql://localhost/testdb";
	private final static String USER_NAME="root";
	private final static String PASSWORD="root";

	//private constructor
	private ConnectionFact()
	{
		try{
			Class.forName(Driverr_Class);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}//constructor
/**
 * Method looks if the instance is null i.e first time then create object else return the existing instance
 * @return
 */
	public static ConnectionFact getInstance(){
		
		if(instance==null){
			//synchronized block to double check
			instance=new ConnectionFact();
		}
		return instance;
	}
/**
 * Method gets the db connection by providing the db url, user name and password
 * @return connection
 * @throws SQLException
 */
	public Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
	}

}

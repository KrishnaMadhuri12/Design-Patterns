package com.organization.employee;
/***
 * Name: InvalidEmployeeCode
 * Descr: The class extending the Exception class. This exception is thrown when an invalid employeeCode is passed to insert
 * @author Krishna
 *
 */
public class InvalidEmployeeCode extends Exception{
private static final long serialVersionUID=1L;
private String message;
/*
 * (non-Javadoc)
 * @see java.lang.Throwable#getMessage()
 */
public String getMessage()
{
	return message;
}
/*
 * Constructor class
 */
public InvalidEmployeeCode(String message){
	super();
	this.message=message;
}

}


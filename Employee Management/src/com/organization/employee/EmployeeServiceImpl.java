package com.organization.employee;
/***
 * Name:EmployeeServiceImpl
 * Descr: The class implementing the interface IEmployeeService. Responsible in initaiting the DAO class
 * @author Krishna
 *
 */
public class EmployeeServiceImpl implements IEmployeeService {
private EmployeeDAO employeeDAO=null;
public EmployeeServiceImpl()
{
	employeeDAO=new EmployeeDAO();
}

public void add(Employee employee)
{
	employeeDAO.addEmp(employee);
}

public void displayAll()
{
	employeeDAO.displayAll();
}






}

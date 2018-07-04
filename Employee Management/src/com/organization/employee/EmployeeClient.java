package com.organization.employee;
/***
 * Name: EmployeeClient
 * Descr: The client class responsible for providing input to the insert functions and triggers the displayAll method
 * @author Krishna
 *
 */
public class EmployeeClient {

	public static void main(String[] args) {
		IEmployeeService empService=new EmployeeServiceImpl();
		System.out.println("Hey");
		Employee emp=new Employee();
		emp.setEmployeeCode(146686);
		emp.setEmployeeName("hgj");
		emp.setEmployeeSalary(7000);
		empService.add(emp);
		empService.displayAll();
	
}
}
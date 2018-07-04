package com.organization.employee;
/***
 * Name: Employee
 * Descr: The plain old java object class with attributes, constructors, getters and setters
 * @author Krishna
 *
 */
public class Employee {

	private int employeeCode;
	private String employeeName;
	private int employeeSalary;
	
	public Employee(){
		super();
	}

	public Employee(String employeeName, int employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public Employee(int employeeCode, String employeeName, int employeeSalary) {
		super();
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(int employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}

package com.testing.employeedetails;

import java.math.BigDecimal;

public class EmployeeDetails {

	
	private String name;
	   private double monthlySalary;
	   private BigDecimal FixedPay;
	   private BigDecimal noOfHrsLeaveAccumulated;
	   private BigDecimal totalHrsOfLeave;
	   
	  public BigDecimal getNoOfHrsLeaveAccumulated() {
		return noOfHrsLeaveAccumulated;
	}
	public void setNoOfHrsLeaveAccumulated(BigDecimal noOfHrsLeaveAccumulated) {
		this.noOfHrsLeaveAccumulated = noOfHrsLeaveAccumulated;
	}
	public BigDecimal getTotalHrsOfLeave() {
		return totalHrsOfLeave;
	}
	public void setTotalHrsOfLeave(BigDecimal totalHrsOfLeave) {
		this.totalHrsOfLeave = totalHrsOfLeave;
	}
	public BigDecimal getFixedPay() {
		return FixedPay;
	}
	public void setFixedPay(BigDecimal fixedPay) {
		FixedPay = fixedPay;
	}
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	   
}

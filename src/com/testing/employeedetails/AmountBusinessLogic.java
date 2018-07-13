package com.testing.employeedetails;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountBusinessLogic {

	
	public  double calculate(EmployeeDetails empdetails)
	{
		double yearlySalary=0;
		yearlySalary=empdetails.getMonthlySalary()*12;
		return yearlySalary;
		
		
	}
	
	
	public double calAppraisal(EmployeeDetails employeeDetails)
	{
		double appraisal=0;
		if(employeeDetails.getMonthlySalary()<=10000)
		{
			appraisal=500;
		}
		else
		{
			appraisal=1000;
		}
		
		return appraisal;
	}
	
	
	
	
	
	public BigDecimal calculateLeaveEncashment(EmployeeDetails emp)
	
	{
		
		 BigDecimal costValue=emp.getFixedPay().divide(emp.getTotalHrsOfLeave(),2 ,RoundingMode.HALF_UP);
	     BigDecimal finalAmt=costValue.multiply(emp.getNoOfHrsLeaveAccumulated());
		 
		
		
		return finalAmt;
		
	}
}

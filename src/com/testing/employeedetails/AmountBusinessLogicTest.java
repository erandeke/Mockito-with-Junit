package com.testing.employeedetails;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class AmountBusinessLogicTest {
	
	EmployeeDetails empdetails=new EmployeeDetails();
	AmountBusinessLogic amt=new AmountBusinessLogic();

	@Test
	public void testCalculate() {
		empdetails.setAge(29);
		empdetails.setName("Kaedar");
		empdetails.setMonthlySalary(30000);
		
		
		double salary=amt.calculate(empdetails);
		assertEquals(360000, salary, 0.0);
	}

	@Test
	public void testCalAppraisal() {
	
		empdetails.setAge(29);
		empdetails.setName("Kaedar");
		empdetails.setMonthlySalary(30000);
		
		double appraisal=amt.calAppraisal(empdetails);
		
		assertEquals(1000, appraisal, 0.0);
		
		
		
	}
	
	@Test
	public void testCalculateLeaveEncashment() {
	
	
		empdetails.setFixedPay(BigDecimal.valueOf(451484));
		empdetails.setNoOfHrsLeaveAccumulated(BigDecimal.valueOf(76.86));
		empdetails.setTotalHrsOfLeave(BigDecimal.valueOf(180));
		
		 BigDecimal costAmt=amt.calculateLeaveEncashment(empdetails);
		 
	   assertEquals(51999, costAmt);
	  
		
		
		
		
		
	}

}

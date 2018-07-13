package com.testing.employeedetails;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DebuggerTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeDetails empdetails=new EmployeeDetails();
		empdetails.setFixedPay(BigDecimal.valueOf(451484));
		empdetails.setNoOfHrsLeaveAccumulated(BigDecimal.valueOf(76.86));
		empdetails.setTotalHrsOfLeave(BigDecimal.valueOf(180));
		AmountBusinessLogic amount=new AmountBusinessLogic();
		amount.calculateLeaveEncashment(empdetails);
		
		 BigDecimal costValue=empdetails.getFixedPay().divide(empdetails.getTotalHrsOfLeave(),2 ,RoundingMode.HALF_UP);
		System.out.println(costValue);
		 
		 
	/*	BigDecimal v=new BigDecimal(1);
		BigDecimal v2=new BigDecimal(33);
	System.out.println(v.divide(v2,2, RoundingMode.HALF_UP)); */
		
	}

}

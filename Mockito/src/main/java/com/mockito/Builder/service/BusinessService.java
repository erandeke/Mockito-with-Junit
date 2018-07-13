package com.mockito.Builder.service;

public class BusinessService {

	private DataService ds;
	
	
	
	public int findGreatestOfAll()
	{
		int value[]=ds.retrieveAllData();
		int greatest=Integer.MIN_VALUE;
		for(int check:value)
		{
			if(check>greatest)
			{
				greatest=check;
			}
		}
		
		return greatest;
	}
	
	
	
	
	
	
}

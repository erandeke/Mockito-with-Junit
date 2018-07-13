package com.mockito.Builder.Test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mockito.Builder.service.BusinessService;
import com.mockito.Builder.service.DataService;

import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceTest {

	
	
	//Mock -The one bean which is dependent upon other so it as dependency to other
	
	@Mock
	private DataService dataService;
	
	//InjectMock--Inject the mocks as a dependency 
	
	@InjectMocks
	private BusinessService businessService;
	
	@Test
	public void testGreatestOfAll()
	{
		when(dataService.retrieveAllData()).thenReturn(new int[]{24,2,3});
		
		Assert.assertEquals(24, businessService.findGreatestOfAll());
	}
	
	@Test
	public void testGreatesofAllOne()
	{
		when(dataService.retrieveAllData()).thenReturn(new int[]{18});
		Assert.assertEquals(18, businessService.findGreatestOfAll());
		
	}
	
	@Test
	public void testGreatesofNoValue()
	{
		when(dataService.retrieveAllData()).thenReturn(new int[]{});
		Assert.assertEquals(Integer.MIN_VALUE, businessService.findGreatestOfAll());
		
	}
	
	@Test
	public void testGreatestOftwovalue()
	{
		
		when(dataService.retrieveAllData()).thenReturn(new int[] {1,2});
		Assert.assertEquals(2, businessService.findGreatestOfAll());
		
	}
	
}

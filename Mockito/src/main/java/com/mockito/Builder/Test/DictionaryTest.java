/**
 * 
 */
package com.mockito.Builder.Test;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;

import com.mockito.Builder.service.Dictionary;

/**
 * @author User
 *
 */
public class DictionaryTest {

	
	@InjectMocks
	 Dictionary dictionary;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void test() {
	
		Dictionary dictMock = Mockito.mock(Dictionary.class);
	   Mockito.when(dictMock.getMeaning(null))
	      .thenThrow(NullPointerException.class);
	 
	 //  Assert.assertEquals(null, dictMock.getMeaning(null));
	}

}

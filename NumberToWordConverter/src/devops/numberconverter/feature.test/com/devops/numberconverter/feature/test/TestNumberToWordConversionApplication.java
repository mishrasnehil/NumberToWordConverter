package com.devops.numberconverter.feature.test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.devops.numberconverter.feature.main.NumberToWordConversionApplication;

public class TestNumberToWordConversionApplication {

private NumberToWordConversionApplication numberToWordConversionApplication;
	
	@Before
    public void setup(){
		numberToWordConversionApplication = new NumberToWordConversionApplication();
     }
	@Test
    public void shouldexitFor0(){
		Integer number = 0;
		assertEquals("Existing from conversion. Please re-trigger the app to convert again.","Existing from conversion. Please re-trigger the app to convert again.");
	}
	@Test
    public void shouldexitFornegative(){
		Integer number = -1;
		assertEquals("Number out of Range","Number out of Range");
	}
	@Test
    public void shouldexitForfloatingnumbers(){
		double number = 0.5;
		assertEquals("Please enter the valid number","Please enter the valid number");
	}
	@Test
    public void shouldexitForalphabats(){
		String  number = "ABC";
		assertEquals("Please enter the valid number","Please enter the valid number");
	}
	@Test
    public void shouldexitForspecialcharcter(){
		String number = "!@#$";
		assertEquals("Please enter the valid number","Please enter the valid number");
	}


}

package com.devops.numberconverter.feature.test;

import com.devops.numberconverter.feature.main.NumberToWordConversionApplication;
import com.devops.numberconverter.feature.service.NumberToWordConverterFeature;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestNumberToWordConverterFeature {
	 private NumberToWordConverterFeature numberToWordConverterFeature;
	   

	    @Before
	    public void setup(){
	        numberToWordConverterFeature = new NumberToWordConverterFeature();
	     }

	    @Test
	    public void shouldConvertNumberToWordFor1(){
	        //given

	        Integer number = 1;
	        String expectedNumberAsWords = "One";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }

	    @Test
	    public void shouldConvertNumberToWordFor20(){
	        //given

	        Integer number = 20;
	        String expectedNumberAsWords = "Twenty";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }

	    @Test
	    public void shouldConvertNumberToWordFor22(){
	        //given

	        Integer number = 22;
	        String expectedNumberAsWords = "Twenty Two";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }

	    @Test
	    public void shouldConvertNumberToWordFor11(){
	        //given

	        Integer number = 11;
	        String expectedNumberAsWords = "Eleven";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }

	    @Test
	    public void shouldConvertNumberToWordFor102(){
	        //given

	        Integer number = 102;
	        String expectedNumberAsWords = "One Hundred Two";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }

	    @Test
	    public void shouldConvertNumberToWordFor111(){
	        //given

	        Integer number = 111;
	        String expectedNumberAsWords = "One Hundred Eleven";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }

	    @Test
	    public void shouldConvertNumberToWordFor900(){
	        //given

	        Integer number = 999;
	        String expectedNumberAsWords = "Nine Hundred Ninty Nine";
	        //when
	        String actualNumberAsWords = numberToWordConverterFeature.convertNumberToWords(number);

	        //then
	        Assert.assertEquals(expectedNumberAsWords, actualNumberAsWords);

	    }


}

package edu.mum.fpp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.mum.fpp.entity.Data;
import edu.mum.fpp.entity.Prog4;

import static org.junit.Assert.*;


public class TestProg4 {

	//TDD
	//Step 1: We need to extract only the ids, for the firt step we want just the first one.
	//Step 2: Create the methdos and classes to do that code run
	//Step 3: refactor the code, now we will to do from all Data.record
	@Test
	public void testGetProductIds() {
		
		Prog4 p4 = new Prog4();
		
		//Test 1 -> just one product
		assertEquals("231A", p4.getProductIds("231A,Light Bulb,123,Wilco,1.75:"));
		
		//Test 2 -> get products		
		assertEquals("231A 113D", p4.getProductIds("231A,Light Bulb,123,Wilco,1.75:"+
												  "113D,Hairbrush,19,Aamco,3.75:"));
		
		
		
	}

}

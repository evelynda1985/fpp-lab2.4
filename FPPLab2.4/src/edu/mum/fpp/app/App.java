package edu.mum.fpp.app;



import edu.mum.fpp.entity.Data;
import edu.mum.fpp.entity.Prog4;

public class App {

	public static void main(String[] args) {
		
		Prog4 p4 = new Prog4();
		
		String s = Data.records;
		
		for(String temp : p4.getProductIds(s)) {
			
			System.out.println(temp);
		}
		
		//System.out.println(p4.getProductIds(s));	
		
		

	}

}

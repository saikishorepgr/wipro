package com.wipro.bank.service;

import com.wipro.bank.acc.RDAccount;
import com.wipro.bank.exception.BankValidationException;

public class BankService {
	
	public boolean validateData(float principal, int tenure,int age, String gender)
	{
		try
		{
			if(principal<500)
				throw new BankValidationException("less than 500");
			if(!(tenure==5||tenure==10))
				throw new BankValidationException("tenure should be either 5 or 10");
			if(!(gender.equalsIgnoreCase("Male"))||(gender.equalsIgnoreCase("Female")))
				throw new BankValidationException("male or female only");
			if(age<1&&age>100)
				throw new BankValidationException("age should be between 1  and 100 only");
		}
		catch(BankValidationException e)
		{
			return false;
		}
		return true;
	}
	
	public void calculate(float principal,int tenure, int age, String gender)
	{
		boolean validate=validateData(principal,tenure,age,gender);
		System.out.println(validate);
		System.out.println(principal);
		System.out.println(tenure);
		System.out.println(age);
		System.out.println(gender);
		if(validate)
		{
			RDAccount rda=new RDAccount(tenure,principal);
			rda.setInterest(age,gender);
			float ci=rda.calculateInterest();
			float cad=rda.calculateAmountDeposited();
			System.out.println(ci);
			System.out.println(cad);
			System.out.println(rda.calculateMaturityAmount(cad, ci));
			
		}
		
	}
	
	

}

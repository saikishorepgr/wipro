package com.wipro.bank.exception;

public class BankValidationException extends Exception {
	
	public String toString()
	{
		return "Invalid Input Data";
	}
	
	public BankValidationException(String str)
	{
		super();
	}
}

package com.wipro.eb.service;

import com.wipro.eb.entity.Commercial;
import com.wipro.eb.entity.Domestic;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;

public class ConnectionService
{
    public boolean validate(int currentReading, int previousReading, String type) throws InvalidReadingException, InvalidConnectionException
    {
        if(currentReading<previousReading || currentReading<0 || previousReading<0)
        {
            throw new InvalidReadingException();
        }
        if(!(type.equals("Domestic")||type.equals("Commercial")))
        {
            throw new InvalidConnectionException();
        }
        return true;
    }
    public float calculateBillAmt(int currentReading, int previousReading, String type)
    {
        float amount = 0.0f;
        try
        {
            boolean isValid = validate(currentReading, previousReading, type);
            if(type.equals("Domestic"))
            {
                float[] slabs = {2.3f,4.2f,5.5f};
                Domestic domestic = new Domestic(currentReading,previousReading,slabs);
                amount = domestic.computeBill();
            }
            else if(type.equals("Commercial"))
            {
                float[] slabs = {5.2f,6.8f,8.3f};
                Commercial commercial = new Commercial(currentReading,previousReading,slabs);
                amount = commercial.computeBill();
            }
        } catch (InvalidReadingException e) {
            return -1;
        } catch (InvalidConnectionException e) {
            return -2;
        }
        return amount;
    }
    public String generateBill(int currentReading, int previousReading, String type)
    {
        float returnedValue = calculateBillAmt(currentReading,previousReading,type);
        if(returnedValue==-1f)
        {
            return "Incorrect Reading";
        }
        else if(returnedValue==-2f)
        {
            return "Invalid ConnectionType";
        }
        else
        {
            return "Amount to be paid:"+returnedValue;
        }
    }
}

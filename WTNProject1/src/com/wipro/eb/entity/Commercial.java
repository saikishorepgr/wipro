package com.wipro.eb.entity;


public class Commercial extends Connection
{

    public Commercial(int currentReading, int previousReading, float[] slabs) {
        super(currentReading, previousReading, slabs);
    }

    @Override
    public float computeBill() {
        int unitsConsumed = currentReading - previousReading;
        float billedAmount=0;
        if (unitsConsumed < 50) {
            billedAmount = unitsConsumed * slabs[0];
        } else if (unitsConsumed < 100) {
            billedAmount = (50*slabs[0])+((unitsConsumed - 50) * slabs[1]);
        } else {
            billedAmount = (50*slabs[0])+(50*slabs[1])+((unitsConsumed - 100) * slabs[2]);
        }
        if(billedAmount>=10000)
        {
            return billedAmount+(billedAmount*0.09f);
        }
        else if(billedAmount>=5000)
        {
            return billedAmount+(billedAmount*0.06f);
        }
        else
        {
            return billedAmount+(billedAmount*0.02f);
        }
    }
}

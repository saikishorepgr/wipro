package com.wipro.eb.entity;

public class Domestic extends Connection
{
    public Domestic(int currentReading, int previousReading,float[] slabs) {
        super(currentReading,previousReading,slabs);
    }

    @Override
    public float computeBill() {
        int unitsConsumed = currentReading - previousReading;
        if (unitsConsumed < 50) {
            return unitsConsumed * slabs[0];
        } else if (unitsConsumed<100) {
            return (50*slabs[0]) + ((unitsConsumed - 50) * slabs[1]);
        } else
            return  (50*slabs[0])+(50*slabs[1])+((unitsConsumed - 100) * slabs[2]);
    }
}

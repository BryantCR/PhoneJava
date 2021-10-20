package com.iphone;
import com.phone.*;
import com.ringable.*;

public class Iphone extends Phone implements Ringable {
	public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
    @Override
    public String ring(){
    	return this.getRingTone();
    }
    
    @Override
    public String unlock(){
    	return "Unlocked with facial recognition";
    }
    
    @Override
    public void displayInfo(){
    	//super(print);
    	System.out.println("Version Number: " + this.getVersionNumber());
        System.out.println("Batter Percentage: " + this.getBatteryPercentage());
        System.out.println("Carrier: " + this.getCarrier());
        System.out.println("RingTone: " + this.getRingTone());
    }
    
    
}
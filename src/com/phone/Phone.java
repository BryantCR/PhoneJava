package com.phone;

public abstract class Phone {
    public String versionNumber;
    public int batteryPercentage;
    public String carrier;
    public String ringTone;
    
    public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        this.versionNumber = versionNumber;
        this.batteryPercentage = batteryPercentage;
        this.carrier = carrier;
        this.ringTone = ringTone;
    }
    // abstract method. This method will be implemented by the subclasses
    
    public abstract void displayInfo();
    
    // getters and setters removed for brevity. Please implement them yourself

    // Getters
    
	public String getVersionNumber(){
		
		return versionNumber;
		
	}
	
	public int getBatteryPercentage(){
		
		return batteryPercentage;
		
	}
	
	public String getCarrier() {
		
		return carrier;
		
	}
	
	public String getRingTone() {
		
		return ringTone;
		
	}	
	
	// Setters
	
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	
	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}
	
    public void print(){
        System.out.println( "Version Number: " + this.versionNumber );
        System.out.println( "BatteryPercentage: " + this.batteryPercentage );
        System.out.println( "Carrier: " + this.carrier );
        System.out.println( "RingTone: " + this.ringTone );
    }
	
}

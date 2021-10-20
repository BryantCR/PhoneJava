package com.phonetest;
import com.galaxy.*;
import com.iphone.*;
import com.phone.*;
import com.ringable.*;

public class PhoneTest {
	
    public static void main(String[] args) {
        Galaxy S20FE = new Galaxy("S20FE", 52, "SAMSUNG","*Star wars imperial march*");
        Galaxy S20Pro = new Galaxy("S20Pro", 94, "SAMSUNG","*Spider-man soundtrack*");
        Iphone Iphone10 = new Iphone("X", 14, "ICON", "*Ring bell*");
        Iphone IphoneSE = new Iphone("SE", 86, "ICON", "*Ring bell* *Ring Bell*");
        
        System.out.println("*============ S20FE Stats ===============*");
        S20FE.displayInfo();
        S20FE.ring();
        S20FE.unlock();
        System.out.println("*============ S20Pro Stats ===============*");
        S20Pro.displayInfo();
        S20Pro.ring();
        S20Pro.unlock();
        System.out.println("*============ Iphone10 Stats ===============*");
        Iphone10.displayInfo();
        Iphone10.ring();
        Iphone10.unlock();
        System.out.println("*============ IphoneSE Stats ===============*");
        IphoneSE.displayInfo();
        IphoneSE.ring();
        IphoneSE.unlock();
        
    }
    
}

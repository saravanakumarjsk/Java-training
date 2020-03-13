package com.sixteen;

import java.util.Scanner;

class Address{
	private String addressLine1;   
	private String addressLine2;
	private String city;
	private String state;
	private int pincode;
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	@Override
	public String toString() {
		return "The Address details are \n" + addressLine1 + "\n" + addressLine2 + "\n" + city
				+ "\n" + state + "\n" + pincode;
	}
	
	public Address()
	{
		addressLine1 = "22nd Lane";
		addressLine2 = "8th cross road, RR nagar";
		city = "chennai";
		state = "Tamil Nadu";
		pincode = 600001;
	}
	
	public Address(String addressLine1, String addressLine2, String city, String state, int pincode)
	{
		addressLine1 = this.addressLine1;
		addressLine2 = this.addressLine2;
		city = this.city;
		state = this.state;
		pincode =this.pincode;
	}
	
}

//class AddressBO{
//	public void DisplayDet(Address ad)
//	{
//		System.out.println(ad.getAddressLine1());
//		System.out.println(ad.getAddressLine2());
//		System.out.println(ad.getCity());
//		System.out.println(ad.getState());
//		System.out.println(ad.getPincode());
//	}
//}

public class Main4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Address ad = new Address();
//      AddressBO abo = new AddressBO();
        
        System.out.println("Enter addressLine1");
        String a = input.nextLine();
        
        System.out.println("Enter addressLine1");
        String b = input.nextLine();
        
        System.out.println("Enter city");
        String c = input.next();
        
        System.out.println("Enter state");
        String d = input.next();
        
        System.out.println("Enter pincode");
        int e = input.nextInt();
        
//      abo.DisplayDet(ad);
        Address ad1 = new Address(a,b,c,d,e);
        System.out.println(ad);
        
        input.close();

    }

}

/*

22nd Lane

8th cross road, RR Nagar

Chennai

TamilNadu

620001

 */

package com.hcl.t13;

public class CurrentAccount extends Account {
	private String pinNumber;
	CurrentAccount(){
		
	}
	public CurrentAccount(String accName,String accNo,String bankName,String pinNumber) {
		super();
		this.accName=accName;
		this.accNo=accNo;
		this.bankName=bankName;
		this.pinNumber = pinNumber;
	}
	
	public String getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	public void display()
	{
	super.display();
	System.out.println("Pin Number :"+this.getPinNumber());
	}
	

}

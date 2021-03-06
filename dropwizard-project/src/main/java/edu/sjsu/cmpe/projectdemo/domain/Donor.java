package edu.sjsu.cmpe.projectdemo.domain;

import org.joda.time.DateTime;

public class Donor {
	
	private String donorName;
	private DateTime dateOfBirth;
	private String bloodGroup;
	private long phoneNumber;
	private String emailID;
	private String address;
	private String location;
	

	private Login donorLogin;

	
	public void setDonorName (String donorName){
		this.donorName = donorName;
	}
	public String getDonorName () {
		return this.donorName;
	}
	
	public void setDateOfBirth (DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public DateTime getDateOfBirth (){
		return this.dateOfBirth;
	}
	
	public void setBloodGroup (String bloodGroup){
		this.bloodGroup = bloodGroup;
	}
	
	public String getBloodGroup () {
		return this.bloodGroup;
	}
	
	public void setPhoneNumber (long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public long getPhoneNumber (){
		return this.phoneNumber;
	}	
	
	public void setEmailID (String emailID){
		this.emailID = emailID;
	}
	public String getEmailID () {
		return this.emailID;
	}
	
	public void setAddress (String address){
		this.address = address;
	}
	public String getAddress () {
		return this.address;
	}
	
	public void setLocation (String location){
		this.location = location;
	}
	
	public String getLocation () {
		return this.location;
	}
	

	public Login  getDonorLogin () {
		return this.donorLogin;
	}
	

	public void updatePassword (String password){
		this.donorLogin.setPassword(password);
	}
	
	
}

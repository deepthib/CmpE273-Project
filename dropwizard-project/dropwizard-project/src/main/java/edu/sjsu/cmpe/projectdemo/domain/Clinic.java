package edu.sjsu.cmpe.projectdemo.domain;

public class Clinic {

	private String donorName;
	private String userName;
	private String password;
	private boolean isVerified;
	
	public void setUserName (String userName){
		this.userName = userName;
	}
	
	public String getUserName () {
		return this.userName;
	}
	
	public void setPassword (String password){
		this.password = password;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	public void setDonorName (String donorName){
		this.donorName = donorName;
	}
	
	public String getDonorName () {
		return this.donorName;
	}
	
	public void setIsVerified (boolean isVerified){
		this.isVerified = isVerified;
	}
	
	public boolean getIsVerified (){
		return this.isVerified;
	}
}

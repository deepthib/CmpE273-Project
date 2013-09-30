package edu.sjsu.cmpe.projectdemo.domain;

public class ClinicDBA
{
	private String dbaName;
	private Login dbaLogin;
	private Clinic dbaClinicBelong;
	
	public String getDBAName()
	{
		return this.dbaName;
	}
	
	public void setDBAName(String dbaName)
	{
		this.dbaName=dbaName;
	}
	
	public Login getDBALogin()
	{
		return this.dbaLogin;
	}
	
	public void setDBALogin(Login dbaLogin)
	{
		this.dbaLogin=dbaLogin;
	}
	
	public Clinic getDBAClinicBelong()
	{
		return this.dbaClinicBelong;
	}
	
	public void setDBAClinicBelong(Clinic dbaClinicBelong)
	{
		this.dbaClinicBelong=dbaClinicBelong;
	
	}
}
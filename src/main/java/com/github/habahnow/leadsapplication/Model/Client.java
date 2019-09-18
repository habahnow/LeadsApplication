package com.github.habahnow.leadsapplication.Model;

public class Client{
	private int ID;
	private String firstName;
	private String lastName;
	private String email;
	private String companyName;
	private String notes;
	
	public Client( int ID, String firstName, String lastName, String email, String companyName, String notes){
		this.ID = ID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.companyName = companyName;
		this.notes = notes;

	}

	public int getID(){
		return this.ID;
	}

	public String getFirstName(){
		return this.firstName;
	}

	public String getLastName(){
		return this.lastName;
	}
	public String getEmail(){
		return this.email;
	}
	public String getCompanyName(){
		return this.companyName;
	}

	public String getNotes(){
		return this.notes;
	}

	public void setID(int ID){
		this.ID = ID;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public void setCompanyName(String companyName){
		this.companyName = companyName;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}


	public String toString(){
		return "ID: " + this.ID + " First Name: " + this.firstName + 
		" Last Name: " + this.lastName + " Email: " + this.email + 
		" Company Name: " + this.companyName + "\nNote: " + this.notes;
	}

}
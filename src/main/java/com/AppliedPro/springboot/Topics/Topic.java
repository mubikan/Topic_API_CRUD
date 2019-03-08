package com.AppliedPro.springboot.Topics;

public class Topic {
	
	private String id;
	private String Name;
	private String Description;

	public Topic() {
	
	}
	public Topic(String id, String Name, String Descriptionription) {
		
		this.id=id;
		this.Name=Name;
		this.Description=Descriptionription;
	}
	
	public String getId() {
		return id;	
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getDescription(){
		return Description;
	}
	public void setDescription(String Description) {
		this.Description=Description;
	}

}

package com.TrainingRite;

public class StudentDatabase {

	public static void main(String[] args) {
		// Create students, assign IDs, and enroll in course
		
		// Properties: Name, email, ID
		// Actions: Enroll in course, pay tuition, check balance, etc.
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		
		student1.setName("Alec");
		student1.setEmail("alec.millar94@gmail.com");
		student2.setName("Jess");
		student2.setEmail("test@gmail.com");
		student3.setName("Jared");
		student3.setEmail("test2@gmail.com");
		student4.setName("Kyle");
		student4.setEmail("test3@gmail.com");

		
		System.out.println("Student name is: " + student1.getName() + "\nStudent email is: " + student1.getEmail() + "\nStudent ID is: " + student1.getID());
		System.out.println("Student name is: " + student2.getName() + "\nStudent email is: " + student2.getEmail() + "\nStudent ID is: " + student2.getID());
		System.out.println("Student name is: " + student3.getName() + "\nStudent email is: " + student3.getEmail() + "\nStudent ID is: " + student3.getID());
		System.out.println("Student name is: " + student4.getName() + "\nStudent email is: " + student4.getEmail() + "\nStudent ID is: " + student4.getID());
	}
}

class Student {
	// Properties
	private String name;
	private String email;
	private int userID;
	private static int ID = 100;
	
	public Student(){
		System.out.println("New Student Entered");
		ID++;
		userID = ID;
	}
	
	// Ecapsulation
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
	//public void setID(int ID){
	//	this.ID = ID;
	//}
	public int getID(){
		return userID;
	}
	
	// Methods - Behaviors
	public void enroll(){
		//Code to enroll in course
	}
	public void payTuition(){
		
	}
	public void checkBalance(){
		
	}
}
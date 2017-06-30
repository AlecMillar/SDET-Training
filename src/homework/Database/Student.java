package homework.Database;

public class Student extends Person {
	//Properties
	private static int sID = 0;
	private int studentID;
	private String studentTuition = "$10,000";
	
	//Constructor
	public Student(String name) {
		super(name);
		System.out.println("New student entered");
		sID++;
		studentID = sID;
	}
	public Student (String name, String email) {
		super(name, email);
		System.out.println("New student entered");
		sID++;
		studentID = sID;
	}
	
	//Getters & Setters established in parent class, Person. Polymorphism grants Student class access.
	public void setStudentTuition(String studentTuition) {
		this.studentTuition = studentTuition;
	}
	public String getStudentTuition() {
		return studentTuition;
	}
	public void getInfo() {
		System.out.println("Student Name: " + getName() + "\nStudent email: " + getEmail() + "\nStudent ID: " + studentID + "\n");
	}
	
	//Methods
	public void checkTuition() {
		 System.out.println("Current balance owed: " + studentTuition);
	}
	public void payTuition() {
		System.out.println("Tuition balance paid.");
	}
	public void enroll() {
		System.out.println("Enrolled in class.");
	}
	

}

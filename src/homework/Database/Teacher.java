package homework.Database;

public class Teacher extends Person {
	//Properties
	private static int tID = 100;
	private int teacherID;
	private String salary = "$35,000";
	
	//Constructor
	public Teacher(String name) {
		super(name);
		System.out.println("New teacher entered");
		tID++;
		teacherID = tID;
	}
	public Teacher(String name, String email) {
		super(name, email);
		System.out.println("New teacher entered");
		tID++;
		teacherID = tID;
	}
	
	//Getters & Setters established in parent class, Person. Polymorphism grants Student class access.
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getSalary() {
		return salary;
	}
	public void getInfo() {
		System.out.println("Teacher Name: " + getName() + "\nTeacher email: " + getEmail()  + "\nTeacher ID: " + teacherID + "\n");
	}
	
	//Methods
	public void registerClass() {
		System.out.println("Class open for student enrollment.");
	}
	public void checkSalary() {
		System.out.println("Current salary is: " + salary);
	}
	
}

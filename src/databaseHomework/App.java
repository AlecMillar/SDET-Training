package databaseHomework;

public class App {

	public static void main(String[] args) {
		Student student1 = new Student("Steve", "steve@email");
		student1.getInfo();
		student1.enroll();
		student1.checkTuition();
		student1.payTuition();
		
		System.out.println("\n********************\n");
		
		Teacher teacher1 = new Teacher("Frank", "Frank@teacher.com");
		teacher1.getInfo();
		teacher1.checkSalary();

	}

}

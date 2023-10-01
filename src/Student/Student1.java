package Student;

public class Student1 {
	 String name;
	    int rollNo;
	    String phoneNumber;
	    String address;
	    public static void main(String[] args) {
	        Student1 student1 = new Student1();
	        student1.name = "Sam";
	        student1.rollNo = 1;
	        student1.phoneNumber = "123-456-7890";
	        student1.address = "123 Main Street";

	        Student1 student2 = new Student1();
	        student2.name = "John";
	        student2.rollNo = 2;
	        student2.phoneNumber = "987-654-3210";
	        student2.address = "456 Oak Avenue";

	        System.out.println("Student 1:");
	        System.out.println("Name: " + student1.name);
	        System.out.println("Roll No: " + student1.rollNo);
	        System.out.println("Phone Number: " + student1.phoneNumber);
	        System.out.println("Address: " + student1.address);

	        System.out.println("\nStudent 2:");
	        System.out.println("Name: " + student2.name);
	        System.out.println("Roll No: " + student2.rollNo);
	        System.out.println("Phone Number: " + student2.phoneNumber);
	        System.out.println("Address: " + student2.address);
	    }
}

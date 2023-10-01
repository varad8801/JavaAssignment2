import java.util.Scanner;

public class Student {
    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for student 1:");
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Age: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Grade: ");
        String grade1 = scanner.nextLine();

        System.out.println("Enter details for student 2:");
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Age: ");
        int age2 = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character
        System.out.print("Grade: ");
        String grade2 = scanner.nextLine();

        System.out.println("Enter details for student 3:");
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Age: ");
        int age3 = scanner.nextInt();
        scanner.nextLine();  
        System.out.print("Grade: ");
        String grade3 = scanner.nextLine();

        Student student1 = new Student(name1, age1, grade1);
        Student student2 = new Student(name2, age2, grade2);
        Student student3 = new Student(name3, age3, grade3);

        student1.printDetails();
        student2.printDetails();
        student3.printDetails();

    }
}

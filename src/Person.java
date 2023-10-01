import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;

    public void setDetails(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        person.setDetails(name, age, gender);

        System.out.println("Introducing the person:");
        person.introduce();

        scanner.close();
    }
}

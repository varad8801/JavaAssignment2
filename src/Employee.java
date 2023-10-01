import java.util.Scanner;

public class Employee {
    private String name;
    private int employeeId;
    private double salary;

    public void setDetails(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void giveRaise(double amount) {
        salary += amount;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: ₹" + salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter current salary: ₹");
        double salary = scanner.nextDouble();
        scanner.nextLine(); 

        employee.setDetails(name, employeeId, salary);

        System.out.print("\nEnter the raise amount: ₹");
        double raiseAmount = scanner.nextDouble();
        scanner.nextLine(); 

        employee.giveRaise(raiseAmount);

        System.out.println("\nEmployee details after raise:");
        employee.printDetails();

        scanner.close();
    }
}

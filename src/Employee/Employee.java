package Employee;

import java.util.Scanner;

class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[3];

        for (int i = 0; i < 3; i++) {
            employees[i] = new Employee();

            System.out.print("Enter name of employee " + (i+1) + ": ");
            employees[i].name = scanner.nextLine();

            System.out.print("Enter year of joining: ");
            employees[i].yearOfJoining = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter salary: ");
            employees[i].salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter address: ");
            employees[i].address = scanner.nextLine();
        }

        System.out.println("\nName\tYear of Joining\tSalary\tAddress");

        for (Employee employee : employees) {
            System.out.println(employee.name + "\t" + employee.yearOfJoining + "\t\t" + employee.salary + "\t" + employee.address);
        }

        scanner.close();
    }
}

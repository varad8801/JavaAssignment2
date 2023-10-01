package Area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Area areaCalculator = new Area();
        areaCalculator.setDim(length, breadth);

        double area = areaCalculator.getArea();

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}

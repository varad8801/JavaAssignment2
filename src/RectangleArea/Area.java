package RectangleArea;

import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        Area areaCalculator = new Area(length, breadth);
        double area = areaCalculator.returnArea();

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}

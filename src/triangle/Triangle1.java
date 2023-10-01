package triangle;

class Triangle1 {
    private double side1, side2, side3;

    public Triangle1(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }



    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1(3, 4, 5);

        double area = triangle.calculateArea();
        double perimeter = triangle.calculatePerimeter();

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    
}
}
package triangle;

class Triangle {
    private double side1, side2, side3;

    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }



    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double area = triangle.calculateArea();
        double perimeter = triangle.calculatePerimeter();

        System.out.println("Area of the triangle: " + area);
        System.out.println("Perimeter of the triangle: " + perimeter);
    
}}

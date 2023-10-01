import java.util.Scanner;

class AddDistance {
    private int feet;
    private int inches;

    public AddDistance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void addDistance(AddDistance distance2) {
        this.feet += distance2.feet;
        this.inches += distance2.inches;

        if (this.inches >= 12) {
            this.feet += this.inches / 12;
            this.inches = this.inches % 12;
        }
    }

    public void displayDistance() {
        System.out.println("Sum: " + feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance 1:");
        System.out.print("Feet: ");
        int feet1 = scanner.nextInt();

        System.out.print("Inches: ");
        int inches1 = scanner.nextInt();

        System.out.println("\nEnter distance 2:");
        System.out.print("Feet: ");
        int feet2 = scanner.nextInt();

        System.out.print("Inches: ");
        int inches2 = scanner.nextInt();

        AddDistance distance1 = new AddDistance(feet1, inches1);
        AddDistance distance2 = new AddDistance(feet2, inches2);

        distance1.addDistance(distance2);

        distance1.displayDistance();

        scanner.close();
    }
}

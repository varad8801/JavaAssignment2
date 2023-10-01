import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public void setDetails(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();

        System.out.print("Enter title: ");
        String title = scanner.nextLine();

        System.out.print("Enter author: ");
        String author = scanner.nextLine();

        System.out.print("Enter publication year: ");
        int publicationYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        book.setDetails(title, author, publicationYear);

        System.out.println("\nBook details:");
        book.printDetails();

        scanner.close();
    }
}

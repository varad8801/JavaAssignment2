package Libcatlog;

import java.util.ArrayList;



class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void checkoutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                System.out.println("Book checked out successfully.");
                return;
            }
        }
        System.out.println("Book not available for checkout.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not eligible for return.");
    }

    public void displayBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}


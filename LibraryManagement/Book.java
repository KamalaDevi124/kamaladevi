/*class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor to initialize Book
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Book is available initially
    }

    // Method to get the details of the book
    public String getBookDetails() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false;  // Mark the book as unavailable when borrowed
            return true;
        }
        return false; // If book is not available
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true; // Mark the book as available when returned
    }

    // Getter for bookId
    public int getBookId() {
        return bookId;
    }

    // Getter to check if the book is available
    public boolean isAvailable() {
        return isAvailable;
    }
}*/
public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook() {
        isAvailable = true;
    }

    public void getBookDetails() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

/*import java.util.*;
class Member {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    // Constructor to initialize Member
    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    // Method to get the details of the member and borrowed books
    public String getMemberDetails() {
        StringBuilder details = new StringBuilder("Member ID: " + memberId + ", Name: " + name + "\nBorrowed Books:\n");
        if (borrowedBooks.isEmpty()) {
            details.append("No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                details.append(book.getBookDetails()).append("\n");
            }
        }
        return details.toString();
    }

    // Method for a member to borrow a book
    public boolean borrowBook(Book book) {
        if (book.borrowBook()) {
            borrowedBooks.add(book);
            return true;
        }
        return false;
    }

    // Method for a member to return a borrowed book
    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            return true;
        }
        return false;
    }

    // Getter for memberId
    public int getMemberId() {
        return memberId;
    }

    // Getter for borrowedBooks
    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
}*/

import java.util.ArrayList;
import java.util.List;

public class Member {
    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is currently unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("This book was not borrowed by this member.");
        }
    }

    public void getMemberDetails() {
        System.out.println("Member ID: " + memberId + ", Name: " + name);
        System.out.println("Borrowed Books:");
        for (Book book : borrowedBooks) {
            book.getBookDetails();
        }
    }
}


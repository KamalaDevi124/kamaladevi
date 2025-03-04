/*import java.util.ArrayList;
import java.util.List;

// Library Class
class Library {
    private List<Book> bookList;
    private List<Member> memberList;

    // Constructor to initialize the library with empty book and member lists
    public Library() {
        bookList = new ArrayList<>();
        memberList = new ArrayList<>();
    }

    // Method to add a new book to the library
    public void addBook(int bookId, String title, String author) {
        Book newBook = new Book(bookId, title, author);
        bookList.add(newBook);
    }

    // Method to register a new member to the library
    public void registerMember(int memberId, String name) {
        Member newMember = new Member(memberId, name);
        memberList.add(newMember);
    }

    // Method to borrow a book for a member
    public String borrowBook(int memberId, int bookId) {
        Member member = getMemberById(memberId);
        Book book = getBookById(bookId);

        if (member != null && book != null && book.isAvailable()) {
            if (member.borrowBook(book)) {
                return "Book '" + book.getBookDetails() + "' borrowed by " + member.getMemberDetails();
            }
        }
        return "Book is unavailable or member doesn't exist.";
    }

    // Method to return a borrowed book
    public String returnBook(int memberId, int bookId) {
        Member member = getMemberById(memberId);
        Book book = getBookById(bookId);

        if (member != null && book != null && member.returnBook(book)) {
            return "Book '" + book.getBookDetails() + "' returned by " + member.getMemberDetails();
        }
        return "Book not borrowed by this member.";
    }

    // Method to display all available books
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : bookList) {
            if (book.isAvailable()) {
                System.out.println(book.getBookDetails());
            }
        }
    }

    // Method to display details of a member
    public void displayMemberDetails(int memberId) {
        Member member = getMemberById(memberId);
        if (member != null) {
            System.out.println(member.getMemberDetails());
        } else {
            System.out.println("Member not found.");
        }
    }

    // Helper method to get a book by its ID
    private Book getBookById(int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Helper method to get a member by their ID
    private Member getMemberById(int memberId) {
        for (Member member : memberList) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }
}*/

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> bookList;
    private List<Member> memberList;
    private List<Transaction> transactionList;

    public Library() {
        bookList = new ArrayList<>();
        memberList = new ArrayList<>();
        transactionList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("Book added successfully.");
    }

    public void registerMember(Member member) {
        memberList.add(member);
        System.out.println("Member registered successfully.");
    }

    public void borrowBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);
        if (book != null && member != null) {
            member.borrowBook(book);
            Transaction transaction = new Transaction(transactionList.size() + 1, book, member, new Date());
            transactionList.add(transaction);
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    public void returnBook(int bookId, int memberId) {
        Book book = findBook(bookId);
        Member member = findMember(memberId);
        if (book != null && member != null) {
            member.returnBook(book);
            for (Transaction transaction : transactionList) {
                if (transaction.getBook().getBookId() == bookId && transaction.getMember().getMemberId() == memberId && transaction.getReturnDate() == null) {
                    transaction.returnBook(new Date());
                    break;
                }
            }
        } else {
            System.out.println("Book or Member not found.");
        }
    }

    public void displayAvailableBooks() {
        for (Book book : bookList) {
            if (book.isAvailable()) {
                book.getBookDetails();
            }
        }
    }

    public void displayMemberDetails(int memberId) {
        Member member = findMember(memberId);
        if (member != null) {
            member.getMemberDetails();
        } else {
            System.out.println("Member not found.");
        }
    }

    private Book findBook(int bookId) {
        for (Book book : bookList) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    private Member findMember(int memberId) {
        for (Member member : memberList) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Available Books");
            System.out.println("6. Display Member Details");
            System.out.println("7. Exit");
            System.out.println("=====================================");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    Book book = new Book(bookId, title, author);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.print("Enter member ID: ");
                    int memberId = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();
                    Member member = new Member(memberId, name);
                    library.registerMember(member);
                    break;
                case 3:
                    System.out.print("Enter book ID: ");
                    int borrowBookId = scanner.nextInt();
                    System.out.print("Enter member ID: ");
                    int borrowMemberId = scanner.nextInt();
                    library.borrowBook(borrowBookId, borrowMemberId);
                    break;
                case 4:
                    System.out.print("Enter book ID: ");
                    int returnBookId = scanner.nextInt();
                    System.out.print("Enter member ID: ");
                    int returnMemberId = scanner.nextInt();
                    library.returnBook(returnBookId, returnMemberId);
                    break;
                case 5:
                    library.displayAvailableBooks();
                    break;
                case 6:
                    System.out.print("Enter member ID: ");
                    int displayMemberId = scanner.nextInt();
                    library.displayMemberDetails(displayMemberId);
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

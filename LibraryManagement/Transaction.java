/*class Transaction {
    private static int transactionCounter = 1;  // To generate unique transaction IDs
    private int transactionId;
    private Book book;
    private Member member;
    private String borrowDate;
    private String returnDate;

    // Constructor to initialize a transaction
    public Transaction(Book book, Member member, String borrowDate) {
        this.transactionId = transactionCounter++;
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = null;  // Return date is initially null when borrowed
    }

    // Method to set the return date when the book is returned
    public void returnBook(String returnDate) {
        this.returnDate = returnDate;
    }

    // Method to display transaction details
    public String getTransactionDetails() {
        return "Transaction ID: " + transactionId + ", Book: " + book.getBookDetails() + ", Member: " + member.getMemberDetails() + ", Borrow Date: " + borrowDate + ", Return Date: " + (returnDate != null ? returnDate : "Not returned yet");
    }
}*/

import java.util.Date;

public class Transaction {
    private int transactionId;
    private Book book;
    private Member member;
    private Date borrowDate;
    private Date returnDate;

    public Transaction(int transactionId, Book book, Member member, Date borrowDate) {
        this.transactionId = transactionId;
        this.book = book;
        this.member = member;
        this.borrowDate = borrowDate;
        this.returnDate = null;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Book getBook() {
        return book;
    }

    public Member getMember() {
        return member;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void returnBook(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void getTransactionDetails() {
        System.out.println("Transaction ID: " + transactionId + ", Book ID: " + book.getBookId() + ", Member ID: " + member.getMemberId() + ", Borrow Date: " + borrowDate + ", Return Date: " + returnDate);
    }
}

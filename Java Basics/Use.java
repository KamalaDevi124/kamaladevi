//library management system
objective:
create a console -based library management system where users can manage books,members,and transactions like  borrowing and returning books .the system should allow for adding books,registering members ,borrowing /returning books,and display records.

requirements:

you are required to use object-oriented programming (oop)concepts to implements the library management system.the system should be menu-driven and run in the console.

core functionalities:

1.add new books: libraries should be able to add new books to the system.
2.register members :members should be able to register in the system to borrow books.
3.borrow a book: members should be able to borrow available books.
4.return a book: members should be able to return borrowed books.
display available books: the system should be able to display all available books.
5.display member information: display the details of member and their borrowed books.
6.display member information : display the details of members and their borrowed books.
7.track borrow/return history: maintain records of borrowed and returned books.

specifications.

1.class and objects: create at least 4 four main class:library,book,member,transaction.
use inheritance and interface to model the relationship between classes.
implement polymorphism to allow for some methods to behave differently bases on the objects calling them.

2.class description:
book:
fields: bookId,title,author,isAvailable
methods:getBookDetails(),borrowBook(),returnBook()

methods:
field:memberId,name,borrowBooks
methods: getMemberDetails(),returnBook()

transaction:

fields:transcationId,book,member,borrowDate,returnDate
methods:getTransactionDeatils()

library:

fields:bookList,memberList,transactionList.
methods:addBook(),registerMember(),borrowBook(),returnBook(),displayAvailableBooks(),displayMemberDetails().

features:

addbook: the librarian can add books to the library collection.
register member :allow new member to register by providing their name and member ID.
borrow book: a member should be able to borrow a book only if its available.
return book: a member should return the borrowed book.update the book status accordinly.
transaction log: each time a book is borrowed or returned, a transaction record should be created and stored.

console welcome screen

=====library management screen=====
1.add book
2.register member
3.borrow book
4.return book
5.display available books
6. display member details
7.exit
=================
enter your choice

      



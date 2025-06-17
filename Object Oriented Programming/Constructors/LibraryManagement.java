package Constructors;

//Mini Project Idea: Library Management System (Basic)
//• Create classes: Book, Member, and Library.
//• Use constructors to initialize objects with relevant details (e.g., book title, author, member name, ID).
//• Implement constructor chaining to reuse initialization code.
//• Use inheritance for different types of books (e.g., EBook, PrintedBook) with parent class Book.
//• Use super() to initialize parent class fields.
//• Provide methods to add books, register members.



class Book{
	
	 String bookTitle;
	 String bookAuthor;
	 
	 public Book() {
		 this("Default","Unknown");
	 }
	 public Book(String bookTitle,String bookAuthor) {
		 this.bookTitle=bookTitle;
		 this.bookAuthor=bookAuthor;
	 }
	 
	 public void displayBookDetails() {
		 System.out.println("Book Title "+bookTitle+" Author Name "+bookAuthor);
	 }
	 
}

class EBook extends Book{
	 int eBookSize;
	 int eBookId;
	 
	 public EBook() {
		 this("Default","Unknown",0,000);
	 }
	 
	 public EBook(String bookTitle,String bookAuthor,int eBookSize,int eBookId) {
		 super(bookTitle,bookAuthor);
		 this.eBookSize=eBookSize;
		 this.eBookId=eBookId;
	 }
	 
	 @Override
	 public void displayBookDetails() {
	        super.displayBookDetails();
	        System.out.println("EBook Size: " + eBookSize + "MB");
	    }
}

class PrintedBook extends Book{
	 
	 int printedBookID;
	 
	 public PrintedBook() {
		 this("Default","Unknown",0);
	 }
	 
	 public PrintedBook(String bookTitle,String bookAuthor,int printedBookId) {
		 super(bookTitle,bookAuthor);
		 this.printedBookID=printedBookId;
	 }
	 
	 @Override
	 public void displayBookDetails() {
	        super.displayBookDetails();
	        System.out.println("Printed Book Id : " + printedBookID );
	    }
}

class Member {
	 String memberName;
	 int memberId;
	 
	 public Member() {
		 this("Default Member",000);
	 }
	 
	 public Member(String memberName,int memberId) {
		 this.memberId=memberId;
		 this.memberName=memberName;
	 }
	 
	 public void memberDetails() {
		 System.out.println("Member name is "+memberName+" Id is "+memberId);
	 }
}


public class LibraryManagement {
	
	static int totalBooks=500;
	
	public static void addBooks(int add) {
		totalBooks+=add;
		System.out.println("Total Books are : "+totalBooks);
	}
	
	
	public static void main(String[] args) {
		 EBook ebook = new EBook("Java Fundamentals","James Gosling",5,101);
	        ebook.displayBookDetails();

	        PrintedBook printedBook = new PrintedBook("Effective Java","Joshua Bloch",202);
	        printedBook.displayBookDetails();

	        Member member = new Member("Shiva",5001);
	        member.memberDetails();
	        
	        LibraryManagement.addBooks(5);
	        LibraryManagement.addBooks(5);
	        
	        
	}
}

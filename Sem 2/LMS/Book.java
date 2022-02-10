
public class Book
{
     //attributes
    private String bookId;
    private String title;
    private String subject;
    private String author;
    private String publicationDate;
    private String bookDetails;
    private boolean status;
    private String issueDate;
    private String returnDate;
    private String returnStatus;
    private int bookBorrowCount;
    private int searchCounter;
    private int totalBooks;
 
     //default constructor
    public Book(){
        this.bookId = null;
        this.title = null;
        this.subject = null;
        this.author = null;
        this.publicationDate = null;
        this.bookDetails = null;
        this.issueDate = null;
        this.returnDate = null;
        this.returnStatus = null;
        this.bookBorrowCount = 0;
        this.status = true;
        this.searchCounter = 0;
    }

     //normal constructor
    public Book(String bookId, String title, String subject, String author, String publicationDate){
        this.bookId = bookId;
        this.title = title;
        this.subject = subject;
        this.author = author;
        this.publicationDate = publicationDate;
    }

     //mutator method
    public void setBookId(String bookId){this.bookId = bookId;}
    public void setTitle(String title){this.title = title;}
    public void setSubject(String subject){this.subject = subject;}
    public void setAuthor(String author){this.author = author;}
    public void setPublicationDate(String publicationDate){this.publicationDate = publicationDate;}
    public void setBookDetails(String bookDetails){this.bookDetails = bookDetails;}
    public void setStatus(boolean status){this.status = status;}
    public void setIssueDate(String issueDate){this.issueDate = issueDate;}
    public void setReturnDate(String returnDate){this.returnDate = returnDate;}
    public void setReturnStatus(String returnStatus){this.returnStatus = returnStatus;}
    public void setBookBorrowCount(int bitchass){this.bookBorrowCount = bitchass;}
    public void setTotalBooks(int totalBooks){this.totalBooks = totalBooks;}
    public void setSearchCounter(int counter){ this.searchCounter = counter;}

     //accessor method
    public String getBookId(){return bookId;}
    public String getTitle(){return title;}
    public String getSubject(){return subject;}
    public String getAuthor(){return author;}
    public String getPublicationDate(){return publicationDate;}
    public String getBookDetails(){return bookDetails;}
    public boolean getStatus(){return status;}
    public String getIssueDate(){return issueDate;}
    public String getReturnDate(){return returnDate;}
    public String getReturnStatus(){return returnStatus;}
    public int getBookBorrowCount(){return bookBorrowCount;}
    public int getTotalBooks(){return totalBooks;}
    public int getSearchCounter(){return searchCounter;}
    
     //processor method (calculation)
    public void borrowBook(){ 
        this.bookBorrowCount++; // adds to counter
    }
    public void returnBook(){ 
        this.bookBorrowCount--; // subtracts counter
    }
    public void searchCount(){ 
        this.searchCounter++; // adds to counter
    }

    //toString() method
    public String toString(){
        return String.format("| "+"%4s", getBookId()).replace(' ', ' ') +" | "+String.format("%0$-30s", getTitle())+" | "+String.format("%0$-15s", getSubject())+" | "+String.format("%0$-16s", getAuthor())+" | "+String.format("%0$-16s", getPublicationDate())+" |";
    }
}

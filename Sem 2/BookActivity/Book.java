public class Book{
    private String bookCode;
    private String title;
    private double price;
    private String author;

    // default constructor
    public Book(){
        bookCode = null;
        title = null;
        price = 0;
        author = null;
    }
    // copy constructor
    public Book(Book book){
        this.bookCode = book.bookCode;
        this.title = book.title;
        this.price = book.price;
        this.author = book.author;
    }
    // parametrized constructor/*
    public Book(String bookcode, String title, double price, String author){
        bookCode = bookcode;
        title = title;
        price = price;
        author = author;
    }
    
    // mutator
    public void setInfo(String bookCode1, String title1, double price1, String author1){
        bookCode = bookCode1;
        title = title1;
        price = price1;
        author = author1;
    }
    
    // accessor
    public String getBookCode(){
        return bookCode;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public String getAuthor(){
        return author;
    }
    
    
    // toString()
    public String toString(){
        return "Book Code: " + bookCode + "\nTitle: " + title
        + "\nPrice: RM" + price + "\nAuthor: " + author;
    }
}

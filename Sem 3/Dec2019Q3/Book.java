
public class Book
{
    private String title;
    private String author;
    private int pubYear;

    // normal constructor
    public Book(String title, String author, int pubYear){
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    // accessors
    public String getTitle(){ return this.title;}
    public String getAuthor(){ return this.author;}
    public int getYear(){ return this.pubYear;}

    // printer: toString()
    public String toString(){
        return "Title: " + title + "\tAuthor: " + author + "\tYear Published: " + pubYear;
    }
}


public class testMovie
{
    public static void main(String [] args){
        //test
        Movie movie1 = new Movie("HR101", "Kong", "King", 2000, 500);
        Movie movie2 = new Movie("CO123", "MLM", "Razak", 2001, 250);
        
        System.out.println(movie2.costMore(movie1)); //ok
        
        System.out.println(movie2.olderMovie(2021)); // ok
        
        Movie movie4 = new Movie(movie2); // copy constructor
        
        Movie movie3 = movie1.searchMovie("Razak"); //????
        
        System.out.println(movie2.identifyGenre()); // ok
        
    }
}

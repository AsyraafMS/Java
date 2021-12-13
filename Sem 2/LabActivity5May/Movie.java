public class Movie{
    private String movieCode;
    private String title;
    private String producer;
    private int yearProduced;
    private double productionCost;
    
    public Movie(){
        movieCode = null;
        title = null;
        producer = null;
        yearProduced = 0;
        productionCost = 0;
    }
    
    public Movie(String mc, String t, String p, int yP, double pC){
        movieCode = mc;
        title = t;
        producer = p;
        yearProduced = yP;
        productionCost = pC;
    }
    
    public Movie(Movie movie){
        this.movieCode = movie.movieCode;
        this.title = movie.title;
        this.producer = movie.producer;
        this.yearProduced = movie.yearProduced;
        this.productionCost = movie.productionCost;
    }
    
    public boolean costMore(Movie movie1){
        if (productionCost > movie1.productionCost){
            return true;
        } else {
            return false;
        }
    }
    
    public int olderMovie(int currentYear){
        return currentYear - yearProduced;
    }
    
    public Movie searchMovie(String searchProducer){
        if (producer.equals(searchProducer)){
            Movie checkMovie = new Movie();
            return checkMovie;
        } else {
            return null;
        }
    }
    
    public String identifyGenre(){
        if (movieCode.substring(0,2).equals("HR")){
            return "HORROR";
        } else if (movieCode.substring(0,2).equals("CO")){
            return "COMEDY";
        } else if (movieCode.substring(0,2).equals("RO")){
            return "ROMANTIC";
        } else if (movieCode.substring(0,2).equals("TH")){
            return "THRILLER";
        } else {
            return null;
        }
    }
    
    //test
    public String toString(){
        return movieCode + title + producer +yearProduced + productionCost;
    }
}
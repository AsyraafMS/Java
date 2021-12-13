import java.util.Scanner;
public class Application {
    public static void main(String[] args){
        MovieCompetition movie = new MovieCompetition();        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter date: ");
        String date = input.nextLine();
        
        System.out.println("Enter movie title: ");
        String title = input.nextLine();
        
        System.out.println("Enter director name: ");
        String director = input.nextLine();
        
        System.out.println("Enter category (A - Student / B - Open): ");
        char category = input.next().charAt(0);
        
        System.out.println("Enter membership (Yes/No): ");
        String membership = input.next();
        
        movie.setDate(date);
        movie.setTitle(title);
        movie.setName(director);
        movie.setCategory(category);
        movie.setMembership(membership);
        
        System.out.println(movie.printer());
    
        /*TEST
        System.out.println(movie.getDate());
        System.out.println(movie.getTitle());
        System.out.println(movie.getDirector());
        System.out.println(movie.getCategory());
        System.out.println(movie.getMembership());
        */
    }
}


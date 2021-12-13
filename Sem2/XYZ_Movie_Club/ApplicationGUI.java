import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class ApplicationGUI {
    public static void main(String[] args){
        MovieCompetition movie = new MovieCompetition();
        
        JFrame frame = new JFrame();
        String[] options = new String[2];
        options[0] = new String("A");
        options[1] = new String("B");
        
        //Input
        String date = JOptionPane.showInputDialog("Enter Date:");
        String title = JOptionPane.showInputDialog("Enter Movie Title:");
        String director = JOptionPane.showInputDialog("Enter Director Name:");
        int category = JOptionPane.showOptionDialog(frame.getContentPane(),"Enter Category (A - Student / B - Open):","Category", 0,JOptionPane.INFORMATION_MESSAGE,null,options,null);
        int membership = JOptionPane.showConfirmDialog(null, "Are you a club member?", "Club Membership",  JOptionPane.YES_NO_OPTION);

        //Set
        movie.setDate(date);
        movie.setTitle(title);
        movie.setName(director);
        if (category == 0){
            char newCategory = 'A';
            movie.setCategory(newCategory);
        } else {
            char newCategory = 'B';
            movie.setCategory(newCategory);
        }
        if (membership == JOptionPane.YES_OPTION)
        {
            String newMembership = "Yes";
            movie.setMembership(newMembership);
        } else {
            String newMembership = "No";
            movie.setMembership(newMembership);
        }
        
        System.out.println(movie.printer());
    }
}


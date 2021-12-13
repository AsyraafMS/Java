import javax.swing.JOptionPane;
import java.util.Scanner;
public class ForInputDialog{
    public static void main(String [] args){
    
     
    JOptionPane.showMessageDialog(null, "Hello : " + name);
    //System.out.println("Hello : " + name);
    
    
    int reply = JOptionPane.showConfirmDialog(null, "Are you a club member?", "Club Membership",  JOptionPane.YES_NO_OPTION);
    if (reply == JOptionPane.YES_OPTION)
    {
       System.exit(0);
    }
    
    }
}
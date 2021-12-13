import javax.swing.JPanel;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LoginGUI{
    public static void main(String [] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Login");
        frame.setSize(295, 130);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        Scanner scanner2 = new Scanner(System.in);

        panel.setLayout(null);
        
        JLabel userLabel = new JLabel("Username: ");
        userLabel.setBounds(10,20,80, 25); // (x,y,width,height)
        panel.add(userLabel);
        
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);
        
        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(50);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);
        
        frame.setVisible(true);
    }
}
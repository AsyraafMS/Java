import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class SearchingPanel extends JPanel {
    private JList jcomp1;

    public SearchingPanel(String[] computer) {
        jcomp1 = new JList (computer);

        setPreferredSize (new Dimension (500, 320));
        setLayout (null);

        add (jcomp1);

        jcomp1.setBounds (25, 20, 450, 230);
    }
}


import javax.swing.*;
public class TestItem {
    public static void main(String args[]){
        int size = Integer.parseInt(JOptionPane.showInputDialog("Enter number of item"));
        Item item[] = new Item[size];
        
        for(int i = 0; i < item.length; i++)
        {
            int option = Integer.parseInt(JOptionPane.showInputDialog("Enter your option\n[1] Taxfree item\n[2] Taxable item"));
            String id = JOptionPane.showInputDialog("Enter item id");
            double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price"));
            if(option == 1)
            {
                double disc = Double.parseDouble(JOptionPane.showInputDialog("Enter discount percentage"));
                item [i] = new TaxFree(id, price, disc);
                JOptionPane.showMessageDialog(null, item[i].toString());
                
            }
            
           else if(option == 2)
            {
                double tax = Double.parseDouble(JOptionPane.showInputDialog("Enter tax percentage"));
                item[i] = new Taxable (id, price, tax);
                JOptionPane.showMessageDialog(null, item[i].toString());
            }
            
            
        }
    }//end main
}//end class
import java.io.*;
import java.util.*;

public class testClass
{
    public static void main (String [] args){
        LinkedList moviesLL = new LinkedList();
        LinkedList CashLL = new LinkedList();
        LinkedList CreditCardLL = new LinkedList();

        XYMovie num = moviesLL.getFirst();
        // move moviesLL into CashLL and CreditCardLL using removeFromSecond()
        
        while (num != null){
            if(num.getModePayment().equalsIgnoreCase("credit card")){
                 // LL(1 -> 2 -> 3 -> null) ==> (1 -> 3 -> null)
                 // CC(2 -> null)
                
                CreditCardLL.insertAtBack(moviesLL.removeFromSecond()); 
                //wtf
            } else if (num.getModePayment().equalsIgnoreCase("cash")){
                
                CashLL.insertAtBack(moviesLL.removeFromSecond());
            }
            num = moviesLL.getNext();
        }

    }


//     find_previous_node(list, node):
//    current_node = list.first
//    while(current_node.next != null):
//        if(current_node.next == node):
//           return current_node
//        else:
//           current_node = current_node.next
//    return null
}

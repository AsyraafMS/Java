
public class LinkedList
{
    private Node first, last, current;

    // constructor
    public LinkedList(){
        first = last = null;
    }

    // insert at last node
    public void insertAtBack(XYMovie obj){
        if(first == null){
            first = last = new Node(obj);
        } else{
            last = last.next = new Node(obj);
        }
    }


    // remove from second node
    public XYMovie removeFromSecond(){
        XYMovie remove; 

        if (first == null){ // there is no data in the list
            remove = null;
        } 
        else if (first == last){ // there is only one data in the list
            remove = first.data; 
            first = last = null; 
        }
        else { // there is more than one node in the list
            Node second = first.next;
            remove = second.data;
            if(first.next == last){ // if there are two nodes in the list
                first = last;
            } else { // if there are more than two nodes in the list
                first.next = first.next.next;
            }
        }
        return remove;
    }

    // get first node
    public XYMovie getFirst(){
        current = first;
        if (first == null){
            return null;
        } else {
            return current.data;
        }
    }

    // get next node
    public XYMovie getNext(){
        if (current != last){ // while not last node
            current = current.next; // pergi sebelah
            return current.data;
        } else{
            return null; // sampai last node
        }
    }

    // ll is empty
    public boolean isEmpty(){
        if (first == null){ // 
            return true;
        } else {
            return false;
        }
    }
}

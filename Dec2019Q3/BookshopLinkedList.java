
public class BookshopLinkedList
{
    private Node first, last, current;

    //default constructor
    public BookshopLinkedList() {
        first = last = null;
    }
 
    // a) COmplete definition of the addFirst() method.
    public void addFirst(Book b){
        if (first == null){
            first = last = new Node(b);
        } else { 
            first = new Node(b, first);
        }
    }

    public Book getFirst(){ 
        current = first;
        if (first == null) // if empty
            return null;
        else
            return current.data;

    }

    public Book getNext(){
        if (current != last){ // not the last node
            current = current.next; // get next
            return current.data;
        } else {
            return null;
        }
    }
}

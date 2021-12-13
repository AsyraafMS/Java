
public class Node
{
    Book data;
    Node next;

    //constructor
    public Node(Book o){ 
    //Only 1 parameter because we know it is the last node,
    // then we already know the next of the last node is always null.
        data = o;
        next = null;
        //(This will be the last node)
    }
        
    //Constructing a Node that is NOT the last node,
    public Node(Book o, Node next){
        data = o;
        this.next = next;
    }
}

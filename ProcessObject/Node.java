public class Node{

    //Should have two attributes: data and reference

    Person data; // Data type depends on the type of data you want to store be it Person or Student objects
    Node next; // next --> reference attribute
    
    //Singly linked list
    //Doubly linked list


    //Constructor (Should be 2 constructors)
    public Node(Person o){ 
    //Only 1 parameter because we know it is the last node,
    // then we already know the next of the last node is always null.

        data = o;
        next = null;
        //(This will be the last node)
    }
    
    //Constructing a Node that is NOT the last node,
    public Node(Person o, Node next){
        data = o;
        this.next = next;
    }
}
public class Node{

    //Should have two attributes: data and reference

    // replace Integer with Integer to make it more flexible
    // Superclass of all classes
    // Integer data; and so on
    Integer data; // Data type depends on the type of data you want to store be it Integer or Student Integers
    Node next; // next --> reference attribute
    
    //Singly linked lista
    //Doubly linked list


    //Constructor (Should be 2 constructors)
    public Node(Integer o){ 
    //Only 1 parameter because we know it is the last node,
    // then we already know the next of the last node is always null.

        data = o;
        next = null;
        //(This will be the last node)
    }
    
    //Constructing a Node that is NOT the last node,
    public Node(Integer o, Node next){
        data = o;
        this.next = next;
    }
}
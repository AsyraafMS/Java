import java.util.LinkedList;
public class Queue
{
    LinkedList list;

    // METHODS IN QUEUE ADT

    // CONSTRUCTOR
        public Queue(){
            list = new LinkedList();
        }
    
    // DETERMINE THE QUEUE SIZE
        public int size(){
            return list.size();
        }
    
    // DETERMINE IF QUEUE IS EMPTY
        public boolean isEmpty(){
            return list.isEmpty();
        }

    // TO INSERT AT THE BACK
        public void enqueue(Object item){
            list.addLast(item);
        }

    // TO REMOVE AT FRONT
        public Object dequeue(){
            return list.removeFirst();
        }

    // GET THE FRONT ELEMENT
        public Object front(){
            return list.getFirst();
        }


}

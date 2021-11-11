public class LinkedList
{
    Node first, last, current;
    Node sorted;

    public LinkedList(){
        first = last = null;
    }

    public void insertAtFront(Integer o){
        if(first == null){
            first = last = new Node(o);
        } else{
            first = new Node(o, first);
        }
    }

    public void insertAtBack(Integer o){
        if(first == null){
            first = last = new Node(o);
        } else{
            last = last.next = new Node(o);
        }
    }

    public Integer removeFromFront(){
        Integer remove;
        if (first == null){
            remove = null;
        } else if (first == last){
            remove = first.data;
            first = last = null;
        } else {
            remove = first.data;
            if(first.next = last){
                first = last;
            } else {
                first = first.next;
            }
        }
        return remove;
    }

    
}

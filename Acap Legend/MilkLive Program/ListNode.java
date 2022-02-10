public class ListNode
{
    Object data;
    ListNode next;
    
    ListNode(Object o){this(o, null);}
    
    ListNode(Object o, ListNode nextNode){
     data = o;
     next = nextNode;
    }

    Object getObject(){return data;}

    ListNode getLink(){return next;}
}

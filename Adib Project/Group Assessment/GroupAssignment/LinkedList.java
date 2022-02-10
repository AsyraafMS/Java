public class LinkedList
{
    private ListNode firstNode;
    private ListNode lastNode;
    private ListNode currNode;
    public LinkedList()
    {
        firstNode = lastNode = currNode = null;
    }
 
    public void insertAtFront(Object insertItem)
    {
        if(isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else
            firstNode = new ListNode(insertItem, firstNode);
    }

    public void insertAtBack(Object insertItem)
    {
        if(isEmpty())
            firstNode = lastNode = new ListNode(insertItem);
        else
            lastNode = lastNode.next = new ListNode(insertItem);
    }

    public Object removeFromFront()throws EmptyListException
    {
        Object removeItem = null;
        if(isEmpty())
            throw new EmptyListException();
        removeItem = firstNode.data;

        if(firstNode.equals(lastNode))
            firstNode = lastNode = null;
        else
            firstNode = firstNode.next;
        return removeItem;
    }

    public Object removeFromBack()throws EmptyListException
    {
        Object removeItem = null;
        if(isEmpty())
            throw new EmptyListException();
        removeItem = lastNode.data;
        if(firstNode.equals(lastNode))
            firstNode = lastNode = null;
        else
        {
            ListNode current = firstNode;
            while(current.next != lastNode)
                current = current.next;
            lastNode = current;
            current.next = null;
        }
        return removeItem;
    }

    public Object removeFromSecond()
    {
        Object removeItem = null;
        if(isEmpty() || firstNode.next == null)
            removeItem = null;
        else
        { 
            ListNode current = firstNode.next;
            removeItem = current.data;
            if(firstNode.next != lastNode)
            {
                firstNode.next = current.next;
                lastNode = current.next;
                current.next = null;
            }
        }
        return removeItem;
    }

    public boolean isEmpty()
    {
        return firstNode == null;
    }

    public Object getFirst()
    {
        if(isEmpty())
            return null;
        else
        {
            currNode = firstNode;
            return currNode.data;
        }
    }

    public Object getNext()
    {
        if(currNode != lastNode)
        {
            currNode = currNode.next;
            return currNode.data;
        }
        else
            return null;
    }
}
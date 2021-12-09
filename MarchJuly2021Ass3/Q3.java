public class Q3 {
    public static void main (String [] args){

        // customerList queue
        Queue waitListA = new Queue();
        Queue waitListB = new Queue();

        Queue tempQ = new Queue();
        while (!customerList.isEmpty())
       {
           CounterService temp = (CounterService) customerList.dequeue(); // removing front

           if (temp.getServiceType() == 'A'){
                waitListA.enqueue(temp);
            } else if (temp.getServiceType() == 'B'){
               waitListB.enqueue(temp);
           }

           tempQ.enqueue(temp); // to reinsert
       }
       while(!tempQ.isEmpty())
       {
           customerList.enqueue(tempQ.dequeue()); // reinserting
       }

       //b
       //Queue tempQ = new Queue();
        while (!customerList.isEmpty())
       {
           CounterService temp = (CounterService) customerList.dequeue(); // removing front

           if (temp.getCategory() == "Business"){
                System.out.println("WaitID: "+ temp.getWaitID()+"\nCategory: "+temp.getCategory()+"\nService Type: "+getServiceType());
            }

           tempQ.enqueue(temp); // to reinsert
       }
       while(!tempQ.isEmpty())
       {
           customerList.enqueue(tempQ.dequeue()); // reinserting
       }
    }
}

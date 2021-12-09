public class Q2 {
    public static void main (String [] args){
        //a
        LinkedList firstLL = new LinkedList();
        LinkedList secondLL = new LinkedList();
        LinkedList thirdLL = new LinkedList();

        //b
        RegisteredVaccination vacc = registeredList.getFirst();
        while (vacc != null){

            if(vacc.getFrontliner()){
                firstLL.insertAtFront(vacc);
            } else if (!vacc.getFrontliner() && vacc.getComorbidities()){
                secondLL.insertAtFront(vacc);
            } else if (!vacc.getFrontliner() && !vacc.getComorbidities()){
                thirdLL.insertAtFront();
            }
            vacc = registeredList.getNext();
        }

        //c
        RegisteredVaccination vacc = registeredList.getFirst();
        int count = 0;
        while (vacc != null){
            count++;
            vacc = registeredList.getNext();
        }
        System.out.println("Total persons in registered list: " + count);
        
        vacc = firstLL.getFirst();
        count = 0;
        while (vacc != null){
            count++;
            vacc = firstLL.getNext();
        }
        System.out.println("Total persons in firstLL: " + count);

        vacc = secondLL.getFirst();
        count = 0;
        while (vacc != null){
            count++;
            vacc = secondLL.getNext();
        }
        System.out.println("Total persons in secondLL: " + count);

        vacc = thirdLL.getFirst();
        count = 0;
        while (vacc != null){
            count++;
            vacc = thirdLL.getNext();
        }
        System.out.println("Total persons in thirdLL: " + count);
        

        //d
        RegisteredVaccination vacc = registeredList.getFirst();
        while (vacc != null){

            if ( vacc.getPostcode().startsWith("3") ){ //vacc.getPostcode().substring(0,1) == '3' ??
                System.out.println("Name: "+ vacc.getName() +"\nAddress: "+vacc.getAddress());
            }

            vacc = registeredList.getNext();
        }
    }
}

public class Q2 {
    public static void main (String [] args){
        //a
        LinkedList firstLL = new LinkedList();
        LinkedList secondLL = new LinkedList();
        LinkedList thirdLL = new LinkedList();

        //b
        RegisteredForVaccination vacc = ((RegistreredVaccination) registeredList).getFirst();
        while (vacc != null){

            if(vacc.getFrontliner() == "yes"){
                firstLL.insertAtFront(vacc);
            } else if (vacc.getFrontliner() == "no" && vacc.getComorbidities()){
                secondLL.insertAtFront(vacc);
            } else if (vacc.getFrontliner() == "no" && !vacc.getComorbidities()){
                thirdLL.insertAtFront(vacc);
            }
            vacc = ((RegistreredVaccination) registeredList).getNext();
        }

        //c
        RegisteredForVaccination vacc = ( (RegistreredVaccination) registeredList).getFirst();
        int count = 0;
        while (vacc != null){
            count++;
            vacc = ((RegistreredVaccination) registeredList).getNext();
        }
        System.out.println("Total persons in registered list: " + count);
        
        vacc = ((RegisteredForVaccination)firstLL).getFirst();
        count = 0;
        while (vacc != null){
            count++;
            vacc = ((RegisteredForVaccination)firstLL).getNext();
        }
        System.out.println("Total persons in firstLL: " + count);

        vacc = ((RegisteredForVaccination)secondLL).getFirst();
        count = 0;
        while (vacc != null){
            count++;
            vacc = ((RegisteredForVaccination)secondLL).getNext();
        }
        System.out.println("Total persons in secondLL: " + count);

        vacc = ((RegisteredForVaccination)thirdtLL).getFirst();
        count = 0;
        while (vacc != null){
            count++;
            vacc = ((RegisteredForVaccination)thirdLL).getNext();
        }
        System.out.println("Total persons in thirdLL: " + count);
        

        //d
        RegisteredForVaccination vacc = ((RegisteredForVaccination)registeredList).getFirst();
        while (vacc != null){

            if ( vacc.getPostcode().startsWith("3") ){ //vacc.getPostcode().substring(0,1) == '3' ??
                System.out.println("Name: "+ vacc.getName() +"\nAddress: "+vacc.getAddress());
            }

            vacc = ((RegisteredForVaccination)registeredList).getNext();
        }
    }
}

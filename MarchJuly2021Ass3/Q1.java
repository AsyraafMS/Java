import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;
public class Q1
{
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);
        ArrayList deliAL = new ArrayList();

        for (int i = 0; i < 50; i++){
            String type = in.next();

            String area = in.next();
            
            double order = in.nextDouble();

            double distance = in.nextDouble();

            double charge = in.nextDouble();

            Delivery temp = new Delivery(type,area,order,distance,charge);
            deliAL.add(temp);
        }

        ArrayList PandaAL = new ArrayList();
        ArrayList GrabAL = new ArrayList();
        ArrayList OthersAL = new ArrayList();

        for (int i = 0; i < deliAL.size(); i++ ){
            if ( ((Delivery)deliAL.get(i)).getType().equalsIgnoreCase("foodpanda")){
                PandaAL.add(deliAl.remove(i));
            } else if ( ((Delivery)deliAL.get(i)).getType().equalsIgnoreCase("grabfood")){
                GrabAL.add(deliAL.remove(i));
            } else {
                OthersAL.add(deliAL.remove(i));
            }
        }


        double sum = 0;
        for (int i = 0; i < PandaAL.size(); i++){
            if (((Delivery)PandaAL.get(i)).getArea().equalsIgnoreCase("Marang")){
                
                double charge = 0;
                charge = ((Delivery)PandaAL.get(i)).getCharge() * ((Delivery)PandaAL.get(i)).getDistance();
 
                sum += ((Delivery)PandaAL.get(i)).getOrder() + charge;
            }
        }
        System.out.println("Sum for FoodPanda services in Marang: RM" + sum);

        for (int i = 0; i < OthersAL.size(); i++){
            //copying
            if(OthersAL.get(i).getArea().equalsIgnoreCase("kuala terengganu")){
                Delivery temp = new Delivery( ((Delivery)OthersAL.get(i)).getType(), ((Delivery)OthersAL.get(i)).getArea(),((Delivery)OthersAL.get(i)).getOrder(), ((Delivery)OthersAL.get(i)).getDistance(), 5 ); 
                OthersAL.set(i, temp);
            }
        }
    }
}

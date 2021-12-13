import java.util.*;
public class Program {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");

        System.out.print("Enter number of customer orders: ");
        int orders = input.nextInt();

        TailorOrder order [] = new TailorOrder[orders];

        for (int j = 0; j < order.length; j++){
            System.out.println("----ORDER " + (j+1) +"----");
            System.out.print("Enter name: ");
            String name = input.next();

            System.out.print("Enter order number (4 Digit): ");
            String number = input.next();

            System.out.print("Enter deposit: RM");
            double deposit = input.nextDouble();

            System.out.print("Enter delivery (Yes/No): ");
            String prompt = input.next();
            boolean delivery = false;
            if (prompt.equalsIgnoreCase("yes")){
                delivery = true;
            } else if (prompt.equalsIgnoreCase("no")){
                delivery = false;
            }

            System.out.print("\nChoose baju type\n---------------\n1. Baju Kurung\n2. Baju Melayu\n---------------\nType: ");
            int type = input.nextInt();

            if (type == 1){
                System.out.print("\nEnter type of Baju Kurung\nType      Description     Price (RM)\n====  ==================  ==========\n1     Normal Baju Kurung  30.00\n2     Baju Kurung Lining  60.00\n3     Normal Baju Kebaya  55.00\n4     Baju Kebaya Lining  110.00\n====================================");
                System.out.print("\nBaju Kurung type: ");
                int bkType = input.nextInt();

                System.out.print("Add embroidery? (Yes/No): ");
                prompt = input.next();
                boolean embroideryOpt = false;
                if (prompt.equalsIgnoreCase("yes")){
                    embroideryOpt = true;
                } else if (prompt.equalsIgnoreCase("no")){
                    embroideryOpt = false;
                }

                order[j] = new BajuKurung(name, number, deposit, delivery, bkType, embroideryOpt);

            } else if (type == 2){
                System.out.print("\nEnter type of Baju Melayu\nType        Description          Price (RM)\n====  =========================  ==========\n1     Baju Melayu Cekak Musang   75.00\n2     Baju Melayu Teluk Belanga  95.00\n===========================================");
                System.out.print("\nBaju Melayu type: ");
                int bmType = input.nextInt();

                order[j] = new BajuMelayu(name, number, deposit, delivery, bmType);
            }  

            System.out.println("---------------");
        }

        for (int i = 0; i < order.length; i++){
            int embroidered = 0;
            if (order[i].getEmbroidery() == true){
                embroidered++;
            }
            System.out.println("\nNumber of orders for Baju Kurung with embroidery: " + embroidered);
        }

            System.out.println("\nOrder Number      Price (RM)\n============      ==========");
            double total = 0;
                for (int p = 0; p < order.length; p++){
                    double charge = 0;
                    double orderPrice = 0;
                    if (order[p].getDelivery() == true){
                        charge = 5;
                    } else {
                        charge = 0;
                    }
                    orderPrice = order[p].getBalance() + charge;

                    System.out.println(order[p].getOrderNum() +"              RM" + orderPrice);
                    total += orderPrice;
            }
            System.out.println("          Total : RM" + total);
            input.close();
        
        // i) Declare an array of objects based on customer order. The number of customer orders
        //    is determined by user.

        // ii) Calculate and display the number of customer orders for Baju Kurung with
        //     embroidery.

        // iii) Calculate and display the payment for each order. Ifthe customer requests delivery,
        //      additional charge of RM5.00 has to be included in the payment. Calculate and display
        //      the total payment for all orders. Display the output in the following format:
        
        /*      Order Number      Price (RM)
                ============      ==========
                ...               ...
                ...               ...
                            Total : RM00.00
        */
    }
}

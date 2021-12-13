public class Customer
{
    private String customerName;
    private String customerContactNum;
    private String orderType;
    private String orderMenu;
    private int quantity;
    private char deliveryMode;
    

    public Customer()
    {
        customerName = null;
        customerContactNum = null;
        orderType = null;
        orderMenu = null;
        quantity = 0;
        deliveryMode = '0';
    }

    public Customer(String name, String number, String type, String menu, int qty, char mode)
    {
        customerName = name;
        customerContactNum = number;
        orderType = type;
        orderMenu = menu;
        quantity = qty;
        deliveryMode = mode;
    }
    
    /** Methods */
    /** Mutator Methods (Set) */
      public void setCustomerName(String newName){
        customerName = newName;
    }
      public void setContactNum(String newContactNum){
        customerContactNum = newContactNum;
    }
      public void setOrderType(String newOrderType){
        orderType = newOrderType;
    }
      public void setOrderMenu(String newOrderMenu){
        orderMenu = newOrderMenu;
    }
      public void setQuantity(int newQuantity){
        quantity = newQuantity;
    }
      public void setDeliveryMode(char newDeliveryMode){
        deliveryMode = newDeliveryMode;
    }
    
    /** Accessor Methods (Get) */
      public String getCustomerName(){
        return customerName;
    }
      public String getContactNum(){
        return customerContactNum;
    }
      public String getOrderType(){
        return orderType;
    }
      public String getOrderMenu(){
        return orderMenu;
    }
      public int getQuantity(){
        return quantity;
    }
      public char getDeliveryMode(){
        return deliveryMode;
    }
    
    /** Processor method */
    public double deliveryModeCharge(){
        if (deliveryMode == 'W'){
            return 3.00;
        } else {
            return 0.00;
        }
    }
    
    public double totalPriceCharge(){
        if        (orderType.equals("broiler") && orderMenu.equals("salmon")){
            return 60.0 * quantity;
        } else if (orderType.equals("broiler") && orderMenu.equals("catfish")){
            return 45.0 * quantity;
        } else if (orderType.equals("broiler") && orderMenu.equals("trout")){
            return 30.0 * quantity;
        } else if (orderType.equals("fryer") && orderMenu.equals("fish plate")){
            return 25.0 * quantity;
        } else if (orderType.equals("fryer") && orderMenu.equals("calamari plate")){
            return 35.0 * quantity;
        } else if (orderType.equals("fryer") && orderMenu.equals("fish and chips")){
            return 30.0 * quantity;
        } else {
            return 0;
        }
    }
    
    /** Printer method (toString())*/
    public String toString(){
        return "-----Customer Details-----\n" + "Customer Name: " + customerName + 
        "\nCustomer Contact Number: " + customerContactNum + "\nOrder Type: " + orderType + 
        "\nOrder Menu: " + orderMenu + "\nQuantity: " + quantity + "\nDelivery Mode: " + deliveryMode + 
        "\nDelivery Charge: RM" + deliveryModeCharge() + "\nGrand Total Charge: RM" + totalPriceCharge();
    }
}

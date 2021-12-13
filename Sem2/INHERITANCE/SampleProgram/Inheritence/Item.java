public  class Item
{
    private String itemId;
    protected double price;
    final double PIE = 3.142;
    
    public Item()
    {
        itemId = "";
        price = 0.0;
    }
    
    public Item(String i, double p)
    {
        itemId = i;
        price = p;
    }
    
    public  void setItem(String item){
       itemId = item;
    }
    
    public void setPrice(double pri){
       price = pri;
    }
    
    public String getItem(){
        return itemId;
    }
    
    public double getPrice(){
        return price;
    }
    
   public String toString(){
        return "Item id: " + itemId +
               "\nPrice: RM " + price;
    }  
}//end of class Item
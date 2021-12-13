/** PART A
 * a) Based on the UML Diagram, the type of this inheritence is single.
 * 
 * b) To call the superclass constructor, use the super() on the first statement of the subclass's constructor.
 * 
 */
// c)
public class RHDrink
{
    //data members
    private String custNo;
    private String custName;
    private int numOfOrder;

    //default constructor
    public RHDrink(){
        this.custName = null;
        this.custNo = null;
        this.numOfOrder = 0;
    }

    //normal constructor
    public RHDrink(String custNo, String custName, int numOfOrder){
        this.custNo = custNo;
        this.custName = custName;
        this.numOfOrder = numOfOrder;
    }

    //accessor method
    public String getCustNo(){ return custNo;}
    public String getCustName(){ return custName;}
    public int getNumOfOrder(){ return numOfOrder;}

    //other methods
    public boolean addTopping(char opt){
        if (opt == 'Y'){
            return true;
        } else if (opt == 'N'){
            return false;
        } else {
            return false;
        }
    }
    public String toString(){
        return "Customer Number: " + custNo + "\nCustomer Name: " + custName + "\nNumber of Order(s): " + numOfOrder;
    }
}


public class BSTElectricity
{
    private TreeNode root;

    public BSTElectricity()
    {
        root = null;
    }

    public void insertNode(Electricity e)
    {
        if (root==null)
            root=new TreeNode(e);
        else
            root.insert(e);
    }

   //count number of industrial building bills in Pahang
   public int countIndBuilding(String location)
   {
       return countIndBuildingRecursive(root, location);
    }
    
    private int countIndBuildingRecursive(TreeNode tn, String location)
    {
        if(tn==null)
            return 0;
        else
        {
            Electricity e = tn.data;
            
            if((e.getType()=='I')&&(e.getLocation().equalsIgnoreCase(location)))
                return 1 + countIndBuildingRecursive(tn.left, location) + countIndBuildingRecursive(tn.right,location);
            else
                return countIndBuildingRecursive(tn.left,location) + countIndBuildingRecursive(tn.right,location);
            
        }
        
    }
    
   //calculate total bill amount of all house in Johor
   
   public double totalBill()
   {
       return totalBillRecursive(root);
    }
    
    private double totalBillRecursive(TreeNode tn)
    {
        if(tn==null)
            return 0;
        else
        {
            if((tn.data.getType()=='H')&&(tn.data.getLocation().equalsIgnoreCase("Johor")))
                return tn.data.getBillAmt() + totalBillRecursive(tn.left) + totalBillRecursive(tn.right);
            else
                return totalBillRecursive(tn.left) + totalBillRecursive(tn.right);
        }
    }
   
   //display all bills in ascending order
   public void displayAscending()
   {
       displayAscendingRecursive(root);
    }
    
   private void displayAscendingRecursive(TreeNode tn)
   {
       if(tn!=null)
       {    
           Electricity e = tn.data;
           
           displayAscendingRecursive(tn.right);
           System.out.println(e.toString());
           displayAscendingRecursive(tn.left);
        }
    }
}













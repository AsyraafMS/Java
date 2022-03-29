
public class TreeNode
{
    TreeNode left, right;
    Electricity data;
    
    private int id_num;
    private int id_change;
    
    public TreeNode(Electricity e)
    {
        id_num = e.getID();
        data = e;
        left=right=null;
    }
    
    public void insert(Electricity e)
    {
        id_change = e.getID();
        
        if(id_change<id_num)
            if(left==null)
                left=new TreeNode(e);
            else
                left.insert(e);
        else if(id_change>id_num)
            if(right==null)
                right=new TreeNode(e);
            else
                right.insert(e);
                
    }
}

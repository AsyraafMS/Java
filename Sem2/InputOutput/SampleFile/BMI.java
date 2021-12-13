
public class BMI
{
    private String name;
    private double meter;
    private double kg;
    
    public BMI()
    {
        name =null;
        meter = 0.0;
        kg = 0.0;
    }
   
    public BMI(String n,double m,double k)
    {
        name = n;
        meter = m;
        kg = k;
    }
    
    public double findBMI()
    {
        double bmicount;
        bmicount = kg/(meter*meter);
        return bmicount;
    }
    
    public String ct()
    {
        String category ="";
        if(findBMI() < 18.5)
        {
            category = "Underweight";
        }
        if((findBMI()>=18.5)&&(findBMI()<=25))
        {
            category = "Normal";
        }
        if((findBMI() >25)&&(findBMI() <=30))
        {
            category = "Overweight";
        }
        if(findBMI()>30)
        {
            category = "Obese";
        }
        
       return category;
        
    }
  
    public String toString()
    {
         return "  "+ name + "\nYour height : " + meter + "\nYour weight : " + kg + "\nYour BMI : "+findBMI()+"\nCategory : "+ct();
    }
}
         
    

        
        
    
    
    
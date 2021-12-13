

public class Employee
{
    private String name;
    private int age;
    private char sex;      // M / F
    private char marital;  // maried/single
    private char jobClass; // industrial / information
    private char health;   // 1 = very good, 2 = good
    private double wage;
    
    Employee(){
        name = null;
        age = 0;
        sex = 0;
        marital = 0;
        jobClass = 0;
        health = 0;
        wage = 0;
    }
    
    /** Mutator Methods for all  */
    public void setInfo(String name1, int age1, char sex1, char marital1, char job, char health1, double wage1){
        name = name1;
        age = age1;
        sex = sex1;
        marital = marital1;
        jobClass = job;
        health = health1;
        wage = wage1;
    }
    
    /** Acessor Methods for each */
    public String getName(){
        return name;
    }
     public int getAge(){
        return age;
    }
     public char getSex(){
        return sex;
    }
     public char getMarital(){
        return marital;
    }
     public char getJob(){
        return jobClass;
    }
     public char getHealth(){
        return health;
    }
     public double getWage(){
        return wage;
    }
    
    /** Processor method calculateTax() */
    public double calculateTax(){
        if (age >= 30 && marital == 'M'){
            return 0.03 * wage; // 3%
        } else {
            return 0.05 * wage; // 5%
        }
    }
    
    public String display(){
        if (health == '1'){
            return "Citizen's Health Condition: Very Good";
        } else if (health == '2'){
            return "Citizen's Health Condition: Good";
        } else {
            return null;
        }
    }
}

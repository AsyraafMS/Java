public class Employee{
//Properties/Attributes/Data members/Fields
 private String name;
 private String grade;
 private double [] commission;
 
 //Constructor :
 //1. default constructor
 Employee(){
     name = null;
     grade = null;
     commission = new double[3];
    }
 
 //2. normal/parameterize constructor
 Employee(String name, String grade, double com[]){
     this.name = name;
     this.grade = grade;
     this.commission = com;
    }
  
 //3. copy constructor
Employee(Employee data){
     this.name = data.name;
     this.grade = data.grade;
     this.commission = data.commission;
    }
    
//method
//1. Accessor 
public String getName(){
    return name;
}

public String getGrade(){
    return grade;
}

public double [] getCommission(){
    return commission;
}



//2. Mutator method
public void setName(String nme){
    name = nme;
}

public void setGrade(String grd){
    grade = grd;
}

public void setCommission(double [] com){
    commission = com;
}

//3. display method
/**
 * Option 1
 */
public String toString1(){
    return "\nName : " + name +"\nGrade : " + grade +"\nCommission month 1 :" +commission[0]
    +"\nCommission month 2 :" +commission[1] +"\nCommission month 3 :" +commission[2] ;
}
/**
 * Option 2
 */
public String toString(){
    String dataCom = " ";
    for (int i=0; i<commission.length; i++){
        dataCom += "\nCommission month " + (i+1) + ":" +commission[i];
    }
        
    return "\nName : " + name +"\nGrade : " + grade + dataCom;
   
}
//4. process method

public double calcAverageComm(){
    double average=0 , sum=0;
    for (int i=0; i<commission.length; i++){
        sum += commission[i];
    }
    
    average = sum/commission.length;
    
    return average;
}


}
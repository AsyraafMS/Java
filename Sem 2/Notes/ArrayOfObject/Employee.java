public class Employee{
//Properties/Attributes/Data members/Fields
 private String name;
 private String grade;

 
 //Constructor :
 //1. default constructor
 Employee(){
     name = null;
     grade = null;
   
    }
 
 //2. normal/parameterize constructor
 Employee(String name, String grade){
     this.name = name;
     this.grade = grade;
     
    }
  
 //3. copy constructor
Employee(Employee data){
     this.name = data.name;
     this.grade = data.grade;
     
    }
    
//method
//1. Accessor 
public String getName(){
    return name;
}

public String getGrade(){
    return grade;
}




//2. Mutator method
public void setName(String nme){
    name = nme;
}

public void setGrade(String grd){
    grade = grd;
}


//3. display method

public String toString(){
   
    return "\nName : " + name +"\nGrade : " + grade  ;
   
}


}
public class Student  {

private String name;
private int metric;
private Date birthDate;
private String program;

public Student(String n, int m, Date bd, String p) {
name = n;
metric = m; 
birthDate = bd;
program = p;
}


public int detAge(){
  int year = 2009; 
  int age =0;
    if (year > birthDate.theYear())
        age = year - birthDate.theYear();
    else
        System.out.println("Incorrect year..");
        
        return age;
}

//retrievals :
public String theName()  {return name; }

public int theMetric()  { return metric; }

public Date theBirthDate()  {return birthDate; }

public String theProgram()  {return program;}
}

import javax.swing.JOptionPane;
public class TestCompositeObject{
    public static void main (String [] args){

    // Declare an array of Student with size 100
    Student[] stu = new Student[100];

    //  Get data from user about Students and store into that array. The process will stops when no more data to enter.

String choice = "Yes";
Date Bdate;
int count = 0;

while (choice.equalsIgnoreCase("Yes")){  
    String name = JOptionPane.showInputDialog("Enter name:");
    int metric = Integer.parseInt(JOptionPane.showInputDialog("Enter metric:"));
    int dd = Integer.parseInt(JOptionPane.showInputDialog("Enter day of birth (1,2,3):"));
    int mm = Integer.parseInt(JOptionPane.showInputDialog("Enter month of birth (1,2,3):"));
    int yy = Integer.parseInt(JOptionPane.showInputDialog("Enter year of birth (1986, 1987.)"));
    Bdate = new Date(dd,mm,yy);
    String prog = JOptionPane.showInputDialog("Enter program:");
    stu[count] = new Student(name,metric,Bdate,prog);
    count++;
    choice = JOptionPane.showInputDialog("Do you want to continue?:");
}

//The number of students that has birth date in August

int totalAug = 0;
for (int j=0; j<count; j++)
{  if (stu[j].theBirthDate().theMonth() ==8)
   totalAug++;
}
System.out.println("Number of student born in August is :" + totalAug);

//the list of DCS student born in the year of 1980

for (int j=0;j<count;j++)
{  if (stu[j].theBirthDate().theYear() == 1980 && stu[j].theProgram().equals("DCS"))
System.out.println("Student Born in 1980 and DSC student \n Name : " 
+ stu[j].theName());
}

//The information about the eldest student
int maxAge = stu[0].detAge();
int indexHigh = 0;
for (int j=0;j<count;j++){  
    if (stu[j].detAge() > maxAge){ 
     maxAge = stu[j].detAge();
     indexHigh = j;
    }
}
System.out.println("The eldest is \n Name :" + stu[indexHigh].theName() + 
"\nMetric :" + stu[indexHigh].theMetric() 
+ "\nBirthDate:" + stu[indexHigh].theBirthDate().theDay() 
+ "\\" + stu[indexHigh].theBirthDate().theMonth()
 + "\\" + stu[indexHigh].theBirthDate().theYear()
 + "\nProgram :" + stu[indexHigh].theProgram());

    }
}


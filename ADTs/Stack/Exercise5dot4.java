import java.util.Stack;
import java.util.ArrayList;

public class Exercise5dot4
{
    public static void main (String [] args){
        ArrayList courseList = new ArrayList();
        // All courses in UiTM Johor had been stored into a sequential list (arrayList) named courseList
     
        // a)
        Stack csStack = new Stack();
        Stack acStack = new Stack();
        Stack imStack = new Stack();
        
        for (int i = 0; i < courseList.size(); i++){
            if ( ((Course)courseList.get(i)).getFCode().equalsIgnoreCase("cs")){
                csStack.push(((Course)courseList.get(i)));
            } else if ( ((Course) courseList.get(i)).getFCode().equalsIgnoreCase("ac")){
                acStack.push(((Course)courseList.get(i)));
            } else if ( ( (Course) courseList.get(i)).getFCode().equalsIgnoreCase("im")){
                imStack.push(((Course)courseList.get(i)));
            }
        }

        // b) remove all courses in falculty im from courseList
        for (int i = 0; i < courseList.size(); i++){
            if ( ((Course)courseList.get(i)).getFCode().equalsIgnoreCase("im")){
                courseList.remove(i);
            }
        }
 
        // c) calc and disp total number of students and total number of lecturers
        // in each faculty for csStack, acStack and imStack
        //======================================================================================
        int students = 0, lecturers = 0;

        Stack tempStack = new Stack();
        while (!csStack.isEmpty()){
            Course courseObj =  (Course) csStack.pop();

            students += courseObj.getNS();
            lecturers += courseObj.getNL();

            tempStack.push(courseObj);
        }
        System.out.println("=== csStack ==="+"\nTotal Students: " + students + "\nTotal Lecturers: " + lecturers + "\n===========");
        while (!tempStack.isEmpty()){
            csStack.push(tempStack.pop());
        }
        //======================================================================================
        students = 0;
        lecturers = 0;

        while (!acStack.isEmpty()){
            Course courseObj =  (Course) acStack.pop();

            students += courseObj.getNS();
            lecturers += courseObj.getNL();

            tempStack.push(courseObj);
        }
        System.out.println("=== acStack ==="+"\nTotal Students: " + students + "\nTotal Lecturers: " + lecturers + "\n===========");
        while (!tempStack.isEmpty()){
            csStack.push(tempStack.pop());
        }
        //======================================================================================
        students = 0;
        lecturers = 0;

        while (!imStack.isEmpty()){
            Course courseObj =  (Course) imStack.pop();

            students += courseObj.getNS();
            lecturers += courseObj.getNL();

            tempStack.push(courseObj);
        }
        System.out.println("=== imStack ==="+"\nTotal Students: " + students + "\nTotal Lecturers: " + lecturers + "\n===========");
        while (!tempStack.isEmpty()){
            csStack.push(tempStack.pop());
        }
        //======================================================================================
    }
    
}
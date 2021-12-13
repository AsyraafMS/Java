/** to write something into a file*/
/** 1. import statements for writing into FILE*/

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

//import java.io.*;

import java.util.Scanner;

public class WriteFile
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name:  ");
        String name = scanner.next();
        
        /** 2. define and create File (Step 1)*/
        File sample = new File(name);
        
        /** 3. Exceptional Handler*/
        try{          
            /** 4.define and create PrinWriter & FileWriter (Step 2)*/
            FileWriter cth = new FileWriter(sample);
            PrintWriter out = new PrintWriter(cth);
            
            String s="I'M nafisah Amin";
            
            /** 5. (Process involve) To print into FIle using print or println  (Step 3)*/
            out.println(s);
            out.print(s);
            out.println(s);
         
            System.out.print("Data is stored Thank you  ");
            
            /** 6. close the PrintWriter and FileWriter (Step 4)*/
            out.close();
        }
        /** 7. Exception handler*/
        catch(IOException e){
            e.printStackTrace();
        }
    }//end of main
}//end of class

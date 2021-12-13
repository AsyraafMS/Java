/** 1. import statements involve of input stream io package*/
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

public class ReadFile
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name:  ");
        String name = scanner.next();
        
        /** 2. Define and create File object (Step 1) */
        File file = new File(name);
        /** 3. Exception Handler*/
        try{
            /** Define and Create Read File class BufferedReader From FileReader (Step 2)*/
            FileReader ma = new FileReader(file);
            BufferedReader in = new BufferedReader(ma);
            
            /** Process involve in reading File using method readLine (Step 3)*/
            String s;
            s = in.readLine();
            
            while(s != null){
                System.out.println("Read: " + s);
                s = in.readLine();
            }
            
            /** Close the File Reader class Buffereader and FileReader (Step 4)*/
            in.close();
        }
        catch(FileNotFoundException e1){
            System.err.println("File not found: " + file);
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
    }//end of main
}//end of class
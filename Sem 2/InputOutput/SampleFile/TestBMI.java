/**import statement*/
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;


public class TestBMI{
    public static void main(String[] args) throws IOException{
        /** Exception Handler */
        try{
            /** Define and create input  file */
            BufferedReader inFile = new BufferedReader (new FileReader("sample.txt"));
            
            /** Define and create Output file */
            PrintWriter outfile = new PrintWriter(new FileWriter("output1.txt"));
            
            /** process involve with file (input & output)*/
            String data = null;
            while((data = inFile.readLine())!=null){ 
                StringTokenizer input = new StringTokenizer(data, "#");
                String name = input.nextToken();
                double meter = Double.parseDouble(input.nextToken());
                double kg = Double.parseDouble(input.nextToken());
                
               /**object BMI as value*/
                BMI value = new BMI(name,meter,kg);
                
                System.out.print(value.toString());
                outfile.println("****SENARAI OVERWIGHT***");
                if(value.ct().equalsIgnoreCase("overweight")){
                    outfile.println(value.toString());
                }             
                
            }
            /** close input * output file */
            inFile.close();
            outfile.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
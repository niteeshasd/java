import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
 
public class NumsAdd
{
    public static void main(String args[])
    {
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which file would you like to read numbers from: ");
        fileName = keyboard.next();
        System.out.println("Reading numbers from file " + fileName );

        
       
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                // System.out.println(objFile.getAbsoluteFile());
                System.out.println("File does not exist!!!");
                System.exit(0);
            }
             
             int sum=0;
            //writting data into file
            String text;
            //int score;
            System.out.println(objFile.getAbsoluteFile());

            FileReader objFR=new FileReader(objFile.getAbsoluteFile());
            BufferedReader objBR=new BufferedReader(objFR);
            //read text from file
            System.out.println("Content of the file is: ");
            while((text = objBR.readLine()) !=null)
            {
                for (String text1: text.split(" "))
                {
                    sum= sum + Integer.parseInt(text1);
                }
                
                
            }
            System.out.println("sum of your numbers is "+ sum);
             
            objBR.close();          


        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}
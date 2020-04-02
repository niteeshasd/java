import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;
 
public class DisplayFile
{
    public static void main(String args[])
    {
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which file would you like to read: ");
        fileName = keyboard.next();
        System.out.println("Reading from file " + fileName );

        
       
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                // System.out.println(objFile.getAbsoluteFile());
                System.out.println("File does not exist!!!");
                System.exit(0);
            }
             
             int i=0;
             
            //writting data into file
            String text;
            //int score;
            System.out.println(objFile.getAbsoluteFile());

            FileInputStream objFR=new FileInputStream(objFile.getAbsoluteFile());
            //BufferedReader objBR=new BufferedReader(objFR);
            //read text from file
            System.out.println("Content of the file is: ");
            while((text = objFR.read()) != null )
            {
                if(i/3==0)
                    System.out.print(text);
                i++;
            }
            
            objFR.close();          


        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}
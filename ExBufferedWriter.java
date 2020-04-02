import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;
 
public class ExBufferedWriter
{
    public static void main(String args[])
    {
        final String fileName="score.txt";
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                if(objFile.createNewFile())
                {
                    System.out.println("File created successfully.");
                }
                else
                {
                    System.out.println("File creation failed!!!");
                    System.exit(0);
                }
            }
             
            //writting data into file
            String text, s;
            int score;
            Scanner SC=new Scanner(System.in);
             
            System.out.println("You got a high score! ");
            System.out.println("please enter your score : ");
            score = SC.nextInt();
            System.out.println("please enter your name : ");
            text= SC.next(); 
             
            //instance of FileWriter 
            FileWriter objFileWriter = new FileWriter(objFile.getAbsoluteFile());

            //System.out.println(objFile.getAbsoluteFile());
            //instnace (object) of BufferedReader with respect of FileWriter
            BufferedWriter objBW = new BufferedWriter(objFileWriter);
            //write into file
            objBW.write(String.valueOf(score));
            objBW.newLine();
            objBW.write(text);
            objBW.close();
        
             
            System.out.println("Data stored in "+ fileName);

            FileReader objFR=new FileReader(objFile.getAbsoluteFile());
            BufferedReader objBR=new BufferedReader(objFR);
            //read text from file
            System.out.println("Content of the file is: ");
            while((s = objBR.readLine()) !=null)
            {
                System.out.println(s);
            }
             
            objBR.close();          


        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}
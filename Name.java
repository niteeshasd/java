import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
 
public class Name
{
    public static void main(String args[])
    {
        final String fileName="name.txt";
       
         
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                System.out.println(objFile.getAbsoluteFile());
                System.out.println("File does not exist!!!");
                System.exit(0);
            }
             
             
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
                System.out.println(text);
            }
             
            objBR.close();          


        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}
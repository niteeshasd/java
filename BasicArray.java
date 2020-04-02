import java.util.Random;
import java.util.Scanner;


public class BasicArray
{
    public static void main(String[] args)
    {
      Scanner keyboard_input = new Scanner(System.in);
      int intArray[];
      int c=0;
      int pos=0;
      intArray = new int[10];

      System.out.print("Array :") ;
      
      for (int i=0;i<10;i++)
      {
          intArray[i] = (int) (1+ Math.random()*49);
          System.out.print("  " + intArray[i]);
          
      }

      System.out.println();
      System.out.print("Value to find :"); 
      //c = keyboard_input.nextInt();

      for (int i=0;i<10;i++)
      {
        if( intArray[i] > c)
        {
             c = intArray[i];
             pos = i;
             //System.out.println(intArray[i]);
             //System.out.println( c + "is in the array") ;
        }
          
      }

      System.out.println(" The largest value :" + c + "in slot "+ pos);

    }
}

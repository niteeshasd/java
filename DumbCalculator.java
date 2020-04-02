import java.util.Scanner;
public class DumbCalculator
{
     public static void main(String[] args)
     {
         float num1,num2,num3;
         double answer;

         Scanner keyboard_input = new Scanner(System.in);

         System.out.print("What is your first number?");
         num1 = keyboard_input.nextFloat();

         System.out.print("What is your second number?");
         num2 = keyboard_input.nextFloat();
         
         System.out.print("What is your third number?");
         num3 = keyboard_input.nextFloat();

         answer = (num1 + num2+ num3)/2;

         System.out.println();

         System.out.println("(" + num1 +"+" + num2 + "+" + num3+ ")/2 is ...." + answer );
         

     }

}
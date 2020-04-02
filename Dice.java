import java.util.Random;
import java.util.Scanner;

public class Dice
{
	public static void main( String[] args )
	{
		//Scanner keyboard = new Scanner(System.in);
		Random dice = new Random();
        // Random two_dice = new Random();
         int flip1,flip2;
        
        System.out.println("HERE COMES THE DICE!");
        System.out.println();

        do
        {
            
            flip1 = dice.nextInt(6) + 1;
            flip2 = dice.nextInt(6) + 1;

            
            System.out.println("ROLL #1 : " + flip1);
            System.out.println("ROLL #2 : " + flip2);

            System.out.println("TOTAL IS :" + (flip1+flip2));

        }while(flip1 != flip2);

         //System.out.println("ROLL #1 : " + flip1);
         //System.out.println("ROLL #2 : " + flip2);

         //System.out.println("TOTAL IS :" + (flip1+flip2));
        

		//String again="y";

		
	}
}

import java.util.Random;
import java.util.Scanner;

public class Blackjack
{
    public static void main(String[] args)
    {
        int a,b,c,d,e,x;
        int sum1,sum2;
        Scanner keyboard_input = new Scanner(System.in);
        String input;
        String HIT ="hit";
        char A,J,Q,K;


        System.out.println(" BLACK JACK ");
        a = numGen();
        //if (a>10)
            //a = intToChar(a);
        b = numGen();


        sum1 = plus(a)+plus(b);

        System.out.println("You drew " + printFace(a) + " and " + printFace(b));
        System.out.println("your total is" + sum1);

        c = numGen();
        d = numGen();
        sum2 = plus(c)+plus(d);
        
        System.out.println("The dealer has "+ printFace(c)+" showing and a hidden card \n");
        System.out.println("Dealer total is hidden too \n");
        //System.out.println("Dealer's total is " + sum2);

        do
        {
            System.out.print("Would you like to \"hit\" or \"stay\" ?");
            input = keyboard_input.next();
            if(input.equals(HIT))
            {
                e = numGen();
                //System.out.println("sum before draw is" + sum1);
                System.out.println("You drew a " + printFace(e)  + ".");
               // System.out.println("sum before draw is" + sum1);
                sum1 = plus(e) + sum1 ;
                System.out.println("Your total is "+ sum1 + "\n");
            }
        } while(input.equals(HIT) && sum1<21);

        if(sum1>21)
            System.out.println("DEALER WINS \n");

        else
        {
           
            System.out.println("Dealer's turn \n");
            //System.out.println("The dealer has a "+ printFace(c)+" showing and hidden card");
            //System.out.println("Dealer total is hidden too");

            while(sum2<17)
            {
                System.out.println("Dealer chooses to hit ");
                e = numGen();
                sum2 = plus(e) + sum2 ;

            }

           // if(sum2>=16)
               // System.out.println("dealer stays");

            if(sum2>21)
                System.out.println("DEALER BUSTED,YOU WIN");
            else if(sum1>sum2)
                System.out.println("YOU WIN");
            else
                System.out.println("DEALER WINS");

                
             
           //System.out.println("You drew a "+ e+ ".");
              
            //System.out.println("Your toatal is "+ sum2);
        }

        System.out.println("Your total is "+ sum1);
        System.out.println("Dealer total is "+ sum2);
    }
    private static int numGen()
    {
        int random;
        random = (int) (2 + Math.random()*13 ) ;
        return random;
    }

    private static String intToStr(int x)
    {
        if(x==12)
        {
            return "J";
        }
        else if(x==13)
        {
            return "Q";
        }
        else if(x==14)
        {
            return "K";
        }
        else
        {
            return "A";
        }
    }

    private static int plus(int x)
    {
        return (x>11)?10:x;
    }

    private static String printFace(int e)
    {
       return (e>10 ? intToStr(e) : (""+e) );
    }


}
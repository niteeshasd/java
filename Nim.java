import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Nim
{
	//Random pile = new Random();

    public static int a,b,c,sel;
    public static int count;
    public static char A,B,C,selection;

    public static String player1,player2,play,s1,s2,s3;

	public static void main( String[] args )
	{
        Random pile = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        count=0;
        a = pile.nextInt(10);
        if(a==0)
            count++;
        b = pile.nextInt(10);
        if(b==0)
            count++;
        c = pile.nextInt(10);
        if(c==0)
            count++;


        System.out.print("Player 1, enter your name : ");
        player1 = keyboard.next();

        System.out.print("Player 2, enter your name : ");
        player2 = keyboard.next();

        s1 = printStar(a);
        s2 = printStar(b);
        s3 = printStar(c);
        

        System.out.println("A :" + a + "    B :"+ b +"   C :"+c);
        // System.out.println("A :" + printStar(a));
        // System.out.println("B :" + printStar(b));
        // System.out.println("C :" + printStar(c));

        fancyDisplay(a,b,c);
            


        do
        {
            nim(player1);
            if((count==2) && (a==1 || b==1 || c==1))    
            {
                System.out.println(player2 +", you must take the last remaining counter, so "+ player1 + " wins.");
                break;
            }

            else if(a==0 && b==0 && c==0)
                System.out.println(player2 +", there are no counters left, so you WIN!");

            else 
            {
                nim(player2);
                if(count==2 && (a==1 || b==1 || c==1))
                    {
                    System.out.println(player1 +",you must take the last remaining counter,so "+ player2 + " wins.");
                    break;
                    }
         
                else if(a==0 && b==0 && c==0)
                    System.out.println(player1 +", there are no counters left, so you WIN!");
                    
            }
        }while(a!=0 || b!=0 || c!=0);  

    }        

    public static void nim(String play)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print(play + " : choose a pile :");

        selection = keyboard.next().charAt(0);

            
            while((selection=='A' && a==0) || (selection=='B' && b==0) || (selection=='C' && c==0))
            {
                System.out.print("Nice try "+ play + ".That pile is Empty. choose again :");
                selection = keyboard.next().charAt(0);
            }

            System.out.print("How many do you want to remove from pile  " + selection  + " :");
            sel = keyboard.nextInt();
            
            while(sel<=0)
            {
                System.out.print("You must choose atleast 1. How many ? ");
                sel = keyboard.nextInt();
            }


            while((selection=='A' && sel>a) || (selection=='B' && sel>b) || (selection=='C' && sel>c))
            {
                System.out.print("Pile " + selection + " doesnt have that many counters, select again: ");
                sel = keyboard.nextInt();
            }

            switch(selection)
            {
                case 'A':
                    a=a-sel;
                    if(a==0)
                        count++;
                    break;

                case 'B':
                    b=b-sel;
                    if(b==0)
                        count++;
                    break;
                case 'C': 
                    c=c-sel;
                    if(c==0)
                        count++;
                    break;
            }

            System.out.println("A :" + a + "    B :"+ b +"   C :"+c);

            fancyDisplay(a,b,c);
         //   System.out.println("A :" + printStar(a));
         // System.out.println("B :" + printStar(b));
         // System.out.println("C :" + printStar(c));
            
            //System.out.println("count is "+ count);

    }

    public static String printStar(int val)
    {
        String stars = "";
        for(int i=0;i<val;i++)
        {
            stars = stars + "*";
        }
        return stars;
    }

    public static void fancyDisplay(int x, int y, int z)
    {
        int max;
        if(x>y && x>z)
            max=x;
        else if(y>x && y>z)
            max=y;
        else 
            max=z;

        s1= printStar(x);
        for(int i=0;i<max-x;i++)
        {
            s1 = s1 + " ";
        }

        s2= printStar(y);
        for(int i=0;i<max-y;i++)
        {
            s2 = s2 + " ";
        }

        s3= printStar(z);
        for(int i=0;i<max-z;i++)
        {
            s3 = s3 + " ";
        }

        System.out.println(s1);
        //char[] charArray1= s1.toCharArray();
        //char[] charArray2 = s2.toCharArray();
        //char[] charArray3 = s3.toCharArray();
        
        for(int j=max-1;j>=0;j--)
        {
            System.out.print(" " +s1.charAt(j));
            System.out.print(" " +s2.charAt(j));
            System.out.print(" " +s3.charAt(j));
            System.out.println();
            
        }
        System.out.println(" A B C");
        
        
    }

}
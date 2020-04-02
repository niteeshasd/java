import java.util.Random;
import java.util.Scanner;

public class OneShot
{
    public static void main(String[] args)
    {
        int guess,random_num;

        Scanner keyboard_input = new Scanner(System.in);

        random_num = genRandom();

        System.out.print("I'm thinking of a number btw 1-100. try to guess it ");

        guess = keyboard_input.nextInt();

       // if(guess == random_num)
       //    System.out.println("You guessed it! what are the odds?!");

      
            while (guess!=random_num && guess!=0)
            {
                if(guess > random_num)
                {
                    System.out.println("Sorry, you are too high. Press 0 to exit or Have Another guess: ");
                    guess = keyboard_input.nextInt();
                }

                else if(guess < random_num)
                {
                    System.out.println("Sorry, you are too low. Press 0 to exit or Have Another guess: ");
                    guess = keyboard_input.nextInt();
                }

            }

            if(guess==0)
                System.out.println("You got tired already!");
            else
                System.out.println("You guessed it! what are the odds?!");


    }

    private static int genRandom()
    {
        return (int) (Math.random()*100);
        
    }

}
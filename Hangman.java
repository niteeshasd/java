import java.util.Scanner;
import java.lang.String;
import java.util.Random;

public class Hangman
{
    private static  String ran_word, miss_char, guess_letter,guess_word="";
    private static Scanner input = new Scanner(System.in);
    private static int word_length, count=0;
    private static char con;
    public static void main(String[] args)
    {
    do
    {
        ran_word= randomWord();
        System.out.println("random word is "+ran_word);
        miss_char="";
        guess_letter="";
        word_length= ran_word.length();
        System.out.println("random word length :"+ word_length);

        guess_word=firstGuess(ran_word);

        do 
        { 
        char letter= input.next().charAt(0);
        guess_letter = guess_letter + Character.toString(letter);
        System.out.println("guess letter :"+ guess_letter);

        guess(letter, ran_word);
        miss(letter);
        input(letter);
        }
        while(count<word_length);  
        guess_word="";
        guess_letter="";
        miss_char="";
        count=0;

        System.out.println("do u want to continue(c) or quit(q)?");
        con= input.next().charAt(0);
    } while(con == 'c');

    }

    public static void guess(char c, String ran_word)
    {
        char[] guessChar;
        //System.out.println(guess_word);
        System.out.print("Word   :");
        for(int i=0;i<ran_word.length();i++)
        {
            char[] ran_wordchar = ran_word.toCharArray();
            if(ran_wordchar[i]==c)
            {
                count++;
                guessChar = guess_word.toCharArray();
                guessChar[2*i] = c;
                guess_word = String.valueOf(guessChar);
            }
            
        }
        System.out.println(guess_word);
        
    }

    public static void miss(char c)
    {
        int x=0;
        char[] ran_wordchar= ran_word.toCharArray();
        for(int i=0;i<ran_word.length();i++)
        {
            if(ran_wordchar[i]==c)
                x++;
                       
        } 
        if(x==0)
             miss_char= miss_char + String.valueOf(c); 
        System.out.println("Misses :" + miss_char);
    }

    public static void input( char c)
    {
        System.out.print("Guess  :");
        System.out.print(guess_letter);       
    }

    public static String firstGuess(String s)
    {
        int len = s.length();
        System.out.println("***************");
        System.out.print("Word   :");
        for(int i=0;i<len;i++)
        {
           guess_word = guess_word + "_ "; 
        }
        System.out.print(guess_word);
        System.out.println();
        System.out.println("Misses :");
        System.out.print("Guess  :");

        return guess_word;
    }

    public static String randomWord()
    {
        int ran_num;
        
        ran_num = (int) (Math.random()*5);

        switch(ran_num)
        {
            case 0:
                ran_word ="alphabet";
                break;
            case 1:
                ran_word ="sentence";
                break;
            case 2:
                ran_word ="grammar";
                break;
            case 3:
                ran_word ="punctuation";
                break;
            case 4:
                ran_word ="emojis";
                break;
        }
        return ran_word;
    }
}
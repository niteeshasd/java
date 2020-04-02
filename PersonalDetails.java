import java.util.Scanner;
public class PersonalDetails
{
    public static void main(String[] args)
    {
        String name;
        int age;
        double pay;
        
        Scanner keyboard_input = new Scanner(System.in);

        System.out.print("Hello, What is your name?");
        name = keyboard_input.next();

        System.out.print("Hi "+ name +", How old are you?");
        age = keyboard_input.nextInt();

        System.out.println("So you are " + age +" eh? that's not old at all");

        System.out.print(" How much do u make,"+ name +"?");
        pay = keyboard_input.nextDouble();

        System.out.print( pay +"! I hope that's per hour and not per year! LOL!");

    }
}
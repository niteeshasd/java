import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		int h_feet;
        int h_inch;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		h_feet = keyboard.nextInt();

        System.out.print( "How many inch tall are you? " );
		h_inch = keyboard.nextInt();

		System.out.print( "How much do you weigh in kgs? " );
		weight = keyboard.nextDouble();

		System.out.print("So you're " + age + " years old, " + h_feet + "\'"+ h_inch +"\" tall and " + weight + "kgs  heavy." );
	}
}
import java.util.Scanner;

public class GenderGame
{
    public static void main(String[] args)
    {
        Scanner keyboard_input = new Scanner(System.in);

        int age;
        String first_name, last_name;
        char maritial_status,sex;

        System.out.print("What is your gender (M OR F):  ");

        sex = keyboard_input.nextChar();

        System.out.print("First name :");

        first_name = keyboard_input.next();

        System.out.print("Last name :");

        last_name = keyboard_input.next();

        System.out.print("Age :");

        age = keyboard_input.nextInt();


        if( age < 20)
            System.out.println("Then I shall call you"+ first_name+ last_name);

        else if( sex == 'F' && age >=20 )

        {
            System.out.print("Are you married,"+ first_name +"( y or n)?");
            maritial_status = keyboard_input.nextChar();

            if (maritial_status == 'y')
                System.out.println("Then I shall call you Mrs"+ last_name);

            else if(maritial_status == 'n')
                System.out.println("Then I shall call you Ms"+ last_name);


        }

        else if( sex == 'M' && age >=20)
            System.out.println("Then I shall call you Mr"+ last_name);
        



    }
}
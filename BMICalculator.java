import java.util.Scanner;
public class BMICalculator
{
    public static void main(String[] args)
    {
        Scanner keyboard_input = new Scanner(System.in);

        double wt_kg;
        double ht_m, bmi;

        System.out.print("Your weight in pounds?");
        wt_kg = 0.45*keyboard_input.nextDouble();

        System.out.print("Your height in (feet only)?");
        ht_m = 0.3*keyboard_input.nextDouble();

        System.out.print("Your height -any extra inches?");
        ht_m = ht_m + 0.025*keyboard_input.nextDouble();


        bmi = wt_kg/(ht_m*ht_m);

        System.out.println("Your BMI is  " + bmi);

        if(bmi<15.0)
            System.out.println("BMI Category : very severely underweight");

        else if(bmi>=15.0 && bmi <= 16.0)
            System.out.println("BMI Category : severely underweight");

        else if(bmi>=16.1 && bmi <= 18.4)
            System.out.println("BMI Category : underweight");

        else if(bmi>=18.5 && bmi <= 24.9)
            System.out.println("BMI Category : normal weight");
        
        else if(bmi>=25.0 && bmi <= 29.9)
            System.out.println("BMI Category : overweight");

        else if(bmi>=30.0 && bmi <= 34.9)
            System.out.println("BMI Category : moderately obese");

        else if(bmi>=35.0 && bmi <= 39.9)
            System.out.println("BMI Category : severely obese");

        else if(bmi>=40)
            System.out.println("BMI Category : very severely (or \"morbidly\") obese");



    }
}
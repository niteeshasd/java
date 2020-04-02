import java.util.Scanner;

public class ParallelArrays
{
	public static void main( String[] args )
	{
        Scanner keyboard_input = new Scanner(System.in);
        String[] name = { "alpha", "bravo", "charlie", "sama", "suryadevara" }; 
        double[] grade = {"99.5","89.5","79.5","59.5","69.5"};
        int[] id ={"1075815", "1075816", "25698","254789","52468"};
        int num;

        System.out.println("Values:");
        for(i=0;i<5;i++)
        System.out.println(name[i] + grade[i]+ id[i]);

        System.out.print("ID to find :");
        num = keyboard_input.nextInt();

        






    }
}
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.util.*;

public class Calculator
{
    public static void main(String[] args)
	{
        Scanner keyboard = new Scanner(System.in);

        System.out.print(">");
        
        double first_operand,second_operand,res;
        int int_operand,int_res;
        String str,bin,op;
        String[] arrOfOp;

		do
		{
			System.out.print("Hello>");
			//a  = keyboard.nextDouble();
            str = keyboard.nextLine();
            System.out.println(str);
            //b  = keyboard.nextDouble();
            String regex = " ";
            arrOfOp = str.split(regex);
             //System.out.println(arrOfOp[0]);
            //System.out.println(arrOfOp[1]);

            int l = arrOfOp.length;

            switch(l)            
            {
                case 3:       

                    if(isNumeric(arrOfOp[0]) && isNumeric(arrOfOp[2]))
                    {
                        first_operand = Double.parseDouble(arrOfOp[0]);
                        second_operand = Double.parseDouble(arrOfOp[2]);
                        res = operation(arrOfOp[1],first_operand,second_operand);
                        System.out.println(res);

                        first_operand = res;
                        op = keyboard.next();
                        //System.out.println("you want to :"+arrOfOp[1]);
                        while (!op.equals("=")) 
                        {
                            second_operand = keyboard.nextDouble();
                            first_operand = res;
                            //System.out.println("you want operate :"+ first_operand +" and "+ second_operand);
                            res = operation(op,first_operand,second_operand);
                            System.out.println(res);
                            op = keyboard.next();
                        }

                        //System.out.println("program ended");

                    }
                case 2:

                    if(isInteger(arrOfOp[0]))
                    {
                        if(arrOfOp[1] == "!")
                        {
                           int_res = factorial(arrOfOp[0]);
                           System.out.println( int_res);
                        }

                    }
                    else if(isInteger(arrOfOp[1]))
                    {
                        int_operand = Integer.parseInt(arrOfOp[1]);
                        if(arrOfOp[0] == "binary")
                        {
                           //System.out.println("before conversion :" +b);  
                           bin = decimalToBinary(int_operand); 
                           System.out.println( bin);
                        } 
                    }
                    else if(isNumeric(arrOfOp[1]))
                    {
                        first_operand = Double.parseDouble(arrOfOp[1]);
                        // System.out.println("value before paasing" + d);
                        res = trignometric(arrOfOp[0],first_operand);
                        System.out.println(res);
                    }
            }
            op = keyboard.next();
        } while (!op.equals("="));
        
        System.out.println("bye");
    }

    public static double operation (String op, double op1, double op2)
    {
        int d;
        Scanner keyboard = new Scanner(System.in);
        
        double c;
        switch(op)
        {
        case "+":
            return op1 + op2;
           // break;
        case "-":
            return op1 - op2;
           // break;
        case "*":
            return op1 * op2;
           // break;
        case "/":
            return op1 / op2;
           // break;
        case "^":
            if (op2 > (int)op2)
            {
               System.out.println("Only integers can perform this action. so please  enter an integer:");
               d = keyboard.nextInt();
               return Math.pow(op1,d);
              // break;
            } 
            else          
               return Math.pow(op1,op2);
        case "root":
            return Math.pow(op1,1/op2);
            //System.out.println("value" + c);
            //return c;
        case "%":
            return op1 % op2;

              // return a + b;
              // break;
        default:
            //System.out.println("Undefined operator: '" + op + "'.");
            return 0;
        }	
    }

    public static int factorial(String s)
    {
        int d = Integer.parseInt(s);
        int fact = 1;
        for (int i=1;i<=d;i++)
        {
           fact = fact*i;
        }
        return fact;
    }

    public static double trignometric(String s, double d)
    {
        System.out.println(s);
        double c = 0;
        // float d = Float.parseFloat(s1);

        //Math.sin(Math.toRadians(30));
       // System.out.println("value" + d);
        
        switch(s)
        {
            case "sine":
               c = Math.sin(Math.toRadians(d));
               System.out.println("value" + c);
               break;
            case "cos":
               c = Math.cos(Math.toRadians(d));
               System.out.println("value" + c);
               break;
            case "tan":
               c = Math.tan(Math.toRadians(d));
               System.out.println("value" + c);
               break;
            case "sqrt":
               c = Math.sqrt(d);
               System.out.println("value" + c);
               break;
            case "-":
               c = -(d);
               System.out.println("value" + c);
               break;
            case "+":
               c = +(d);
               System.out.println("value" + c);
               break;
            case "log":
                c = Math.log(d);
                System.out.println("value" + c);
                break;
            case "round":
                if ((d -(int)d )> 0.5)
                {
                    c = (int)(d+1);
                    System.out.println("value  " + c);
                }
                else
                { 
                    c = (int)d;
                    System.out.println("value  " + c);
                }
                break;
              
        } 
        
         System.out.println("value of c before return" + c);
         return c;
    }

    public static boolean isNumeric( String s )
	{
		return ( isDouble(s) || isInteger(s) );
	}

	public static boolean isDouble( String s )
	{
		double n = 0;
		try
		{
			n = Double.valueOf( s );
		}

		catch ( NumberFormatException e )
		{
			return false;
		}

		return true;
	}

	public static boolean isInteger( String s )
	{
		int n = 0;
		try
		{
			n = Integer.valueOf( s );
		}

		catch ( NumberFormatException e )
		{
			return false;
		}

        return true;
    }

    public static String decimalToBinary(int d)
    {
        int a =0;
        String s = "";
        while (d>0 )
        {
            a =  d % 2;
            s =  s + a;
            d = d/2;
        }
        return s;
    }
}




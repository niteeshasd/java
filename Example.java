import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;;

public class Example
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr_list = new ArrayList<Integer>(10);
        Random val = new Random();
        Scanner keyboard = new Scanner(System.in);
        int val_arr,slot=0;
        int count=0;
        
        //System.out.println(arr_list.size());
        for(int i=0; i< 10;i++)
        {
            val_arr = val.nextInt(50) + 1;
            arr_list.add(val_arr);
        }

        System.out.println(arr_list);

        int max = arr_list.get(0);

        for(int i=0; i< arr_list.size();i++)
        {

            if(arr_list.get(i) > max)
            {
                max = arr_list.get(i);
                slot = i;

            }
            
            
        }
         System.out.println(max + " is the largest in the Array list in the slot "+ slot);
                 

    }
}
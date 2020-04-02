import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
// Class of ReverseString 
class ReverseString 
{ 
    public static void main(String[] args) 
    { 
        String input = "GeeksForGeeks"; 
  
        // convert String to character array 
        // by using toCharArray 
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
    } 

    
    public static String printRevStar(int a1,int a2,int a3)
    {
        String stars = "";
        String s1,s2,s3;
        int max;
        if(a1>a2 && a1>a3)
            max=a1;
        else if(a2>a1 && a2>a3)
            max=a2;
        else 
            max=a3;

            


        for(int i=0;i<val;i++)
        {
            stars = stars + "*";
        }
        return stars;
    }
} 
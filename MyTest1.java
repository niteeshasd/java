public class MyTest1
{
    public static void main(String[] args)
    {
        int i,j,n;
        n=10;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
              if(i==1 || i==n || j==1 || i==n+1-j || j==i || j==n)
                    System.out.print("* "); 
              else
                    System.out.print("  ");      
            }
            System.out.println();

        }
    }
}
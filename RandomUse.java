import java.util.Random;
public class RandomUse
{
    public static int no_spaces;
    public static void main(String[] args) throws Exception
    {
        int space1=0;
        for(int i=0;i<20;i++)
        {
            no_spaces = spaceGen();
             
            for(int j=0;j<no_spaces;j++)
            {
                System.out.print(" ");
            }
            System.out.print("Niteesha and Abhinay are Cool.");
            for(int j=0;j<space1-no_spaces;j++)
            {
                System.out.print(" ");
            }
                Thread.sleep(300);
                System.out.print("\r");
                space1= no_spaces;

        }
    }

    private static int spaceGen()
    {
        no_spaces= (int) (Math.random()*45);
        return no_spaces;
    }


}
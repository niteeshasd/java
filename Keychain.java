import java.util.Scanner;

public class Keychain
{
    public static int no_of_keychains = 0;
    public static int option;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
       System.out.println("Ye Olde Keychain Shoppe");
       double sales_tax = 8.25;
       double shipping_cost=5.0;
       double price =10.0;
       double shipping_per =1.0;
       double total;
       

       menu();
       while(5<option || option<4)
        {
            if(option==1)
            { 
                add();
                menu();
            }
            else if(option==2)
            {
                remove();
                menu();
            }
            else if(option==3)
            {
                view(no_of_keychains,price,sales_tax,shipping_cost,shipping_per);
                menu();
            }
            else
            {
                System.out.println("Wrong option. Please choose again");
                menu();
            } 
        }
        if(option==4)
            checkout(no_of_keychains,price,sales_tax,shipping_cost,shipping_per);
        else if(option==5)
            System.out.println("Thanks for visiting our site");
        
    }

    private static int menu()
    {
        System.out.println("1. Add Keychains to Order");
        System.out.println("2. Remove Keychains from Order");
        System.out.println("3. View Current Order");
        System.out.println("4. Checkout");
        System.out.println("5.exit");
        System.out.println();

        System.out.println("You have "+no_of_keychains+ " Key chains");
       
        System.out.println("Please enter your option: ");
        option = keyboard.nextInt();
        

        return option;
    }

    public static int add()
    {
        int y;
        do
        {
        System.out.println("You have "+no_of_keychains+ " Key chains. How many to add?");
        y= keyboard.nextInt();
        if(y <0)
            System.out.println("sorry,You cant place negative order.");
        }while(y < 0);
        no_of_keychains = no_of_keychains + y;
        System.out.println("You have "+no_of_keychains+ " Key chains");
        return no_of_keychains;
    }

    public static int remove()
    {
        int y;
        do
        {
        System.out.println("You current order: " +no_of_keychains+ " Key chains. How many to remove?");
        y =  keyboard.nextInt();
        if(y > no_of_keychains)
            System.out.println("sorry, It is greater than the current order of Key chains."); 
        else if(y <0)
            System.out.println("Sorry, it cannot be negative");  
        }while(y > no_of_keychains || y<0);
        no_of_keychains = no_of_keychains - y;
        System.out.println("You have "+no_of_keychains+ " Key chains");
        return no_of_keychains;
    }

    public static void view(int num_keychains, double price_per_keychain, double tax, double base_shipping, double per_keychain_shipping )
    {
        double total_cost;
        System.out.println("You have order of "+num_keychains+ " Key chains.");
        System.out.println("Price per keychain  :" +price_per_keychain );
        System.out.println("Shipping Cost  :" + base_shipping );
        System.out.println("additional Shipping per keychain :" + per_keychain_shipping );
        System.out.println("Sales Tax :" + tax + "%");

        total_cost = ((num_keychains*price_per_keychain)*(1+tax/100) + base_shipping + (per_keychain_shipping*num_keychains));
        System.out.println("Total cost of your order = " + total_cost);

       


        //no_of_keychains = no_of_keychains + keyboard.nextIn();
        
    }

    public static void checkout(int num_keychains, double price_per_keychain, double tax, double base_shipping, double per_keychain_shipping)
    {
        String name;
        System.out.print("What is your name?  ");
        name = keyboard.next();

        System.out.println();

        //view(no_of_keychains,price,sales_tax,shipping_cost,shipping_per);
        view(num_keychains, price_per_keychain, tax, base_shipping, per_keychain_shipping);
    

        System.out.println();

        System.out.println();
        System.out.println("Thanks for your order, " + name + "!");
    }
}
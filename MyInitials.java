public class MyInitials
{
    public static void main(String[] args)
    {
       printChar('A','S');
    }


        public static void printChar(char a, char b)
        {
            for(int i=1; i<=7; i++)
            {
                caller(i, a);
                caller(i, b);
                System.out.println();
            }
        }

        private static void caller(int line, char ch)
        {
            switch(line)
            {
                case 1: line1(ch); break;
                case 2: line2(ch); break;
                case 3: line3(ch); break;
                case 4: line4(ch); break;
                case 5: line5(ch); break;
                case 6: line6(ch); break;
                case 7: line7(ch); break;
            }
        }
    

        public static void line1(char initial)
        {
            switch(initial)
            {
                case 'A':
                    System.out.print("  A  ");
                    break;
                case 'S':
                    System.out.print(" SSS ");
                    break;
                case 'N':
                    System.out.print("N   N");
                    break;
            }

            System.out.print("    ");
        }

         public static void line2(char initial)
        {
            switch(initial)
            {
            case 'A':
            System.out.print(" A A ");
            break;
            case 'S':
            System.out.print("S   S");
            break;
            case 'N':
            System.out.print("NN  N");
            break;
            default:
            System.out.print("    ");


            }
        }

         public static void line3(char initial)
        {
            
            switch(initial)
            {
            case 'A':
            System.out.print("A   A");
            break;
            case 'S':
            System.out.print("S    ");
            break;
            case 'N':
            System.out.print("N N N");
            break;
            default:
            System.out.print("    ");


            }
        }

         public static void line4(char initial)
        {
            
            switch(initial)
            {
            case 'A':
            System.out.print("AAAAA");
            break;
            case 'S':
            System.out.print(" SSS ");
            break;
            case 'N':
            System.out.print("N  NN");
            break;
            default:
            System.out.print("    ");


            }
        }

         public static void line5(char initial)
        {
           
            switch(initial)
            {
            case 'A':
            System.out.print("A   A");
            break;
            case 'S':
            System.out.print("    S");
            break;
            case 'N':
            System.out.print("N   N");
            break;
            default:
            System.out.print("    ");


            }
        }

         public static void line6(char initial)
        {
           
            switch(initial)
            {
            case 'A':
            System.out.print("A   A");
            break;
            case 'S':
            System.out.print("S   S");
            break;
            case 'N':
            System.out.print("N   N");
            break;
            default:
            System.out.print("    ");


            }
        }

         public static void line7(char initial)
        {
            
            switch(initial)
            {
            case 'A':
            System.out.print("A   A");
            break;
            case 'S':
            System.out.print(" SSS ");
            break;
            case 'N':
            System.out.print("N   N");
            break;
            default:
            System.out.print("    ");


            }
        }
        

        
    
}
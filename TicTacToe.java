import java.util.Scanner;
import java.lang.String;

public class TicTacToe
{

	private static char[][] board = new char[3][3];
	private static boolean finish;
	private static int count=0;
    //private static char O,X;
       
	public static void main( String[] args )
	{
		
		boolean game;
		initBoard();
        displayBoard2();
		
		do
		{
			if(count==9)
			{
				System.out.println("game is a tie");
				break;
			}
			else
			{
				game = move('O');
				if( game== true)
					break;
				else
				{
					if(count==9)
					{
						System.out.println("game is a tie");
						break;
					}
					else
						game = move('X');
				}
			}		
		}while(game==false);		
			

	}

	public static boolean move(char frst_player)
	{
		playBoard(frst_player);
		displayBoard();
		finish = check(frst_player);
		return finish;
		
	}

	public static void initBoard()
	{
		// fills up the board with blanks
		for ( int r=0; r<3; r++ )
			for ( int c=0; c<3; c++ )
				board[r][c] = ' ';
	}


	public static void displayBoard()
	{
		System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("    --+-+--");
		System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("    --+-+--");
		System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
		System.out.println("     0 1 2 ");
	}


	public static void displayBoard2()
	{
		for ( int r=0; r<3; r++ )
		{
			System.out.print("\t"+r+" ");
			for ( int c=0; c<3; c++ )
			{
				System.out.print( board[r][c] + " " );
			}
			System.out.println();
		}
        System.out.println("\t  0 1 2 ");
    }

    public static void playBoard(char c)
    {
        Scanner keyboard = new Scanner(System.in);
        int i=0, j=0;
        String str; 
		String[] loc;
		boolean set = true;
		int[] row = new int[3];
		int[] col = new int[3];
		int[] dia = new int[2];

		
		do
		{
        	System.out.print("'"+c+"' , choose your location(row , column)  :");
        	str = keyboard.nextLine();
        
       		String regex = " ";
        	loc = str.split(regex);
        	i = Integer.parseInt(loc[0]);
			j = Integer.parseInt(loc[1]);
		        
			if(board[i][j]==' ')
			{
			    board[i][j]= c ;
				set = false;
				count++;
			}
				/*if(i==j)
				{
					if(c=='O')
					{
						dia[0]++;	
					}
					else if(c=='X')
					{
						dia[0]--;	
					}
				}
				if(i+j == 2)
				{
					if(c=='O')
					{
						dia[1]++;	
					}
					else if(c=='X')
					{
						dia[1]--;	
					}
				}


				if(c=='O')
				{
					row[i]++;col[i]++;	
				}
				else if(c=='X')
				{
					row[i]--;col[i]--;	
				}
			}  */
			else 
				  System.out.print("it is already choosen, please ");
				  
		}while(set);
		

	}

	public static boolean check(char c)
	{
			boolean val = false;

			if (board[0][0] ==c && board[1][1] == c && board[2][2] == c)
			{
				System.out.println("game done "+c+" is  the winner");
				val = true;
			}
			else if (board[0][2] == c && board[1][1] == c && board[2][0] == c)
			{
				System.out.println("game done "+c+" is  the winner");	
				val = true;
			}

			for ( int r=0; r<3; r++ )
			{
				if(board[r][0] ==c && board[r][1] == c && board[r][2] == c)
				{
					System.out.println("game done "+c+" is  the winner");
					val = true;
					break;			
				} 
				else if(board[0][r] ==c && board[1][r] == c && board[2][r] == c)
				{
					System.out.println("game done "+c+" is  the winner");
					val = true;
					break;			
				} 
				
			} 

			return val;
			
	}		
}

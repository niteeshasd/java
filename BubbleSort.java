import java.util.Random;

public class BubbleSort
{
	public static void bubble_sort(int[] a)
	{
		int swap, index;
		int j;
		for( j=0; j< a.length-1; j++)
		{	
			
		for (int k=0; k < a.length-j-1; k++)
		{
			
				if ( a[k] > a[k+1])
				{
					swap = a[k+1];
					a[k+1] = a[k];
					a[k] = swap;
				}
		}
		}
	}
	


	public static void swap( int[] a , int i, int j )
	{
		// Your code goes here
	}


	public static void main( String[] args )
	{
		Random r = new Random();
		int[] arr = new int[10];
		int i;

		// Fill up the array with random numbers
		for ( i=0; i<arr.length; i++ )
			arr[i] = 1 + r.nextInt(100);

		// Display it
		System.out.print("before: ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Sort it
		bubble_sort( arr );

		// Display it again to confirm that it's sorted
		System.out.print("after : ");
		for ( i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}

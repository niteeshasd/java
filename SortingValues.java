public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
		int swap;

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		int index;
		int j;
		for( j=0; j< arr.length-1; j++)
		{	
			
		for (int k=1; k < arr.length ; k++)
		{
			index = arr[0];
				if ( index > arr[k])
				{
					swap = arr[k];
					arr[k] = index;
					index = swap;
				}
		}
		}

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}

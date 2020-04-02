import java.util.*;

public class GivingAnArrayABunchOfValuesAtOnce
{
	public static void main( String[] args )
	{
        String[] arr = { "alpha", "bravo", "charlie" }; 
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

        list.add("delta");
        list.add("echo");


		System.out.print("The first array is filled with the following values:\n\t");
		for ( int i=0; i<list.size(); i++ )
			System.out.print( list.get(i) + " " );
		System.out.println();

	}
}

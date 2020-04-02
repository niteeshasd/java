public class NewHope
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=1; i<45; i++ )
		{
			for ( int j=1; j<45; j++ )
			{
				for ( int k=1; k<45; k++ )
				{
					for ( int l=1; l<45; l++ )
					{
						if(i+j+k+l==45)
						{
							if (i-2 == j+2)
							{
								if(j+2 == k*2)
								{
									if(k*2 == l/2)
                                        System.out.println( i +" " + j + " " + k + " " + l + " " );
                                        
                                        
								}
							}
						}
						
					}
				}
			}
		}
	}
}

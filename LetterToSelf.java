import java.io.File;
import java.io.FileWriter;

public class LetterToSelf
{
	
	public static void main(String[] args)
	{
		public  static int  LEN = 28;
		private static int START = 10;
	try
	{
		final File letter = new File("c:/users/abhin/desktop/letter.txt");

		final FileWriter writer = new FileWriter(letter);
	
	
		String a,b,c;
		a="Niteesha";
		b="2402 194th st SE";
		c="Bothell";

		//writer.write();
		
		firstnbottom();
		sectofourth();
		sectofourth();
		sectofourth();
		blank();
		blank();
		addressline(a);
		addressline(b);
		addressline(c);
		blank();
		blank();
		firstnbottom();

		writer.close();
	}
    

	catch(Exception Ex)
	{
		System.out.println("Exception : " + Ex.toString());
	}


}


		public static void firstnbottom()
		{
			writer.write("+");
			for(int i=0;i<LEN;i++)
				{
				writer.write("-");
				}
			writer.write("+");
		}
		public static void sectofourth()
		{
			writer.write("|");
			for(int i=0;i<LEN-5;i++)
				{
				writer.write(" ");
				}
			writer.write("#### |");
		}
		public static void addressline(String x)
		{
			writer.write("|");
			for(int i=0;i<START;i++)
				{
				writer.write(" ");
				}
			writer.write(x);
			for(int j=0;j<LEN-START-x.length();j++)
				{
				writer.write(" ");
				}
			writer.write("|");
		}
			
		
		public static void blank()
		{
			writer.write("|");
			for(int i=0;i<LEN;i++)
				{
				writer.write(" ");
				}
			writer.write("|");
		}
		
				
}






public class baTest 
{
	public static void main(String [] args)
	{
		// make a default BetterArray
		BetterArray testArray = new BetterArray();
		
		// Use it as it was designed
		for (int i = 0; i < 10; ++i)
		{
			testArray.put(i+1, i);
		}
		for (int i = 0; i < 10; ++i)
		{
			System.out.print(testArray.get(i) + "  ");
		}
		System.out.println(" ");

		// Now go beyond current array bounds
		for (int i = 0; i < 20; ++i)
		{
			testArray.put(i+1, i);
		}
		for (int i = 0; i < 20; ++i)
		{
			System.out.print(testArray.get(i) + "  ");
		}
		System.out.println(" ");
	}
}

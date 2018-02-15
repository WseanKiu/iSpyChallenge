public class challenge1
{
	public static void main(String []args)
	{
		int ttl = 0;
		
		for(int i = 3, j = 5; i < 1000 || j + 5 < 1000; i+=3, j+=5)
		{
			ttl+=i;
			ttl+=j;
		}
		
		System.out.println(ttl);
	}
}
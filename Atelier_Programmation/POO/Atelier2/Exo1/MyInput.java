import java.util.Scanner;

public class MyInput
{
	public static String askString(String phrase)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print(phrase);  
		String str= sc.nextLine();
		return str;
	}
	public static int askInt(String phrase)
	{
		int val = 0;
		boolean notfound = true;
		while(notfound)
		{
			try
			{
				System.out.print("\n"+phrase);
				Scanner input = new Scanner(System.in);
				val = (int) input.nextInt();
				notfound = false;
			}
			catch(Exception e)
			{
				
			}
		}
		return val;
	}
}

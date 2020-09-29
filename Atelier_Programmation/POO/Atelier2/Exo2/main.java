
public class main
{
	public static void main(String[] args)
	{
		Entier entier1 = new Entier(0,30);
		Entier entier2 = new Entier(5,0,30);
		Entier entier3 = new Entier(-5,0,30);
		Entier entier4 = new Entier(30,0,30);
		EntierFou entier5 = new EntierFou(-5,0,3);
		EntierFou entier6 = new EntierFou(30,0,15);
		System.out.println(entier1.toString());
		System.out.println(entier2.toString());
		System.out.println(entier3.toString());
		System.out.println(entier4.toString());
		System.out.print("\nTest des égalités:\n");
		System.out.println(entier4.toString()+" est il égal à : "+entier3.toString() +" ? : "+ entier4.equals(entier3));
		System.out.println(entier4.toString()+" est il égal à : "+entier4.toString() +" ? : "+ entier4.equals(entier4)+"\n");
		for(int i=0;i<25;i++)
		{
			entier6.tryIncrement();
			System.out.println(entier6.toString());
		}
	}
}

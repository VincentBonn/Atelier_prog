import java.util.ArrayList;
import java.util.Scanner;

public class main {
	private static int choice = 0;
	private static ArrayList<Object> mylist;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		De lebode1 = new De();
		De lebode2 = new De(3);
		De lebode3 = new De(120);
		De_Pipe lebode4 = new De_Pipe(30,"Poulet curry",25);
		De_Face_Autre lebode6;
		System.out.print("Description du dé 1:\n"+lebode1.toString()+"\n\n");
		System.out.print("Description du dé 2:\n"+lebode2.toString()+"\n\n");
		System.out.print("Description du dé 3:\n"+lebode3.toString()+"\n\n");
		System.out.print("Description du dé 4:\n"+lebode4.toString()+"\n\n");
		System.out.print("Lancement du dé 4:\n");
		for (int i=0 ; i<10 ; i++)
		{
			System.out.print("Lancer N°"+i+" : "+lebode4.lancer()+"\n");
		}
		while (choice<=2)
		{
			choice = MyInput.askInt("Indiquez combien de faces vous voulez sur le dé aux faces autres (valeur entière supérieure à 2) ");
		}
		if(choice > 2)
		{
			mylist = new ArrayList<Object>();
			for (int i=0 ; i<choice ; i++)
			{
				mylist.add(MyInput.askString("Donnez la valeur sur la face N°"+(i+1)+" : "));
			}
			lebode6 = new De_Face_Autre(null, mylist);
			System.out.print("\n10 tirages aléatoires du dé :\n");
			for (int i=0 ; i<10 ; i++)
			{
				System.out.print("N°"+(i+1)+" : "+lebode6.lancer()+"\n");
			}
		}
	}

}

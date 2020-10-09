package main_package;

import geometrie_abstract.*;

import java.util.ArrayList;

import geometrie2D.*;
import geometrie3D.*;

public class main {

	public static void main(String[] args)
	{
		ArrayList<Geometrie> mylist = new ArrayList<Geometrie>();
		mylist.add(new Ellipse(20,20));
		mylist.add(new Rectangle(20,20));
		mylist.add(new Cercle(4));
		mylist.add(new Sphere(4));
		mylist.add(new Cylindre(4,2));
		mylist.add(new Cylindre(7,2));
		mylist.add(new Sphere(7));
		mylist.add(new Cylindre(2,2));
		
		for(int i=0;i<mylist.size();i++)
		{
			System.out.print("\n"+ mylist.get(i).toString());
		}
		
		System.out.print("\n\n############## Test des surfaces sur les éléments ######\n");
		for(int i=0;i<mylist.size()-1;i+=2)
		{
			System.out.print("\n"+
					mylist.get(i).identifiant+
					" Plus grande surface que "+
					mylist.get(i+1).identifiant+
					" ? résultat :  "+
					Geometrie.plusGrandeSurfaceQue(mylist.get(i), mylist.get(i+1)));
		}
		System.out.print("\n\n############## Test des volumes sur les éléments ######\n");
		for(int i=0;i<mylist.size()-1;i+=2)
		{
			System.out.print("\n"+
					mylist.get(i).identifiant+
					" Plus grand volume que "+
					mylist.get(i+1).identifiant+
					" ? résultat :  "+
					Geometrie.plusGrandVolumeQue(mylist.get(i), mylist.get(i+1)));
		}

	}

}

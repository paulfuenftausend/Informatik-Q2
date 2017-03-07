import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GoldbachscheVermutung {

	public static ArrayList<Integer> primZahlen = new ArrayList<Integer>(); 
	public static int eingabe1 =Integer.parseInt(JOptionPane.showInputDialog("Deine Eingabe"))+4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long Time = System.nanoTime();
		primzahlen();
		berechnung();
		System.out.println("Time: " + (System.nanoTime() - Time)/(1000*1000*1000.0)+ "s");
	}
	
	public static void primzahlen()
	{
		 Primzahlsieb primzahlen = new Primzahlsieb(eingabe1);
		 primzahlen.primzahlenBerechnen();
			
		for(int i = 0; i <= eingabe1; i++)
		{
			if(primzahlen.sieb[i] == true)
			{
				primZahlen.add(i);
			}
		}
		System.out.println(primZahlen);
		System.out.println(primZahlen.size());
	}
	public static void  berechnung()
	{
		int eingabe2 = eingabe1-4;
		int i = 0;
		boolean gefunden = false;
		while(primZahlen.get(i) < eingabe2 && gefunden == false)
		{
			int j = 0;
			while(primZahlen.get(j) < primZahlen.size() && primZahlen.get(i)+primZahlen.get(j) <= eingabe2)
			{
				if(primZahlen.get(j)+primZahlen.get(i)==eingabe2)
				{
					System.out.println(primZahlen.get(i)); 
					System.out.println(primZahlen.get(j));
					gefunden = true;
				}
				j++;
			}
			i++;
		}
	}
}

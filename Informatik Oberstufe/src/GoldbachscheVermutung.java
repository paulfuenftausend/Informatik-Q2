import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GoldbachscheVermutung {

	public static ArrayList<Integer> primZahlen = new ArrayList<Integer>(); 
	public static int eingabe1 = /*Integer.parseInt(JOptionPane.showInputDialog("Deine Eingabe"))*/ 1000000;
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
		//primZahlen.add(primZahlen.size()-1);
	}
	public static void  berechnung()
	{
		int eingabe2 = eingabe1;
		boolean gefunden2 = false;
		for(int k = 4; k <= eingabe2 && !gefunden2;k=k+2)
		{
			int i = 0;
			
			while(primZahlen.get(i) < k && !gefunden2)
			{
				int primzahl1 = primZahlen.get(i);
				int j = 0;
				boolean gefunden = false;
				//System.out.println("signal");
				while(!gefunden && j < primZahlen.size()-1 )
				{
					if((primzahl1 + primZahlen.get(j))==k)
						{
							/*System.out.println(primZahlen.get(i)); 
							System.out.println(primZahlen.get(j));
							System.out.println("K ist " + k);*/
							gefunden=true;
						}
					if(k == eingabe2)
						{
							/*System.out.println(primZahlen.get(i)); 
							System.out.println(primZahlen.get(j));*/
							System.out.println("Ende bei " + eingabe2);
							gefunden2 = true;
							gefunden = true;
						}
					j++;
				}
				i++;
			}
		}
		
	}
}

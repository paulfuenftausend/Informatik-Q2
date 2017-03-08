import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GoldbachscheVermutung {

	public static ArrayList<Integer> primZahlen = new ArrayList<Integer>(); 
	public static int eingabe1 = /*Integer.parseInt(JOptionPane.showInputDialog("Deine Eingabe"))*/ 15000+4;
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
		int eingabe2 = eingabe1-4;
		boolean gefunden = false;
		for(int k = 0; k <= eingabe2;)
		{
			int i = 0;
			while(primZahlen.get(i) < k && !gefunden)
			{
				int j = 0;
				while(primZahlen.get(j) < primZahlen.size() && primZahlen.get(i)+primZahlen.get(j) <= k)
				{
					if(primZahlen.get(i)+primZahlen.get(j)==k)
					{
						/*System.out.println(primZahlen.get(i)); 
						System.out.println(primZahlen.get(j));
						System.out.println(k);*/					
						if(primZahlen.get(j)+primZahlen.get(i)==eingabe2)
						{
							/*System.out.println(primZahlen.get(i)); 
							System.out.println(primZahlen.get(j));
							System.out.println("Ende bei " + eingabe2);*/
							gefunden = true;
						}
					}	
					j++;
				}
				i++;
			}
			k=k+2;
		}
	}
}

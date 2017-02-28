import java.util.ArrayList;

public class GoldbachscheVermutung {

	public static ArrayList<Integer> primZahlen = new ArrayList<Integer>(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primzahlen();
	}
	
	public static void primzahlen()
	{
		 Primzahlsieb primzahlen = new Primzahlsieb(100);
		 primzahlen.primzahlenBerechnen();
			
		for(int i = 0; i <= 100; i++)
		{
			if(primzahlen.sieb[i] == true)
			{
				primZahlen.add(i);
			}
		}
		System.out.println(primZahlen); 
	}
}

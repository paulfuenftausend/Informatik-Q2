import java.util.ArrayList;
//jaja

import javax.swing.JOptionPane;

public class Zusatzaufgaben {
	public static ArrayList<Character> nummerChar = new ArrayList<Character>();
	public static ArrayList<String> passwortSatz = new ArrayList<String>();
	public static ArrayList<Character> passwortWort = new ArrayList<Character>();
	public static ArrayList<Character> ersterStringChar = new ArrayList<Character>();
	public static ArrayList<Character> zweiterStringChar = new ArrayList<Character>();
	public static ArrayList<Integer> monatsTage = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pruefnummer();
		//passwortAusSatz("Hallo ich bin paul, und wer bist du ?");
		//anagramTest();
		//einMalEins();
		Datum();
		//note();
		
	}
	public static void pruefnummer()
	{
		int a = 1;
		String nummerString = "Z15570000006";
			{
				for (char c : nummerString.toCharArray()) 
				{
					nummerChar.add(c);
				}
			}
		int bZahl = Character.getNumericValue(nummerChar.get(0)) - 9;
		int bZahl2 = bZahl%10 + bZahl/10;
		int quersumme = bZahl2;
		while (a < nummerChar.size()-1)
		{
			quersumme = quersumme + nummerChar.get(a) - 48;
			a++;

		}
		quersumme = quersumme%9;
		int pruefziffer = 8-quersumme;
		System.out.println(pruefziffer);
		if (pruefziffer == nummerChar.get(nummerChar.size()-1)-48)
		{
			System.out.println("Die Pruefziffer stimmt!");
		}
	}
	public static void passwortAusSatz(String string)
	{
		int leerzeichenZahl = 0;
		char leerzeichen = ' ';
		ArrayList<String> passwortSatz = new ArrayList<String>();
		for (int i = 0; i < string.length();i++)
		{
			if (string.charAt(i) == leerzeichen)
			{
				leerzeichenZahl++;
			}
		}
		String[] parts = string.split(" ");
		for (int i = 0;i <= leerzeichenZahl;i++)
		{
			passwortSatz.add(parts[i]);
		}	
		for (int i = 0; i < passwortSatz.size()-1;i++)
		{
			String passwortString = passwortSatz.get(i);
			for (char c : passwortString.toCharArray()) 
			{
				passwortWort.add(c);
			}
			System.out.print(passwortWort.get(passwortWort.size()-1));
		}	
	}
	public static void anagramTest()
	{
		String ersterString = (String)JOptionPane.showInputDialog("Gib den ersten Satz an.");
		String ersterStringklein = ersterString.toLowerCase();	
			for (char c : ersterStringklein.toCharArray())
			{
				ersterStringChar.add(c);
			}
		String zweiterString = (String)JOptionPane.showInputDialog("Gib den zweiten Satz an.");
		String zweiterStringklein = zweiterString.toLowerCase();	
			for (char c : zweiterStringklein.toCharArray())
			{
				zweiterStringChar.add(c);
			}
		for (int a=0; a < zweiterStringChar.size()-1;a++ )
			{
				if (32 == zweiterStringChar.get(a))
				{
					zweiterStringChar.remove(a);
				}
			}
		for (int a=0; a < ersterStringChar.size()-1;a++ )
			{
				if (32 == ersterStringChar.get(a))
				{
					ersterStringChar.remove(a);
				}
			}
		if (ersterStringChar.size() == zweiterStringChar.size())
			{
			if (ersterStringChar.size() >= 7)
			{
				for (int i = 0; i < ersterStringChar.size()-1;i++)
				{
					for (int j = 0; j < zweiterStringChar.size();j++)
					{
						if (ersterStringChar.get(0) == zweiterStringChar.get(j))
						{
							ersterStringChar.remove(0);
							zweiterStringChar.remove(j);
							i--;
						}
					}				
				}
			}
			System.out.println(zweiterStringChar);
			if (ersterStringChar.size() < 7)
			{
				/*for (int i = 0; i < ersterStringChar.size()-1;i++)
				{
					for (int j = 0; j < zweiterStringChar.size()-1;j++)
					{
						if (ersterStringChar.get(0) == zweiterStringChar.get(j))
						{
							ersterStringChar.remove(0);
							zweiterStringChar.remove(j);
							i--;
							
						}
					}				
				}*/
				JOptionPane.showMessageDialog(null, "Streng dein Gehirn an das sind nicht mal 7 Buchstaben.");
			}
		}else{
				JOptionPane.showMessageDialog(null, "Die Eingaben sind keine Anagrame!");
			}
		System.out.println(ersterStringChar);
		if (ersterStringChar.size() == 0)
		{
			JOptionPane.showMessageDialog(null,"Die Eingaben sind Anagrame");
		}else{
			JOptionPane.showMessageDialog(null, "Die Eingaben sind keine Anagrame");
		}
	}
	public static void einMalEins()
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++)
			{
				System.out.print(i*j+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void Datum()
	{
		int tag = 23;
		int monat = 5;
		int monatAlsTage = 0;
		int jahr = 1949;
		monatsTage.add(31); //Monate Januar-Dezember
		monatsTage.add(28);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		monatsTage.add(30);
		monatsTage.add(31);
		int jahrAlsTage = (jahr-1)*365;
		for (int i = 0; i < monat-1;i++) //monate als tage ausrechnen
		{
			monatAlsTage = monatAlsTage + monatsTage.get(i);
			System.out.println(monatAlsTage);
		}
		int j = 0;
		while (jahr%4 != 0) //das nächst niedrige schaltjahr finden
		{
			System.out.println(jahr);
			jahr = jahr-1;	
			j++;
		}
		System.out.println(jahr + " jahr "+ j);
		
		int schaltJahre = jahr/4 -  (int) Math.round((jahr/100)-0.5) + (int) Math.round(jahr/400-0.5);
		System.out.println(schaltJahre);
		if (j == 0 && monat <= 2)
		{
			schaltJahre--;
		}
		if (tag == 29 && monat == 2)
		{
			schaltJahre++;
		}
		System.out.println(schaltJahre);
		int tageInsgesamt = tag + jahrAlsTage + monatAlsTage + schaltJahre;
		System.out.println(tageInsgesamt%7);
	}
	
	
	public static void note()
	{
		float bewertungsEinheiten = Integer.parseInt(JOptionPane.showInputDialog("Deine BE hier:"));
		double prozent = bewertungsEinheiten / 120 * 100;
		System.out.println(prozent);
		if (prozent >= 45)
		{
			for (int i=0; i < 50;i = i+5)
			{
				if (prozent >= 100-i)
				{
					System.out.println("Du hast "+ (16-i/5) +" Punkte.");
					i = 50;
				}
			}
		}else{
			for (int i=0; i < 90;i = i+9)
			{
				if (prozent >= 54-i)
				{
					System.out.println("Du hast "+ (6-i/9) +" Punkte.");
					i = 90;
				}
			}
		}
	}
}
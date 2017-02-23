import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Passwordchecker2 
{
		public static boolean zeichen = false;
		public static boolean länge = false;
		public static boolean kleinbuchstabe = false;
		public static boolean großbuchstabe = false;
		public static boolean zahl = false;
		public static ArrayList<Character> passwordChar = new ArrayList<Character>();
		
		public static void main(String[] args) 
		{
			stringtochar();
			passwordCheck();
		}
		public static void stringtochar()
		{
					
			String passwordString = (String)JOptionPane.showInputDialog(
					"Bitte ein Passwort eingeben.");
				{
					for (char c : passwordString.toCharArray()) 
					{
						passwordChar.add(c);
					}
				}
			
		}
		public static void passwordCheck()
		{
			boolean passwordsicher = false;
			int zählen1 = 0;
			int zählen2 = 0;
			int zählen3 = 0;
			int zählen4 = 0;	
			while (passwordsicher == false)	{
			if (passwordChar.size() >= 8)
			{
				länge = true;
			}
			while (zählen1 < passwordChar.size())
			{
				if (Character.isLowerCase(passwordChar.get(zählen1)) == true)
				{
					kleinbuchstabe = true;
				}
				zählen1++;
			}
			while (zählen2 < passwordChar.size())
			{
				if (Character.isUpperCase(passwordChar.get(zählen2)) == true)
				{
					großbuchstabe = true;
				}
				zählen2++;
			}
			while (zählen3 < passwordChar.size())
			{
				if (Character.isLetterOrDigit(passwordChar.get(zählen3)) == false)
				{
					zeichen = true;
				}
				zählen3++;
			}
			while (zählen4 < passwordChar.size()) 
			{
				if (Character.isDigit(passwordChar.get(zählen4)) == true)
				{
					zahl = true;
				}
				zählen4++;
			}	
			if (zeichen == true)
				{
				if (kleinbuchstabe == true)
					{
					if (großbuchstabe == true)
						{
						if (zahl == true)
							{
							if (länge == true)
								{
									JOptionPane.showMessageDialog(null, "Das Passwort ist sicher!");
									passwordsicher = true;
							}else{
									JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es ist zu kurz.");
									stringtochar();
								}
						 }else{
								JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es fehlt eine Zahl.");
								stringtochar();
							}
					 }else{
							JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es fehlt ein großer Buchstabe.");
							stringtochar();
						}
				 }else{
						JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es fehlt ein kleiner Buchstabe.");
						stringtochar();
					}
			 }else{
					JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es fehlt ein Sonderzeichen.");
					stringtochar();
				}
			}	
		}
}
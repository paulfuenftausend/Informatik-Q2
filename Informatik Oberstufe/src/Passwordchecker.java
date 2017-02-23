import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Passwordchecker 
{
		public static boolean sicher = false;
		public static ArrayList<Character> passwordChar = new ArrayList<Character>();
		
		public static void main(String[] args) 
		{
			while (sicher == false)
			{
				stringtochar();
				passwordCheck();
			}
		}
		public static void stringtochar()
		{		
			String passwordString = (String)JOptionPane.showInputDialog(
					"Bitte ein Passwort eingeben. Es muss min. 8 Zeichen lang sein und \neinen Kleinbuchstaben\neinen Großbuchstaben\neine Zahl\nein Sonderzeichen enthalten.");
				{
					for (char c : passwordString.toCharArray()) 
					{
						passwordChar.add(c);
					}
				}
		}
		public static void passwordCheck()
		{
			int länge = 0;
			int zahl = 0;
			int zeichen = 0;
			int kleinbuchstabe = 0;
			int großbuchstabe = 0;
			int zählen1 = 0;
			int zählen2 = 0;
			int zählen3 = 0;
			int zählen4 = 0;
			
				if (passwordChar.size() >= 8)
				{
					länge = 1;
				}
				while (zählen1 < passwordChar.size())
				{
					if (Character.isLowerCase(passwordChar.get(zählen1)) == true)
					{
						kleinbuchstabe = 1;
					}
					zählen1++;
				}
				while (zählen2 < passwordChar.size())
				{
					if (Character.isUpperCase(passwordChar.get(zählen2)) == true)
					{
						großbuchstabe = 1;
					}
					zählen2++;
				}
				while (zählen3 < passwordChar.size())
				{
					if (Character.isLetterOrDigit(passwordChar.get(zählen3)) == false)
					{
						zeichen = 1;
					}
					zählen3++;
				}
				while (zählen4 < passwordChar.size()) 
				{
					if (Character.isDigit(passwordChar.get(zählen4)) == true)
					{
						zahl = 1;
					}
					zählen4++;
				}
				if (länge == 1){
					if (länge+kleinbuchstabe+großbuchstabe+zahl+zeichen == 5)
					{
						JOptionPane.showMessageDialog(null, "Das Passwort ist sicher.");
						sicher = true;
					}else{
						JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es fehlt" + 
								((zahl == 1) ? "" : " eine Zahl") + 
								((zeichen == 1) ? "" : " ein Zeichen") + 
								((kleinbuchstabe == 1) ? "" : " ein Kleinbuchstabe") + 
								((großbuchstabe == 1) ? "" : " ein Großbuchstabe") + ".");
						passwordChar.clear();
					}
				}else{
					JOptionPane.showMessageDialog(null, "Das Passwort ist nicht sicher, es ist zu kurz.");
					passwordChar.clear();
				}
			}
}
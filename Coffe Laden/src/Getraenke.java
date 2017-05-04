import java.util.ArrayList;

public class Getraenke {
	public static ArrayList<Double> milchPreisArray = new ArrayList<Double>();
	public static ArrayList<Double> kaffePreisArray = new ArrayList<Double>();
	public static ArrayList<Double> zuckerPreisArray = new ArrayList<Double>();
	public static double gesamtPreis = 0;
	public static double milchPreis = 0;
	public static double kaffePreis = 0;
	public static double zuckerPreis = 0;
	public static double becherPreis = 0;
	public static double extraPreis = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		milchPreisArray.add(0.0); //Vollmilch
		milchPreisArray.add(0.1); //Fettarm
		milchPreisArray.add(0.2); //Soja
		kaffePreisArray.add(1.6); //Espresso
		kaffePreisArray.add(1.2); //Schwarz
		kaffePreisArray.add(2.7); //MilchKaffe
		kaffePreisArray.add(1.8); //Kakao
		zuckerPreisArray.add(0.0); //weisser Zucker
		zuckerPreisArray.add(0.2); //brauner zucker
		zuckerPreisArray.add(0.5); //stevia
 	}
	public static void gesamtPreisBerechnen()
	{
		gesamtPreis = milchPreis+kaffePreis+zuckerPreis+becherPreis+extraPreis;
	}
	public static void milchPreisBerechnen()
	{
		
	}
	public static void kaffePreisBerechnen()
	{
		
	}
	public static void zuckerPreisBerechnen()
	{
		
	}
	public static void becherPreisBerechnen()
	{
		
	}
	public static void extraPreisBerechnen()
	{
		
	}
}

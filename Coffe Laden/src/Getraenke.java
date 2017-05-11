import java.util.ArrayList;

public class Getraenke {
	public ArrayList<Double> milchPreisArray = new ArrayList<Double>();
	public ArrayList<Double> kaffePreisArray = new ArrayList<Double>();
	public ArrayList<Double> zuckerPreisArray = new ArrayList<Double>();
	public ArrayList<Double> becherPreisArray = new ArrayList<Double>();
	public ArrayList<Double> extraPreisArray = new ArrayList<Double>();  
	
	public static int gesamtPreis = 0;
	public double milchPreis = 0;
	public double kaffePreis = 0;
	public double zuckerPreis = 0;
	public double becherPreis = 0;
	public double extraPreis = 0;
	
	public Getraenke(KaffeMask frame)
	{
		milchPreisArray.add(0.0); //Vollmilch
		milchPreisArray.add(0.1); //Fettarm
		milchPreisArray.add(0.2); //Soja
		kaffePreisArray.add(1.6); //Espresso
		kaffePreisArray.add(1.2); //Schwarz
		kaffePreisArray.add(2.7); //MilchKaffe
		kaffePreisArray.add(1.8); //Kakao
		zuckerPreisArray.add(0.0); //Weisser Zucker
		zuckerPreisArray.add(0.2); //Brauner Zucker
		zuckerPreisArray.add(0.7); //S��stoff
		zuckerPreisArray.add(0.5); //Stevia
		becherPreisArray.add(2.0); //Gro�
		becherPreisArray.add(0.7); //Mittel
		becherPreisArray.add(0.0); //Klein
 	}
	public void gesamtPreisBerechnen()
	{
		gesamtPreis = (int) (milchPreis+kaffePreis+zuckerPreis+becherPreis+extraPreis);
	}
	public void milchPreisBerechnen()
	{
		milchPreis = milchPreisArray.get(KaffeMask.milchNummer);
	}
	public void kaffePreisBerechnen()
	{
		kaffePreis = kaffePreisArray.get(KaffeMask.kaffeNummer);
	}
	public void zuckerPreisBerechnen()
	{
		zuckerPreis = zuckerPreisArray.get(KaffeMask.zuckerNummer);
	}
	public void becherPreisBerechnen()
	{
		becherPreis = becherPreisArray.get(KaffeMask.becherNummer);
	}
	public void extraPreisBerechnen()
	{
		extraPreis = 0;
	}
}

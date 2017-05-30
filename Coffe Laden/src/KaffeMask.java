import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDate;
import java.awt.event.ActionEvent;



public class KaffeMask extends JFrame {
	
	public HashMap<LocalDate,HashMap<String,Integer>> verbrauch = new HashMap<>();
	public HashMap<String,Integer> kaffeMap = new HashMap<>();
	
	public int milchNummer = 0; 
	public int becherNummer = 0;
	public int zuckerNummer = 0;
	public int kaffeNummer = 0;
	
	public ArrayList<Double> milchPreisArray = new ArrayList<Double>();
	public ArrayList<Double> kaffePreisArray = new ArrayList<Double>();
	public ArrayList<Double> zuckerPreisArray = new ArrayList<Double>();
	public ArrayList<Double> becherPreisArray = new ArrayList<Double>();
	public ArrayList<Double> extraPreisArray = new ArrayList<Double>();  
	
	public String gesamtPreis = "0";
	public double milchPreis = 0;
	public double kaffePreis = 0;
	public double zuckerPreis = 0;
	public double becherPreis = 0;
	public double extraPreis = 0;
	
	public String gesamtPreis1 = "0";
	public short milchPreis1 = 0;
	public short kaffePreis1 = 0;
	public short zuckerPreis1 = 0;
	public short becherPreis1 = 0;
	public short extraPreis1 = 0;
	
	public int extraSahne = 0;
	public int extraKakao = 0;
	public int extraGinger = 0;
	public int extraShot = 0;
	public int extraStreusel= 0;
	public int extraKaramelsauce = 0;
	public int extraSchokosauce = 0;
	public int extraMarshmellow = 0;
	
	public int milchverbrauch = 0;
	
	public ArrayList<Short> milchPreisArray1 = new ArrayList<Short>();
	public ArrayList<Short> kaffePreisArray1 = new ArrayList<Short>();
	public ArrayList<Short> zuckerPreisArray1 = new ArrayList<Short>();
	public ArrayList<Short> becherPreisArray1 = new ArrayList<Short>();
	public ArrayList<Short> extraPreisArray1 = new ArrayList<Short>();  
	
	private JPanel contentPane;
	private JCheckBox chckbxGross;
	private JCheckBox chckbxMittel;
	private JCheckBox chckbxKlein;
	private JCheckBox chckbxFettarm;
	private JCheckBox chckbxVoll;
	private JCheckBox chckbxSoja;
	private JLabel lblBecher;
	private JLabel lblMilch;
	private JCheckBox chckbxWeiss;
	private JCheckBox chckbxBraun;
	private JCheckBox chckbxSstoff;
	private JCheckBox chckbxStevia;
	private JLabel lblZucker;
	private JCheckBox chckbxSahne;
	private JCheckBox chckbxStreuel;
	private JCheckBox chckbxKakao;
	private JCheckBox chckbxShot;
	private JLabel lblExtras;
	private JCheckBox chckbxMarschmellow;
	private JCheckBox chckbxSchokosauce;
	private JCheckBox chckbxKaramelsauce;
	private JCheckBox chckbxGinger;
	private JLabel lblKaffeSorte;
	private JCheckBox chckbxMilchkaffe;
	private JCheckBox chckbxEspresso;
	private JCheckBox chckbxSchwarz;
	private JCheckBox chckbxKakao_1;
	private JButton btnBestellungAufgeben;
	private JButton btnBestellungAbbrechen;
	private JButton btnNochEinKaffe;
	private JTextField textField;
	private JCheckBox chckbxMilchshake;
	private JCheckBox chckbxKeineMilch;
	private JTextField textFieldName;
	private JLabel lblName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KaffeMask frame = new KaffeMask();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void arraysFuellen()
	{
		milchPreisArray.add(0.0); //Vollmilch oder Keine Milch
		milchPreisArray.add(0.1); //Fettarm
		milchPreisArray.add(0.2); //Soja
		kaffePreisArray.add(1.6); //Espresso
		kaffePreisArray.add( 1.2); //Schwarz
		kaffePreisArray.add(2.7); //MilchKaffe
		kaffePreisArray.add(1.8); //Kakao
		kaffePreisArray.add(2.4); // Milchshake
		zuckerPreisArray.add(0.0); //Weisser Zucker
		zuckerPreisArray.add(0.2); //Brauner Zucker
		zuckerPreisArray.add( 0.7); //Süßstoff
		zuckerPreisArray.add( 0.5); //Stevia
		becherPreisArray.add(0.0); //Klein
		becherPreisArray.add(0.7); //Mittel
		becherPreisArray.add(2.0); //Gross
	}
	
	public void preise()
	{
		if(milchPreisArray.size() == 0)
		{
		arraysFuellen();
		}
		milchPreisBerechnen1();
		kaffePreisBerechnen1();
		zuckerPreisBerechnen1();
		becherPreisBerechnen1();
		extraPreisBerechnen1();
		gesamtPreisBerechnen1();
		
	}
	public void gesamtPreisBerechnen1()
	{
		gesamtPreis = ""+(milchPreis+kaffePreis+zuckerPreis+becherPreis+extraPreis)+"0€"+" für "+ textFieldName.getText();
	}
	public void milchPreisBerechnen1()
	{
		milchPreis = milchPreisArray.get(milchNummer);
	}
	public void kaffePreisBerechnen1()
	{
		kaffePreis = kaffePreisArray.get(kaffeNummer);
	}
	public void zuckerPreisBerechnen1()
	{
		zuckerPreis = zuckerPreisArray.get(zuckerNummer);
	}
	public void becherPreisBerechnen1()
	{
		becherPreis = becherPreisArray.get(becherNummer);
	}
	public void extraPreisBerechnen1()
	{
		extraPreis = 0.5*(extraSahne+extraKakao+extraSchokosauce+extraKaramelsauce+extraShot+extraStreusel+extraGinger+extraMarshmellow);
	}
	public void preis()
	{
		if(milchPreisArray.size() == 0)
		{
			arraysFuellen();
		}
		milchPreisBerechnen1();
		kaffePreisBerechnen1();
		zuckerPreisBerechnen1();
		becherPreisBerechnen1();
		extraPreisBerechnen1();
		gesamtPreisBerechnen1();
		
	}
	public void gesamtPreisBerechnen()
	{
		gesamtPreis = Double.toString((milchPreis+kaffePreis+zuckerPreis+becherPreis+extraPreis));
	}
	public void milchPreisBerechnen()
	{
		milchPreis = milchPreisArray.get(milchNummer);
	}
	public void kaffePreisBerechnen()
	{
		kaffePreis = kaffePreisArray.get(kaffeNummer);
	}
	public void zuckerPreisBerechnen()
	{
		zuckerPreis = zuckerPreisArray.get(zuckerNummer);
	}
	public void becherPreisBerechnen()
	{
		becherPreis = becherPreisArray.get(becherNummer);
	}
	public void extraPreisBerechnen()
	{
		extraPreis = 0;
	}
	
	/**
	 * Create the frame.
	 */
	
	
	
	public KaffeMask() {
		setResizable(false);
		setForeground(Color.WHITE);
		setTitle("StarBacks");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][][grow]", "[][][][][][][][][][][][][][][][]"));
		
		lblBecher = new JLabel("Becher:");
		contentPane.add(lblBecher, "cell 0 0");
		chckbxGross = new JCheckBox("Gro\u00DF");
		chckbxGross.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherNummer = 2;
				preise();
				preis();
				textField.setText(gesamtPreis);
			}
		});
		/*chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				
			}
		});
		*/
		
		lblName = new JLabel("Name:");
		contentPane.add(lblName, "cell 3 0,alignx trailing");
		
		textFieldName = new JTextField();
		contentPane.add(textFieldName, "cell 4 0,growx");
		textFieldName.setColumns(10);
		contentPane.add(chckbxGross, "cell 1 1");
		
		chckbxMittel = new JCheckBox("Mittel");
		chckbxMittel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherNummer = 1;
				preise();
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxMittel, "cell 2 1");
		
		chckbxKlein = new JCheckBox("Klein");
		chckbxKlein.setSelected(true);
		chckbxKlein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherNummer = 0;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxKlein, "cell 3 1");
		
		lblMilch = new JLabel("Milch:");
		contentPane.add(lblMilch, "cell 0 2");
		
		chckbxFettarm = new JCheckBox("Fettarm");
		chckbxFettarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchNummer = 1;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxFettarm, "cell 1 3");
		
		chckbxVoll = new JCheckBox("Voll");
		chckbxVoll.setSelected(true);
		chckbxVoll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchNummer = 0;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxVoll, "cell 2 3");
		
		chckbxSoja = new JCheckBox("Soja");
		chckbxSoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				milchNummer = 2;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxSoja, "cell 3 3");
		
		chckbxKeineMilch = new JCheckBox("Keine Milch");
		chckbxKeineMilch.setSelected(true);
		chckbxKeineMilch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				milchNummer = 0;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxKeineMilch, "cell 4 3");
		
		lblZucker = new JLabel("Zucker:");
		contentPane.add(lblZucker, "cell 0 4");
		
		chckbxWeiss = new JCheckBox("Weiss");
		chckbxWeiss.setSelected(true);
		chckbxWeiss.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerNummer = 0;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxWeiss, "cell 1 5");
		
		chckbxBraun = new JCheckBox("Braun ");
		chckbxBraun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerNummer = 1;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxBraun, "cell 2 5");
		
		chckbxSstoff = new JCheckBox("S\u00FC\u00DFstoff");
		chckbxSstoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerNummer = 2;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxSstoff, "cell 3 5");
		
		chckbxStevia = new JCheckBox("Stevia");
		chckbxStevia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				zuckerNummer = 3;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxStevia, "cell 4 5");
		
		lblExtras = new JLabel("Extras:");
		contentPane.add(lblExtras, "cell 0 6");
		
		chckbxSahne = new JCheckBox("Sahne");
		chckbxSahne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			if (chckbxSahne.isEnabled() == true)
				{
					extraSahne = 1;
				}
			else
				{
					extraSahne = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxSahne, "cell 1 7");
		
		chckbxStreuel = new JCheckBox("Streu\u00DFel");
		chckbxStreuel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxStreuel.isSelected() == true)
				{
					extraStreusel = 1;
				}
			else
				{
					extraStreusel = 0;
				}
			preis();
			textField.setText(gesamtPreis);	
			}
		});
		contentPane.add(chckbxStreuel, "cell 2 7");
		
		chckbxKakao = new JCheckBox("Kakao");
		chckbxKakao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxKakao.isSelected() == true)
				{
					extraKakao = 1;
				}
			else
				{
					extraKakao = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxKakao, "cell 3 7");
		
		chckbxShot = new JCheckBox("Shot");
		chckbxShot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxShot.isSelected() == true)
				{
					extraShot = 1;
				}
			else
				{
					extraShot = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxShot, "cell 4 7");
		
		chckbxMarschmellow = new JCheckBox("Marschmellow");
		chckbxMarschmellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (chckbxMarschmellow.isSelected() == true)
				{
					extraMarshmellow = 1;
				}
			else
				{
					extraMarshmellow = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxMarschmellow, "cell 1 8");
		
		chckbxSchokosauce = new JCheckBox("Schokosauce");
		chckbxSchokosauce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (chckbxSchokosauce.isSelected() == true)
				{
					extraSchokosauce = 1;
				}
			else
				{
					extraSchokosauce = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxSchokosauce, "cell 2 8");
		
		chckbxKaramelsauce = new JCheckBox("Karamelsauce");
		chckbxKaramelsauce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxKaramelsauce.isSelected() == true)
				{
					extraKaramelsauce = 1;
				}
			else
				{
					extraKaramelsauce = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxKaramelsauce, "cell 3 8");
		
		chckbxGinger = new JCheckBox("Ginger");
		chckbxGinger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if (chckbxGinger.isSelected() == true)
				{
					extraGinger = 1;
				}
			else
				{
					extraGinger = 0;
				}
			preis();
			textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxGinger, "cell 4 8");
		
		lblKaffeSorte = new JLabel("Kaffe Sorte:");
		contentPane.add(lblKaffeSorte, "cell 0 9");
		
		chckbxMilchkaffe = new JCheckBox("Milchkaffe"); //2
		chckbxMilchkaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeNummer = 2;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxMilchkaffe, "cell 1 10");
		
		chckbxEspresso = new JCheckBox("Espresso"); //0
		chckbxEspresso.setSelected(true);
		chckbxEspresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeNummer = 0;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxEspresso, "cell 2 10");
		
		chckbxSchwarz = new JCheckBox("Schwarz"); //1
		chckbxSchwarz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeNummer = 1;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxSchwarz, "cell 3 10");
		
		chckbxKakao_1 = new JCheckBox("Kakao"); //3
		chckbxKakao_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeNummer = 3;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxKakao_1, "cell 4 10");
		
		chckbxMilchshake = new JCheckBox("Milchshake");
		chckbxMilchshake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeNummer = 4;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxMilchshake, "cell 1 11");
		
	
		//ButtonGroup nur 1 feld kann gewaehlt werden
		ButtonGroup becher = new ButtonGroup();
		becher.add(chckbxGross);
		becher.add(chckbxMittel);
		becher.add(chckbxKlein);
		
		ButtonGroup milch = new ButtonGroup();
		milch.add(chckbxFettarm);
		milch.add(chckbxVoll);
		milch.add(chckbxSoja);
		milch.add(chckbxEspresso);
		milch.add(chckbxKeineMilch);
		
		ButtonGroup zucker = new ButtonGroup();
		zucker.add(chckbxWeiss);
		zucker.add(chckbxBraun);
		zucker.add(chckbxSstoff);
		zucker.add(chckbxStevia);
		
		ButtonGroup kaffe = new ButtonGroup();
		kaffe.add(chckbxKakao_1);
		kaffe.add(chckbxSchwarz);
		kaffe.add(chckbxMilchkaffe);
		kaffe.add(chckbxEspresso);
		kaffe.add(chckbxMilchshake);
		
		btnBestellungAufgeben = new JButton("Bestellung aufgeben");
		btnBestellungAufgeben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Getraenke getraenk = new Getraenke(gesamtPreis, milchNummer, kaffeNummer, zuckerNummer, becherNummer);
				preis();
				textField.setText(gesamtPreis);;
				System.out.println(getraenk);
				if (chckbxMilchkaffe.isSelected() || chckbxKakao_1.isSelected() || chckbxMilchshake.isSelected())
				{
					milchverbrauch ++;
				}
				kaffeMap.put("Milch", 450*milchverbrauch);
				verbrauch.put(LocalDate.now(), kaffeMap);
				System.out.println(verbrauch.get(LocalDate.now()));
				System.exit(0);
			}
		});
		
		contentPane.add(btnBestellungAufgeben, "cell 0 13,grow");
		
		textField = new JTextField("1,20€ für "+ textFieldName.getText());
		contentPane.add(textField, "cell 1 13 2 3,grow");
		textField.setColumns(10);
		
		btnBestellungAbbrechen = new JButton("Bestellung abbrechen");
		btnBestellungAbbrechen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnBestellungAbbrechen, "cell 0 14");
		
		btnNochEinKaffe = new JButton("Noch ein Kaffe");
		btnNochEinKaffe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				main(null);
				System.exit(0);
			}
		});
		contentPane.add(btnNochEinKaffe, "cell 0 15,grow");
		
		
		
		
	}

}

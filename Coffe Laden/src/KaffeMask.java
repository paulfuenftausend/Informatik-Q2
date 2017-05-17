import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

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
import java.awt.event.ActionEvent;



public class KaffeMask extends JFrame {

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
	
	private JPanel contentPane;
	private JCheckBox chckbxNewCheckBox;
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
		milchPreisArray.add(0.0); //Vollmilch
		milchPreisArray.add(0.1); //Fettarm
		milchPreisArray.add(0.2); //Soja
		kaffePreisArray.add(1.6); //Espresso
		kaffePreisArray.add(1.2); //Schwarz
		kaffePreisArray.add(2.7); //MilchKaffe
		kaffePreisArray.add(1.8); //Kakao
		kaffePreisArray.add(2.4); //Milchshake
		zuckerPreisArray.add(0.0); //Weisser Zucker
		zuckerPreisArray.add(0.2); //Brauner Zucker
		zuckerPreisArray.add(0.7); //S��stoff
		zuckerPreisArray.add(0.5); //Stevia
		becherPreisArray.add(2.0); //Gro�
		becherPreisArray.add(0.7); //Mittel
		becherPreisArray.add(0.0); //Klein
	}
	
	public void preis()
	{
		if(milchPreisArray.size() == 0)
		{
			arraysFuellen();
		}
		milchPreisBerechnen();
		kaffePreisBerechnen();
		zuckerPreisBerechnen();
		becherPreisBerechnen();
		extraPreisBerechnen();
		gesamtPreisBerechnen();
		//System.out.println("Jup");
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
		contentPane.setLayout(new MigLayout("", "[][grow][grow][][]", "[][][][][][][][][][][][][][][][]"));
		
		lblBecher = new JLabel("Becher:");
		contentPane.add(lblBecher, "cell 0 0");
		
		chckbxNewCheckBox = new JCheckBox("Gro\u00DF");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherNummer = 0;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxNewCheckBox, "cell 1 1");
		
		chckbxMittel = new JCheckBox("Mittel");
		chckbxMittel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherNummer = 1;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxMittel, "cell 2 1");
		
		chckbxKlein = new JCheckBox("Klein");
		chckbxKlein.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				becherNummer = 2;
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
		
		lblZucker = new JLabel("Zucker:");
		contentPane.add(lblZucker, "cell 0 4");
		
		chckbxWeiss = new JCheckBox("Weiss");
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
		contentPane.add(chckbxSahne, "cell 1 7");
		
		chckbxStreuel = new JCheckBox("Streu\u00DFel");
		contentPane.add(chckbxStreuel, "cell 2 7");
		
		chckbxKakao = new JCheckBox("Kakao");
		contentPane.add(chckbxKakao, "cell 3 7");
		
		chckbxShot = new JCheckBox("Shot");
		contentPane.add(chckbxShot, "cell 4 7");
		
		chckbxMarschmellow = new JCheckBox("Marschmellow");
		contentPane.add(chckbxMarschmellow, "cell 1 8");
		
		chckbxSchokosauce = new JCheckBox("Schokosauce");
		contentPane.add(chckbxSchokosauce, "cell 2 8");
		
		chckbxKaramelsauce = new JCheckBox("Karamelsauce");
		contentPane.add(chckbxKaramelsauce, "cell 3 8");
		
		chckbxGinger = new JCheckBox("Ginger");
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
		
	
		//ButtonGroup nur 1 feld kann gewaehlt werden
		ButtonGroup becher = new ButtonGroup();
		becher.add(chckbxNewCheckBox);
		becher.add(chckbxMittel);
		becher.add(chckbxKlein);
		
		ButtonGroup milch = new ButtonGroup();
		milch.add(chckbxFettarm);
		milch.add(chckbxVoll);
		milch.add(chckbxSoja);
		milch.add(chckbxEspresso);
		
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
		
		btnBestellungAufgeben = new JButton("Bestellung aufgeben");
		btnBestellungAufgeben.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Getraenke getraenk = new Getraenke();
				preis();
				textField.setText(gesamtPreis);;
			}
		});
		
		chckbxMilchshake = new JCheckBox("Milchshake");
		chckbxMilchshake.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kaffeNummer = 4;
				preis();
				textField.setText(gesamtPreis);
			}
		});
		contentPane.add(chckbxMilchshake, "cell 1 11");
		contentPane.add(btnBestellungAufgeben, "cell 0 13,grow");
		
		textField = new JTextField(gesamtPreis);
		contentPane.add(textField, "cell 1 13 2 3,grow");
		textField.setColumns(10);
		
		btnBestellungAbbrechen = new JButton("Bestellung abbrechen");
		contentPane.add(btnBestellungAbbrechen, "cell 0 14");
		
		btnNochEinKaffe = new JButton("Noch ein Kaffe");
		contentPane.add(btnNochEinKaffe, "cell 0 15,grow");
		
		
		
		
	}

}

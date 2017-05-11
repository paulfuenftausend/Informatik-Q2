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



public class KaffeMask extends JFrame {

	public static int milchNummer = 0; 
	public static int becherNummer = 0;
	public static int zuckerNummer = 0;
	public static int kaffeNummer = 0;
	
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

	/**
	 * Create the frame.
	 */
	
	
	
	public KaffeMask() {
		setResizable(false);
		setForeground(Color.WHITE);
		setTitle("Kaffe Bestellen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][grow][grow][][]", "[][][][][][][][][][][][][][][][]"));
		
		lblBecher = new JLabel("Becher:");
		contentPane.add(lblBecher, "cell 0 0");
		
		chckbxNewCheckBox = new JCheckBox("Gro\u00DF");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				becherNummer = 0;
			}
		});
		contentPane.add(chckbxNewCheckBox, "cell 1 1");
		
		chckbxMittel = new JCheckBox("Mittel");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				becherNummer = 1;
			}
		});
		contentPane.add(chckbxMittel, "cell 2 1");
		
		chckbxKlein = new JCheckBox("Klein");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				becherNummer = 2;
			}
		});
		contentPane.add(chckbxKlein, "cell 3 1");
		
		lblMilch = new JLabel("Milch:");
		contentPane.add(lblMilch, "cell 0 2");
		
		chckbxFettarm = new JCheckBox("Fettarm");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				milchNummer = 1;
			}
		});
		contentPane.add(chckbxFettarm, "cell 1 3");
		
		chckbxVoll = new JCheckBox("Voll");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				milchNummer = 0;
			}
		});
		contentPane.add(chckbxVoll, "cell 2 3");
		
		chckbxSoja = new JCheckBox("Soja");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				milchNummer = 2;
			}
		});
		contentPane.add(chckbxSoja, "cell 3 3");
		
		lblZucker = new JLabel("Zucker:");
		contentPane.add(lblZucker, "cell 0 4");
		
		chckbxWeiss = new JCheckBox("Weiss");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				zuckerNummer = 0;
			}
		});
		contentPane.add(chckbxWeiss, "cell 1 5");
		
		chckbxBraun = new JCheckBox("Braun ");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				zuckerNummer = 1;
			}
		});
		contentPane.add(chckbxBraun, "cell 2 5");
		
		chckbxSstoff = new JCheckBox("S\u00FC\u00DFstoff");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				zuckerNummer = 2;
			}
		});
		contentPane.add(chckbxSstoff, "cell 3 5");
		
		chckbxStevia = new JCheckBox("Stevia");
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				zuckerNummer = 3;
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
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				kaffeNummer = 2;
			}
		});
		contentPane.add(chckbxMilchkaffe, "cell 1 10");
		
		chckbxEspresso = new JCheckBox("Espresso"); //0
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				kaffeNummer = 0;
			}
		});
		contentPane.add(chckbxEspresso, "cell 2 10");
		
		chckbxSchwarz = new JCheckBox("Schwarz"); //1
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				kaffeNummer = 1;
			}
		});
		contentPane.add(chckbxSchwarz, "cell 3 10");
		
		chckbxKakao_1 = new JCheckBox("Kakao"); //3
		chckbxNewCheckBox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				kaffeNummer = 3;
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
		contentPane.add(btnBestellungAufgeben, "cell 0 13,grow");
		
		textField = new JTextField(Integer.toString(Getraenke.gesamtPreis));
		contentPane.add(textField, "cell 1 13 2 3,grow");
		textField.setColumns(10);
		
		btnBestellungAbbrechen = new JButton("Bestellung abbrechen");
		contentPane.add(btnBestellungAbbrechen, "cell 0 14");
		
		btnNochEinKaffe = new JButton("Noch ein Kaffe");
		contentPane.add(btnNochEinKaffe, "cell 0 15,grow");
		
		
		
		
	}

}

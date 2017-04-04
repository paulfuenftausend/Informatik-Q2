import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.ActionEvent;

public class Random extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private static JPasswordField passwordField;
	private static JPasswordField passwordField_1;
	private JButton btnNewButton;
	private static JTextField txtLeer;
	private JLabel lblNewLabel_2;
	private static int min = 0;
	private static int max = 999;
	private JLabel lblNewLabel_3;
	private JLabel lblDerSpieler;
	private static JLabel label;
	private static JLabel label_1;
	
	public static ArrayList<Integer> gewinnRateSpieler1 = new ArrayList<Integer>();
	public static ArrayList<Integer> gewinnRateSpieler2 = new ArrayList<Integer>();
	private JLabel lblWinloseRatio;
	private JLabel label_2;
	private static JTextField txtWinLosePlayer1;
	private static JTextField txtWinLosePlayer2;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Random frame = new Random();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void gewinner()
	{
		int zahlSpieler1 = Integer.parseInt(passwordField.getText()); 
		int zahlSpieler2 = Integer.parseInt(passwordField_1.getText());
		int zufall = ThreadLocalRandom.current().nextInt(min, max + 1);
		txtLeer.setText(Integer.toString(zufall));
		passwordField.setEchoChar((char)0);
		passwordField_1.setEchoChar((char)0);
		if (Math.abs(zufall-zahlSpieler1)<Math.abs(zufall-zahlSpieler2))
		{
			label.setText("Winner");
			label_1.setText("Loser");
			gewinnRateSpieler1.add(1);
			gewinnRateSpieler2.add(0);
		}else{
			label_1.setText("Winner");
			label.setText("Loser");
			gewinnRateSpieler1.add(0);
			gewinnRateSpieler2.add(1);
		}
	}
	public static void reset()
	{
		int winPlayer1 = 0;
		int winPlayer2 = 0;
		for(int k: gewinnRateSpieler1)
		{
			winPlayer1 = winPlayer1 + k;
		}
		for(int k: gewinnRateSpieler2)
		{
			winPlayer2 = winPlayer2 + k;
		}
		/**if(winPlayer1 == 0) // Mit geteilt
		{
			txtWinLosePlayer1.setText(""+winPlayer1);
			txtWinLosePlayer2.setText(""+winPlayer2);
		}else if(winPlayer2 == 0){
			txtWinLosePlayer1.setText(""+winPlayer1);
			txtWinLosePlayer2.setText(""+winPlayer2);
		}else{
			txtWinLosePlayer1.setText(""+winPlayer1/winPlayer2);
			txtWinLosePlayer2.setText(""+winPlayer2/winPlayer1);
		}*/
		txtWinLosePlayer1.setText(winPlayer1+":"+winPlayer2); //ohne geteilt
		txtWinLosePlayer2.setText(winPlayer2+":"+winPlayer1);
		passwordField.setEchoChar('*');
		passwordField_1.setEchoChar('*');
		passwordField.setText("");
		passwordField_1.setText("");
		txtLeer.setText("");
	}

	/**
	 * Create the frame.
	 */
	public Random() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		lblNewLabel = new JLabel("Spieler 1:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(15, 0, 15, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.insets = new Insets(15, 0, 15, 5);
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 1;
		contentPane.add(passwordField, gbc_passwordField);
		
		lblNewLabel_1 = new JLabel("Spieler 2:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(15, 0, 15, 5);
		gbc_lblNewLabel_1.gridx = 6;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		btnNewButton = new JButton("Play!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gewinner();
			}
		});
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setEchoChar('*');
		GridBagConstraints gbc_passwordField_1 = new GridBagConstraints();
		gbc_passwordField_1.gridwidth = 2;
		gbc_passwordField_1.insets = new Insets(15, 0, 15, 5);
		gbc_passwordField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField_1.gridx = 7;
		gbc_passwordField_1.gridy = 1;
		contentPane.add(passwordField_1, gbc_passwordField_1);
		
		lblWinloseRatio = new JLabel("Win/Lose Ratio:");
		GridBagConstraints gbc_lblWinloseRatio = new GridBagConstraints();
		gbc_lblWinloseRatio.gridwidth = 3;
		gbc_lblWinloseRatio.insets = new Insets(0, 0, 5, 5);
		gbc_lblWinloseRatio.gridx = 0;
		gbc_lblWinloseRatio.gridy = 4;
		contentPane.add(lblWinloseRatio, gbc_lblWinloseRatio);
		
		txtWinLosePlayer1 = new JTextField();
		GridBagConstraints gbc_txtWinLosePlayer1 = new GridBagConstraints();
		gbc_txtWinLosePlayer1.insets = new Insets(0, 0, 5, 5);
		gbc_txtWinLosePlayer1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWinLosePlayer1.gridx = 3;
		gbc_txtWinLosePlayer1.gridy = 4;
		contentPane.add(txtWinLosePlayer1, gbc_txtWinLosePlayer1);
		txtWinLosePlayer1.setColumns(10);
		
		label_2 = new JLabel("Win/Lose Ratio:");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.anchor = GridBagConstraints.EAST;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 6;
		gbc_label_2.gridy = 4;
		contentPane.add(label_2, gbc_label_2);
		
		txtWinLosePlayer2 = new JTextField();
		txtWinLosePlayer2.setColumns(10);
		GridBagConstraints gbc_txtWinLosePlayer2 = new GridBagConstraints();
		gbc_txtWinLosePlayer2.gridwidth = 3;
		gbc_txtWinLosePlayer2.insets = new Insets(0, 0, 5, 5);
		gbc_txtWinLosePlayer2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtWinLosePlayer2.gridx = 7;
		gbc_txtWinLosePlayer2.gridy = 4;
		contentPane.add(txtWinLosePlayer2, gbc_txtWinLosePlayer2);
		
		label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 6;
		gbc_label_1.gridy = 6;
		contentPane.add(label_1, gbc_label_1);
		
		label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 7;
		contentPane.add(label, gbc_label);
		
		lblNewLabel_3 = new JLabel("1. Jeder gibt eine Zahl zwischen 1 und 1000 ein.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 9;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblDerSpieler = new JLabel("2. Der Spieler dessen Zahl n\u00E4her am Zielwert ist gewinnt");
		GridBagConstraints gbc_lblDerSpieler = new GridBagConstraints();
		gbc_lblDerSpieler.insets = new Insets(0, 0, 5, 5);
		gbc_lblDerSpieler.gridx = 4;
		gbc_lblDerSpieler.gridy = 10;
		contentPane.add(lblDerSpieler, gbc_lblDerSpieler);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 15);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 13;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				reset();
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 13;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		lblNewLabel_2 = new JLabel("Zufalls Zahl:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 6;
		gbc_lblNewLabel_2.gridy = 13;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtLeer = new JTextField();
		txtLeer.setEditable(false);
		GridBagConstraints gbc_txtLeer = new GridBagConstraints();
		gbc_txtLeer.gridwidth = 3;
		gbc_txtLeer.insets = new Insets(0, 0, 5, 5);
		gbc_txtLeer.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLeer.gridx = 8;
		gbc_txtLeer.gridy = 13;
		contentPane.add(txtLeer, gbc_txtLeer);
		txtLeer.setColumns(10);
	}

}

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
		int zahlSpieler1 = Integer.parseInt(passwordField.getText()); //aendern
		int zahlSpieler2 = Integer.parseInt(passwordField_1.getText());
		int zufall = ThreadLocalRandom.current().nextInt(min, max + 1);
		txtLeer.setText(Integer.toString(zufall));
		passwordField.setEchoChar((char)0);
		passwordField_1.setEchoChar((char)0);
		if (Math.abs(zufall-zahlSpieler1)<Math.abs(zufall-zahlSpieler2))
		{
			label.setText("Winner");
			label_1.setText("Loser");
		}else{
			label_1.setText("Winner");
			label.setText("Loser");
		}
	}

	/**
	 * Create the frame.
	 */
	public Random() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
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
		
		label_1 = new JLabel("");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 6;
		gbc_label_1.gridy = 2;
		contentPane.add(label_1, gbc_label_1);
		
		label = new JLabel("");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 3;
		contentPane.add(label, gbc_label);
		
		lblNewLabel_3 = new JLabel("1. Jeder gibt eine Zahl zwischen 1 und 1000 ein.");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.gridwidth = 4;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 4;
		gbc_lblNewLabel_3.gridy = 5;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		lblDerSpieler = new JLabel("2. Der Spieler dessen Zahl n\u00E4her am Zielwert ist gewinnt");
		GridBagConstraints gbc_lblDerSpieler = new GridBagConstraints();
		gbc_lblDerSpieler.insets = new Insets(0, 0, 5, 5);
		gbc_lblDerSpieler.gridx = 4;
		gbc_lblDerSpieler.gridy = 6;
		contentPane.add(lblDerSpieler, gbc_lblDerSpieler);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 15);
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 9;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		lblNewLabel_2 = new JLabel("Zufalls Zahl:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 6;
		gbc_lblNewLabel_2.gridy = 9;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtLeer = new JTextField();
		txtLeer.setEditable(false);
		GridBagConstraints gbc_txtLeer = new GridBagConstraints();
		gbc_txtLeer.gridwidth = 2;
		gbc_txtLeer.insets = new Insets(0, 0, 5, 5);
		gbc_txtLeer.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLeer.gridx = 8;
		gbc_txtLeer.gridy = 9;
		contentPane.add(txtLeer, gbc_txtLeer);
		txtLeer.setColumns(10);
	}

}

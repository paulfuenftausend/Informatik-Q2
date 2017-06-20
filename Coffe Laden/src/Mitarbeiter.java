import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.Color;

public class Mitarbeiter extends JFrame {

	private JPanel contentPane;
	private JButton btnTagesauswertung;
	private JButton btnMonatsauswertung;
	private JButton btnEinahmen;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Mitarbeiter() {
		setTitle("Mitarbeiter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[]", "[][][][][][]"));
		
		btnTagesauswertung = new JButton("Tagesauswertung");
		contentPane.add(btnTagesauswertung, "cell 0 1,growx");
		
		btnMonatsauswertung = new JButton("Monatsauswertung");
		contentPane.add(btnMonatsauswertung, "cell 0 3,growx");
		
		btnEinahmen = new JButton("Einahmen");
		contentPane.add(btnEinahmen, "cell 0 5,growx");
		
		this.setVisible(true);
	}

}

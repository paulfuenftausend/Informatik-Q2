import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EigenesGUI extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EigenesGUI GUI = new EigenesGUI();
		GUI.setVisible(true);
	}

	public EigenesGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300, 150);
		contentPane = new JPanel();
		contentPane.setBackground(new Color (160, 000, 000));
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JLabel lblMeinText = new JLabel("DADAM");
		JLabel lblMeinText2 = new JLabel("BABAM");
		contentPane.add(lblMeinText, BorderLayout.EAST);
		contentPane.add(lblMeinText2, BorderLayout.EAST);
		lblMeinText.setForeground(Color.WHITE);
		lblMeinText2.setForeground(Color.WHITE);
	}
}

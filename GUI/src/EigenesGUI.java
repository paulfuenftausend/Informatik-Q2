import java.awt.BorderLayout;
import java.awt.Color;

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
		contentPane.setBackground(Color.BLUE);
		contentPane.(Color.WHITE);
		contentPane.setLayout(new BorderLayout(0,0));
		setContentPane(contentPane);
		
		JLabel lblMeinText = new JLabel("DADAM");
		contentPane.add(lblMeinText, BorderLayout.CENTER);
	}
}

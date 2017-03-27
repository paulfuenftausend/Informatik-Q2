import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		JButton btnMeinText2 = new JButton("BABAM");
		JTextField txtDeinText = new JTextField("");
		contentPane.add(lblMeinText, BorderLayout.EAST);
		contentPane.add(btnMeinText2, BorderLayout.CENTER);
		contentPane.add(txtDeinText, BorderLayout.NORTH);
		lblMeinText.setForeground(Color.WHITE);
		/*btnMeinText2.setForeground(Color.WHITE);
		btnMeinText2.setBackground(new Color(160, 000, 000));*/
		btnMeinText2.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					System.out.println(txtDeinText.getText());
				};
		});
	}
}

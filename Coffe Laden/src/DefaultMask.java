import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;

public class DefaultMask extends JFrame {
	public JButton btnNewButton;
	public JButton btnMitarbeiter;
	public JLabel lblWillkommenImKaffe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefaultMask frame = new DefaultMask();
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
	public DefaultMask() {
		getContentPane().setBackground(Color.MAGENTA);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][]", "[][][][][][][]"));
		
		lblWillkommenImKaffe = new JLabel("Willkommen im Kaffe Laden");
		lblWillkommenImKaffe.setForeground(new Color(127, 255, 0));
		getContentPane().add(lblWillkommenImKaffe, "cell 7 2");
		
		btnNewButton = new JButton("Gast");
		btnNewButton.setForeground(new Color(0, 255, 255));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KaffeMask maske = new KaffeMask();
				dispose();
			}
		});
		getContentPane().add(btnNewButton, "cell 0 4");
		
		btnMitarbeiter = new JButton("Mitarbeiter");
		btnMitarbeiter.setForeground(new Color(255, 140, 0));
		btnMitarbeiter.setBackground(Color.LIGHT_GRAY);
		btnMitarbeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mitarbeiter maske = new Mitarbeiter();
				dispose();
			}
		});
		getContentPane().add(btnMitarbeiter, "cell 14 4");
	}

}

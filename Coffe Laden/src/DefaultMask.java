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

public class DefaultMask extends JFrame {
	private JButton btnNewButton;
	private JButton btnMitarbeiter;
	private JLabel lblWillkommenImKaffe;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][]", "[][][][][][][]"));
		
		lblWillkommenImKaffe = new JLabel("Willkommen im Kaffe Laden");
		getContentPane().add(lblWillkommenImKaffe, "cell 7 2");
		
		btnNewButton = new JButton("Gast");
		getContentPane().add(btnNewButton, "cell 0 4");
		
		btnMitarbeiter = new JButton("Mitarbeiter");
		getContentPane().add(btnMitarbeiter, "cell 14 4");
	}

}

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TaschenRechner extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel panel = new JPanel();
	static JButton plus = new JButton("+");
	static JButton minus = new JButton("-");
	static JButton mal = new JButton("x");
	static JButton teilen = new JButton("/");
	JButton lösen = new JButton("=");
	static JButton nummer1 = new JButton("1");
	static JButton nummer2 = new JButton("2");
	static JButton nummer3 = new JButton("3");
	static JButton nummer4 = new JButton("4");
	static JButton nummer5 = new JButton("5");
	static JButton nummer6 = new JButton("6");
	static JButton nummer7 = new JButton("7");
	static JButton nummer8 = new JButton("8");
	static JButton nummer9 = new JButton("9");
	static JButton nummer0 = new JButton("0");
	JButton komma = new JButton(".");
	static JTextField loesung = new JTextField(10);
	
	public TaschenRechner()
	{
		panel.setSize(150, 150);
		GridLayout grid = new GridLayout(5,1);
		panel.setLayout(grid);
		
		panel.add(loesung);
		panel.add(nummer1);
		panel.add(nummer2);
		panel.add(nummer3);
		panel.add(nummer4);
		panel.add(nummer5);
		panel.add(nummer6);
		panel.add(nummer7);
		panel.add(nummer8);
		panel.add(nummer9);
		panel.add(nummer0);
		panel.add(plus);
		panel.add(minus);
		panel.add(mal);
		panel.add(teilen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TaschenRechner();
	}
}

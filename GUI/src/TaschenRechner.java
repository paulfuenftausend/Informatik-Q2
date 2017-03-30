import java.awt.BorderLayout;
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
	static JPanel panelGesamt = new JPanel();
	static JPanel panelOben = new JPanel();
	static JPanel panelUnten = new JPanel();
	static JButton plus = new JButton("+");
	static JButton minus = new JButton("-");
	static JButton mal = new JButton("x");
	static JButton teilen = new JButton("/");
	JButton loesen = new JButton("=");
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
		panelGesamt.setSize(500, 500);
		panelOben.setSize(500, 100);
		panelUnten.setSize(500, 400);
		setContentPane(panelGesamt);
		
		GridLayout grid = new GridLayout(4,3);
		panelUnten.setLayout(grid);
		
		panelOben.add(loesung);
		panelUnten.add(nummer7);
		panelUnten.add(nummer8);
		panelUnten.add(nummer9);
		panelUnten.add(mal);
		panelUnten.add(nummer4);
		panelUnten.add(nummer5);
		panelUnten.add(nummer6);
		panelUnten.add(teilen);
		panelUnten.add(nummer1);
		panelUnten.add(nummer2);
		panelUnten.add(nummer3);
		panelUnten.add(plus);
		panelUnten.add(komma);
		panelUnten.add(nummer0);
		panelUnten.add(loesen);
		panelUnten.add(minus);
		panelGesamt.add(panelOben, BorderLayout.NORTH);
		panelGesamt.add(panelUnten, BorderLayout.WEST);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaschenRechner rechner = new TaschenRechner();
		rechner.setVisible(true);
		rechner.setSize(300, 200);
		rechner.setResizable(false);
	}
}

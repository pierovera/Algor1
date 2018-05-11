import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;

public class CalculadoraVista extends JFrame {
    private JButton n1, n2, n3, n4, n5, n6, n7, n8, n9, n0,
	div, mult, sum, sub, eq, clc;
    
    public CalculadoraVista() {
	super("Calculadora");
	n1 = new JButton("1");
	n2 = new JButton("2");
	n3 = new JButton("3");
	n4 = new JButton("4");
	n5 = new JButton("5");
	n6 = new JButton("6");
	n7 = new JButton("7");
	n8 = new JButton("8");
	n9 = new JButton("9");
	n0 = new JButton("0");
	div = new JButton("/");
	mult = new JButton("*");
	sum = new JButton("+");
	sub = new JButton("-");
	eq = new JButton("=");
	clc = new JButton("CC");

	GridLayout grid = new GridLayout(4,4);
	JPanel panel = new JPanel();
	panel.setLayout(grid);

	panel.add(n1);
	panel.add(n2);
	panel.add(n3);
	panel.add(sum);
	panel.add(n4);
	panel.add(n5);
	panel.add(n6);
	panel.add(sub);
	panel.add(n7);
	panel.add(n8);
	panel.add(n9);
	panel.add(mult);
	panel.add(clc);
	panel.add(n0);
	panel.add(eq);
	panel.add(div);

	panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
	this.add(panel);	
    }

    public static void main(String[] args) {
	CalculadoraVista c = new CalculadoraVista();
	c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	c.setSize(300,300);
	c.setVisible(true);
    }
	
}

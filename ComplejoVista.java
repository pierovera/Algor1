import javax.swing.*;
import javax.swing.border.Border;
import java.awt.GridLayout;

public class ComplejoVista extends JFrame {
    private JTextField real, imag, oper;
    private JTextArea realT, imagT, operT;
    private JButton calcular;
    
    public ComplejoVista() {
	super("Calculadora compleja");
	realT = new JTextArea("Parte Real:");
	real = new JTextField();
	imagT = new JTextArea("Parte Imaginaria:");
	imag = new JTextField();
	operT = new JTextArea("Operacion: (+, -, *, /)");
	oper = new JTextField();
	calcular = new JButton("Calcular");
	
	GridLayout grid = new GridLayout(7,1);
	JPanel panel = new JPanel();
	panel.setLayout(grid);

	panel.add(realT);
	panel.add(real);
	panel.add(imagT);
	panel.add(imag);
	panel.add(operT);
	panel.add(oper);
	panel.add(calcular);

	panel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
	this.add(panel);	
    }

    public static void main(String[] args) {
	ComplejoVista c = new ComplejoVista();
	c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	c.setSize(300,300);
	c.setVisible(true);
    }
	
}

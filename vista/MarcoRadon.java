package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MarcoRadon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public MarcoRadon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle("En Busca del Radón");
		
		LaminaRadon miLamina = new LaminaRadon();
		add(miLamina);
		
	}

}

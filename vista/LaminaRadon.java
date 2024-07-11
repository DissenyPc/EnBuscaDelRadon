package vista;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controlador.CalcularVetas;

import java.awt.Color;
import java.awt.Component;

import modelo.*;

public class LaminaRadon extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public LaminaRadon() {
		//setBackground(new Color(Color.WHITE);
		
		add(EtiquetaDeSalida = new JLabel("Hemos hayado  "));
		
		for (int i = 0; i< CalcularVetas.NTerrenos; i++ ) {
		
		add(EtiquetaDeSalida = new JLabel(Integer.toString(CalcularVetas.salida[i])));
		
		add(EtiquetaDeSalida = new JLabel(" "));
		}
		

	}
	
	private static JLabel EtiquetaDeSalida; 

}

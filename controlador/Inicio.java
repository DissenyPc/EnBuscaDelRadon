package controlador;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

import modelo.*;
import vista.*;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int Nterrenos = 0;
		try {
			Nterrenos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero de terenos a revisar"));
			Terreno TerrenosEstudiar = new Terreno(Nterrenos);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CalcularVetas.CalcularVetas(Terreno.MuestrasTomadas, Nterrenos);
		
		
		
		MarcoRadon MiMarco =new MarcoRadon();
		MiMarco.setVisible(true);
		
	}
	
	

}

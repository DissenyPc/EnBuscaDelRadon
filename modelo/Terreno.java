package modelo;

import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import controlador.*;

public class Terreno {
	
	public static ArrayList<int[][]> MuestrasTomadas = new ArrayList<>();
	private int NFilas, NColumnas;
	//private Array
	

	public Terreno( int nTerrenos2) {
		
		nTerrenos=nTerrenos2;
		
		for (int i = 0; i< nTerrenos; i++) {
			
			NColumnas = Integer.parseInt(JOptionPane.showInputDialog("Por favor Introducca el numero de Filas para la " + (i+1) + "º División"));
			
			NFilas = Integer.parseInt(JOptionPane.showInputDialog("Por favor Introducca el numero de Columnas para la " + (i+1) + "º División"));
			
			int[][] TerrenoI = new int[NColumnas][NFilas]; 
			
			for ( int x=0; x < NColumnas; x++  ) {
				
				for (int y=0; y < NFilas; y++) {
					
					if(JOptionPane.showInputDialog("Por favor Introducca el siguiente hallazgo").equals("g")) {
				
						TerrenoI[x][y]= 0;
						
						
						
					}else {TerrenoI[x][y]= -1;}
					
				}
				
			}
			
			MuestrasTomadas.add(TerrenoI);	
			
			
		}
		
		for (int i=0; i < nTerrenos; i++) {
			
			for (int x=0; x<MuestrasTomadas.get(i).length; x++) {
				for (int y =0; y < MuestrasTomadas.get(i)[x].length; y++) {	
					
					System.out.print(MuestrasTomadas.get(i)[x][y] + "   ");
				}
				System.out.println("");
			}
			
		}
		
		 
	}
	int nTerrenos;
}

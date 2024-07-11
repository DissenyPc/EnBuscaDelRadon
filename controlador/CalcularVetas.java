package controlador;

import java.util.ArrayList;

public class CalcularVetas {
	
	public static void CalcularVetas (ArrayList<int[][]> MuestrasTomadas1, int NTerrenos2) {
		
	 MuestrasTomadas = MuestrasTomadas1;
	 NTerrenos=NTerrenos2;
	 salida= new int[NTerrenos];
		
		// UNA VUELTA DE BUCLE POR CADA TERRENO
		for (int i = 0; i< NTerrenos; i++ ) {
			
			iActual = i;
			NVeta = 0;			
						
			for(int x=0; x < MuestrasTomadas.get(i).length; x++) {
				
				xActual = x;
				
				for (int y =0; y < MuestrasTomadas.get(i)[x].length; y++) {
					
					yActual = y;
								
					if (MuestrasTomadas.get(i)[x][y]>= 0 ) {// COMPROBAMOS SI HEMOS ENCOTRADO GRANITO
						 
						if (MuestrasTomadas.get(i)[x][y]== 0) {
							
						NVeta++; // SI SI SUMAMOS AL NUMERO DE VETA
						
						MuestrasTomadas.get(i)[x][y]= NVeta; // Y LE SASIGNAMOS SU NUMERO DE VETA
						
						
						}
					
						//COMPRUEBO EL POSTERIOR
						
						if (y+1 < MuestrasTomadas.get(i)[x].length ) { // ¿EXISTE L SIGUIENTE Y?
							yAComprobar = y+1;
							xAComprovar = x;
							
							comprobacion();
							
							}
												
						//COMPRUEBO EL INFERIOR
						
						if (x+1 < MuestrasTomadas.get(i).length) {
							
							yAComprobar = y;
							xAComprovar = x+1;
							
							comprobacion();
						
						}
						
						//COMPRUEBO EL INFERIOR ANTERIOR
						if (x+1 < MuestrasTomadas.get(i).length && y-1 >=0) {
							yAComprobar = y-1;
							xAComprovar = x+1;
							
							comprobacion();
						
						}
						
						//COMPRUEBO EL INFERIOR SIGUIENTE
						if (x+1 < MuestrasTomadas.get(i).length && y+1 < MuestrasTomadas.get(i)[x].length) {
							
							yAComprobar = y+1;
							xAComprovar = x+1;
							
							comprobacion();
						
						}
						
					} 
										
					} 
				}
			
				System.out.println("numero de vetas encontrado en terreno " + (i+1) + " Total: " + NVeta);
				
				salida[i]=NVeta;
				
			}
		
		for (int i = 0; i< NTerrenos; i++ ) {
			
			for(int x=0; x < MuestrasTomadas.get(i).length; x++) {
				
				for (int y =0; y < MuestrasTomadas.get(i)[x].length; y++) {
					
										
				}
				
				System.out.println(" ");
			}
			
		}
				
		
	}
	
	private static void comprobacion() {
		
		if (MuestrasTomadas.get(iActual)[xAComprovar][yAComprobar]==-1) {
		
		} // SI SI COMPROBAMOS SI NO ES MARMOL PARA SALTAR
			else if (MuestrasTomadas.get(iActual)[xAComprovar][yAComprobar]==0) { //EN CASO CONTRARIO SI ES MARMOL 
				
				MuestrasTomadas.get(iActual)[xAComprovar][yAComprobar]= MuestrasTomadas.get(iActual)[xActual][yActual];// LE ASIGNAMOS LA MISMA VETA
								
			} else if (MuestrasTomadas.get(iActual)[xAComprovar][yAComprobar]!=MuestrasTomadas.get(iActual)[xActual][yActual]) { // SI FUERA MAYOR LA VETA QUE LA PRESENTE
				
				valor1 = MuestrasTomadas.get(iActual)[xActual][yActual];
				valor2= MuestrasTomadas.get(iActual)[xAComprovar][yAComprobar]; //CAMBIAR CODIGO PARA CAMBIAR TODAS LAS QUE TENGAN ESE VALOR POR EL DE NVETA
				
				ReducirValorVeta();
		    }
		}
		
	
	public static void ReducirValorVeta () {
		
		int mayor;
		int menor;
			NVeta=0;
			if (valor1>valor2) { 
				mayor=valor1;
				menor=valor2;
				NVeta=valor2;
			}else {
				menor=valor1;
				mayor=valor2;
				NVeta=valor1;
			}
			
			for (int i=0; i < NTerrenos; i++) {
				
				for (int x=0; x<MuestrasTomadas.get(i).length; x++) {
					for (int y =0; y < MuestrasTomadas.get(i)[x].length; y++) {
						
						if (MuestrasTomadas.get(i)[x][y] == mayor) {
							MuestrasTomadas.get(i)[x][y]= menor;
							
						}  
						
						else if (MuestrasTomadas.get(i)[x][y] > menor) {
							MuestrasTomadas.get(i)[x][y]=MuestrasTomadas.get(i)[x][y]-1;
							
						}
						if (MuestrasTomadas.get(i)[x][y]>NVeta) {
							
						}
					}
				}
			}
					
		}
	
	private static ArrayList<int[][]> MuestrasTomadas;
	private static int valor1;
	private static int valor2;
	public static int NTerrenos;
	private static int NVeta;
	public static int[] salida; 
	private static int yAComprobar, xAComprovar, iActual, yActual,	xActual;
	
}

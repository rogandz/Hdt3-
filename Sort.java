/*UNIVERSIDAD DEL VALLE DE GUATEMALA / ADT SECCION 30 
 * Integrantes: 
 *-Paulina Cano 15053 
 *-Dieter De Wit 15 
 *-Brandon Hernandez 15326
 *-Andres Giron 15174 
 */

import java.io.*;

public class Sort {
	private int[] arreglo;
	
	
	public void llenarArreglo(int num,int cont){
		try {
			arreglo = new int[3000];
			FileWriter guardar= new FileWriter("Datos.txt");
			PrintWriter escribir= new PrintWriter(guardar);
			arreglo[cont] = num;
			escribir.println(arreglo[cont]);
			System.out.println(num);
			guardar.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void guardarTxt(int x){
		for(int i = 3000; x>0; x--){
			try{
				
			}
			catch(Exception e){}
		}
	}
	
}
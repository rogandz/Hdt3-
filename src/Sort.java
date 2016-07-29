/*UNIVERSIDAD DEL VALLE DE GUATEMALA / ADT SECCION 30 
 * Integrantes: 
 *-Paulina Cano 15053 
 *-Dieter De Wit 15 
 *-Brandon Hernandez 15326
 *-Andres Giron 15174 
 */

import java.io.*;
import java.util.*;

public class Sort {
	private int[] arreglo;
	
	public void guardarRandText(int[] vector){
		try{
			PrintWriter guardar = new PrintWriter("Chilerisimoxd.txt"); //AQUI HAY QUE CAMBIAR EL NOMBRE DEL ARCHIVO AL DE DATOS.TXT
			for(int x = 0; x<vector.length; x++){
				guardar.print(vector[x] + " ");
			}
			guardar.close();
			System.out.println("Los random ya fueron guardados...");
		}
		catch(Exception e){
			System.out.println("No se ha podido guardar...");
		}
	}
	
	public String leerText(String texto){
		arreglo=new int[10];
		 // Leer una linea a la vez 
        String line = null;

        try {
            // FileReader lee el texto 
            FileReader fileReader = new FileReader(texto);

            BufferedReader bufferedReader =  new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                return line;
            }   

            // Cerrar el archivo
            bufferedReader.close();         
        }
        //Si no logra abir el archivo mandar un mensaje 
        catch(IOException ex) {
            System.out.println(
                "No se pudo leer el archivo '" 
                + texto + "'");                  
        
        }
		return line;
	}
	
	public int[] leerDatos(String datos){
		int[] vector = new int[10];
		String numero = new String();
		int cont=0;
		char caracter=' ';
		
		for (int i=0;i<datos.length();i++){
			//Ver el caracter 
			caracter = datos.charAt(i);
			//Ver si no es un espacio
			if (Character.isWhitespace(caracter)==false){
				numero=numero+String.valueOf(caracter);
			}
			else 
			{
				vector[cont]=Integer.parseInt(numero);
				cont++;
				numero="";
			}
		}//for 
		return vector;
	}//llenarVector
	
	public static void swap(int[] datos, int i , int j){
		int temp;
		temp=datos[i];
		datos[i]=datos[j];
		datos[j]=temp;
	}
	
	public int[] selectionSort(int[] datos,int n){
		int numUnsorted = n;
		int index;
		int max;
		while (numUnsorted>0){
			max=0;
			for (index=1;index<numUnsorted;index++){
				if (datos[max]<datos[index]){
					max=index;
				}
			}
			swap(datos,max,numUnsorted-1);
			numUnsorted--;	
		}
		return datos;
	}
}
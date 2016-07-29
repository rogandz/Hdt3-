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
	
	
	public void llenarText(int num,int cont){
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
	}	//llenarText
	
	public void guardarRandText(int[] vector){
		try{
			PrintWriter guardar = new PrintWriter("Datos.txt");
			for (int x=0;x<vector.length;x++){
				guardar.print(vector[x]+" ");
			}
			guardar.close();
			System.out.println("Los random ya fueron guardados...");
		}
		catch(Exception e){
			
		}
	}
	public String leerText(String texto){
		arreglo=new int[3000];
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
		int[] vector = new int[3000];
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
	
	
	//Referencia de Java Structures, Duane A. Bailey
	public int[] selectionSort(int[] numeros,int n){
		int[] datos=numeros;
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
	
	//Referencia de Java Structures, Duane A. Bailey
	public int[] insertionSort(int[] numeros,int n){
		int [] datos = numeros;
			int numSorted = 1; 
			int index; 
			while (numSorted<n){
				int temp=datos[numSorted];
				for (index=numSorted;index>0;index--){
					if (temp<datos[index-1]){
						datos[index]=datos[index-1];
					}
					else 
					{
						break;
					}
				}
				datos[index]=temp;
				numSorted++;
			}
			System.out.println("Vector ordenado por medio del Insertion Sort");
		return datos;
	}
	
	public int [] mergeSort(int[] numeros, int n){
		int [] datos = numeros; 
		return datos;
	}
	
	
}
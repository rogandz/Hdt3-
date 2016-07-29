/*UNIVERSIDAD DEL VALLE DE GUATEMALA / ADT SECCION 30 
 * Integrantes: 
 *-Paulina Cano 15053 
 *-Dieter De Wit 15 
 *-Brandon Hernandez 15326
 *-Andres Giron 15174 
 */
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sort = new Sort(); //Crear el objeto sort 
		Random rand = new Random(); //Crear el objeto random
		int numero; 
		for (int i=0;i<3000;i++){
			numero=rand.nextInt((10000)+1);
		}
		int[] vector = sort.llenarVector(sort.leerText("Datos.txt"));
		
		int[] selectionsor = sort.selectionSort(vector, 10);
		
		for (int i=0;i<10;i++){
			System.out.println(selectionsor[i]);
		}
	}
	

}

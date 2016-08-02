/*******************************************************
* Universidad del Valle de Guatemala
* Algoritmos y Estructura de Datos, Seccion 30 
* Integrantes: 
* -Paulina Cano 15053 
* -Dieter de Wit 15146 
* -Brandon Hernandez 15326
* -Andres Giron 15174 
* Hoja de Trabajo # 3, Algoritmos de Ordenamiento; Main
* 
* Este es un programa que genera 100000 numeros random, los ingresa 
* en un .txt, posteriormente lo lee y los ordena por distintos metodos. 
********************************************************/

import java.util.Random;
import java.util.Scanner;

public class Main 
{
	private static Scanner elegido;
	private static Scanner elegidou;
	private static Scanner elegidou2;
	private static Scanner elegidou3;
	private static Scanner elegidou4;

	public static void main(String[] args) 
	{
		/*
		 * Menu de entrada
		 */
		System.out.println("Ingrese el metodo Sort que desee utilizar:");
		System.out.println("1.Selection Sort");
		System.out.println("2.Insertion Sort");
		System.out.println("3.Merge Sort    ");
		System.out.println("4.Quick Sort    ");
		elegido = new Scanner(System.in);
		System.out.println();
		System.out.println("Presione: 1, 2, 3 o 4");
		int entrada = elegido.nextInt();

		//Progra defensiva
		while (entrada != 5) 
		{
		    if (entrada < 1 || entrada > 4) 
		    {
		        System.out.println("Presione: 1, 2, 3 o 4");
		        entrada = elegido.nextInt();
		    }

		    //Selection Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 1) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[100000];
				
				for (int i=0;i<100000;i++)
				{
					numeros[i]=rand.nextInt((100000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				long ini1 = System.nanoTime();
				int[] pruebasort = sort.selectionSort(vector,100000);
				long fin1 = System .nanoTime();
				
				for (int i=0;i<100000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Tiempo SelectionSort: " + (fin1 - ini1));
				
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				elegidou3 = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou3.nextInt();
				
				//Si
				if (entradaa==1){
					long ini11 = System.nanoTime();
					pruebasort = sort.selectionSort(pruebasort,100000);
					long fin11 = System .nanoTime();
					for (int i=0;i<100000;i++)
					{
						System.out.println(pruebasort[i]);
					}
					System.out.println("Tiempo SelectionSort Ordenado: " + (fin11 - ini11));
				}
				break;
		    }
		    
		    //Insertion Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 2) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[100000];
				
				for (int i=0;i<100000;i++){
					numeros[i]=rand.nextInt((100000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				long ini2 = System.nanoTime();
				int[] pruebasort = sort.insertionSort(vector,100000);
				long fin2 = System.nanoTime();
				
				for (int i=0;i<100000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Tiempo InsertionSort: " + (fin2 - ini2));
				
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				elegidou4 = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou4.nextInt();
				if (entradaa==1){
					long ini22 = System.nanoTime();
					pruebasort = sort.insertionSort(pruebasort,100000);
					long fin22 = System.nanoTime();
					for (int i=0;i<100000;i++)
					{
						System.out.println(pruebasort[i]);
					}
					System.out.println("Tiempo InsertionSort Ordenado: " + (fin22 - ini22));
				}
				break;
		    }
		    
		    //Merge Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 3) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[100000];
				
				for (int i=0;i<100000;i++)
				{
					numeros[i]=rand.nextInt((100000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				long ini3 = System.nanoTime();
				int[] pruebasort = sort.mergeSort(vector, 0, 100000-1);
				long fin3 = System.nanoTime();
				
				for (int i=0;i<100000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Tiempo InsertionSort: " + (fin3 - ini3));
				
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				elegidou = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou.nextInt();
				if (entradaa==1){
					long ini33 = System.nanoTime();
					pruebasort = sort.mergeSort(pruebasort, 0, 100000-1);
					long fin33 = System.nanoTime();
					for (int i=0;i<100000;i++)
					{
						System.out.println(pruebasort[i]);
					}
					System.out.println("Tiempo MergeSort Ordenado: " + (fin33 - ini33));
				}
				break;
		    }
		    
		    //Quick Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 4) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[100000];
				
				for (int i=0;i<100000;i++)
				{
					numeros[i]=rand.nextInt((100000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				long ini4 = System.nanoTime();
				int[] pruebasort = sort.quickSorting(vector, 0, 100000-1);
				long fin4 = System.nanoTime();
				
				for (int i=0;i<100000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Tiempo QuickSort: " + (fin4 - ini4));
				
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				elegidou2 = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou2.nextInt();
				if (entradaa==1){
					long ini44 = System.nanoTime();
					pruebasort = sort.quickSorting(pruebasort, 0, 100000-1);
					long fin44 = System.nanoTime();
					for (int i=0;i<100000;i++)
					{
						System.out.println(pruebasort[i]);
					}
					System.out.println("Tiempo QuickSort: " + (fin44 - ini44));
				}
				break;
		    }
		} 
	}
}

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
* Este es un programa que genera 3000 numeros random, los ingresa 
* en un .txt, posteriormente lo lee y los ordena por distintos metodos. 
********************************************************/

import java.util.Random;
import java.util.Scanner;

public class Main 
{
	private static Scanner elegido;

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
				numeros=new int[3000];
				
				for (int i=0;i<3000;i++)
				{
					numeros[i]=rand.nextInt((10000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				int[] pruebasort = sort.selectionSort(vector,3000);
				
				for (int i=0;i<3000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				Scanner elegidou = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou.nextInt();
				
				//Si
				if (entradaa==1){
					pruebasort = sort.selectionSort(pruebasort,3000);
					for (int i=0;i<3000;i++)
					{
						System.out.println(pruebasort[i]);
					}
				}
				break;
		    }
		    
		    //Insertion Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 2) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[3000];
				
				for (int i=0;i<3000;i++){
					numeros[i]=rand.nextInt((10000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				int[] pruebasort = sort.insertionSort(vector,3000);
				
				for (int i=0;i<3000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				Scanner elegidou = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou.nextInt();
				if (entradaa==1){
					pruebasort = sort.insertionSort(pruebasort,3000);
					for (int i=0;i<3000;i++)
					{
						System.out.println(pruebasort[i]);
					}
				}
				break;
		    }
		    
		    //Merge Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 3) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[3000];
				
				for (int i=0;i<3000;i++)
				{
					numeros[i]=rand.nextInt((10000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				int[] pruebasort = sort.mergeSort(vector, 0, 3000-1);
				
				for (int i=0;i<3000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				Scanner elegidou = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou.nextInt();
				if (entradaa==1){
					pruebasort = sort.mergeSort(pruebasort, 0, 3000-1);
					for (int i=0;i<3000;i++)
					{
						System.out.println(pruebasort[i]);
					}
				}
				break;
		    }
		    
		    //Quick Sort------------------------------------------------------------------------------------------------------
		    else if(entrada == 4) 
		    {
				Sort sort = new Sort(); //Crear el objeto sort 
				Random rand = new Random(); //Crear el objeto random
				int[] numeros = null;
				numeros=new int[3000];
				
				for (int i=0;i<3000;i++)
				{
					numeros[i]=rand.nextInt((10000)+1);
				}
				System.out.println("Fueron generados "+numeros.length+" numeros random...");
				sort.guardarRandText(numeros);
				int[] vector = sort.leerDatos(sort.leerText("Datos.txt"));
		    	
				int[] pruebasort = sort.quickSorting(vector, 0, 3000-1);
				
				for (int i=0;i<3000;i++)
				{
					System.out.println(pruebasort[i]);
				}
				System.out.println("Desea volver a ordenarlo por este metodo? 1/0");
				Scanner elegidou = new Scanner(System.in);
				System.out.println();
				int entradaa = elegidou.nextInt();
				if (entradaa==1){
					pruebasort = sort.quickSorting(pruebasort, 0, 3000-1);
					for (int i=0;i<3000;i++)
					{
						System.out.println(pruebasort[i]);
					}
				}
				break;
		    }
		} 
	}
}
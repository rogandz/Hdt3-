import static org.junit.Assert.*;

import org.junit.Test;

public class SortTest {

	@Test
	public void test() {
		 System.out.println("Sort");
	     Sort instance = new Sort();
	     String expResult = instance.leerText("numeros.txt") ;
	     int[] result = instance.leerDatos(expResult);
	     for(int i = 0 ; i < 8; i++)
	     {
	    	 System.out.println("Antes de hacer sort... " + result[i]);
	     }
	     result = instance.quickSorting(result, 0, 8-1);
	     String resultado = "";
	   
	     for(int i = 0 ; i < 8; i++)
	     {
	    	 resultado = resultado + String.valueOf(result[i]);
	    	 System.out.println("pruebas con el sort... " + result[i]);
	     }
	     assertEquals(resultado,"12345679",true);
		 fail("Not yet implemented");
	}
}

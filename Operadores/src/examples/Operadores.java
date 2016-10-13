/**
 * 
 */
package examples;
import java.io.*;
/**
 * @author dczun
 *
 */
public class Operadores {
	static int numero = 0;
	static int x;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(++numero);
		System.out.println(numero++);
		System.out.println(numero);
		modificar(2);
		System.out.println(numero);
		System.out.println(numero++>=5);
		
		class Horse 
        {
            public String name; /* Line 7 */
            public Horse(String s) 
            {
                name = s;
            }
        } /* class Horse ends */
        
        Object obj = new Horse("Zippo"); /* Line 13 */
        Horse h = (Horse) obj; /* Line 14 */
        System.out.println(h.name);
        
        String str = "10";
        Integer a = 10;
        Boolean b = str==a+"";
        
        String x  = Operadores.getProductName("jaja");
        System.out.println(x);
        
        int bang = 1;
        do while(bang > 1)
        	System.out.println("bang 1");
        while(bang > 1);
        
        int i= -2, j=2;
        for(;++i>0;){
        	i=++i;
        	j--;
        }
        System.out.println(i);
        
        i = 1;
        while(i-->1){
        	System.out.println(i);
        }
        
        Transport[] examples = {new Transport(), new Bullock()};
        for (int k = 0; k < examples.length; k++) {
			examples[k].drive();
		}
        
        Integer entero = new Integer(1);
        int f = 'c';
        
        int num = -50;
        System.out.println(num % 25.0);
	}

	/**
	 * Metodo que modifica el int numero
	 * @param dato
	 */
	public static void modificar(int dato){
		numero = numero + dato;
	}

	public static String getProductName(String name){
		return name;
	}
}

class Transport {
	public void drive(){
		System.out.println("go foward");
	}
}

class Bullock extends Transport{
	public void drive() {
		System.out.println("go fast");
	}
}

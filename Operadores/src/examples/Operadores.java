/**
 * 
 */
package examples;
/**
 * @author dczun
 *
 */
public class Operadores {
	static int numero = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Entrando al main: " + args[0]);
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

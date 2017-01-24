package examples;

import java.util.Arrays;

public class Test {

	public static void main(String arg[]) throws Exception{
		System.out.println(arg);
		
		Integer n1 = new Integer(0);
		Byte n2 = new Byte((byte) 0);
		System.out.println(n1.equals(n2));

		String statement = "Java*JSP*EJB*J2EE";
		System.out.println(Arrays.toString(statement.split("\\*")));
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		if(a=false)
			if(b==true)
				if(c==true)
					System.out.println("True");
				else
					System.out.println("False");
			else if(a && (b==c))
				System.out.println("Undefined");
			else 
				System.out.println("True and false");
	}
}

package exam.mock4;

import static java.lang.System.out;

public class Test7 {

	//static int i = j;
	static int j = 10;
	static int i = j;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("i es: " + i);
		out.println("j es: " + j);
		out.println(i==j);
	}

}

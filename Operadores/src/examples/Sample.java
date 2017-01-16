package examples;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arg = 10;
		switch (arg) {
		case 0:
			System.out.println("Java ");
		case 10:
			System.out.println("JSP");
		case 20:
			System.out.println("EJB");
		case 30:
			System.out.println("JMS");
		case 40:
			System.out.println("JNDI");
			break;
		default:
			System.err.println("NOne");;
		}
	}

}

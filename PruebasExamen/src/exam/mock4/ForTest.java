package exam.mock4;

public class ForTest {

	public static void main(String[] args) {
		Integer x, y, z;
		
		for(x=10, y=11, z=12; x < y && x < z; x++, y--, z++){
			System.out.println("x="+ x + ", y=" + y + ", z=" + z);
		}
	}

}

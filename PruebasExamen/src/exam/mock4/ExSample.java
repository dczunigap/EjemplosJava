package exam.mock4;

public class ExSample {

	public static void main(String[] args) {
		try{
			Class ExSample = ExSample.class;
			System.out.println("Hello ");
		}catch (ClassCastException e) {
			System.out.println("Java ");
		}finally {
			System.out.println("Tiger ");
		}
		System.out.println("Welcome ");
	}

}

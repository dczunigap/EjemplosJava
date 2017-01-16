package examples;

public class Test3 {

	public Test3() {
		// TODO Auto-generated constructor stub
		System.out.println("Main class");
	}

	static class InnerTest{
		InnerTest() {
			// TODO Auto-generated constructor stub
			System.out.println("Inner class ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test3.InnerTest();
	}
}

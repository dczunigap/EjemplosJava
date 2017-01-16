package examples;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test = new Test2();
		test.new InnerTest().f();
	}

	final String s = "Java";
	
	class InnerTest{
		String s = " Java 7";
		
		void f(){
			System.out.println(s);
		}
	}
}

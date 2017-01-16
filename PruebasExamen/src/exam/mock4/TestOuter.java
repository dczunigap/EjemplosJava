package exam.mock4;

public class TestOuter {

	static Integer num = 200;
	TestOuter(){
		num = 400;
	}
	
	static class TestInner{
		TestInner(){
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		new TestOuter.TestInner();
	}

}

package exam.mock4;
class A {}

class B extends A{}

public class Main {

	public static void main(String[] args) {
		A ob1 = new A();
		B ob2 = (B) ob1;
	}

}

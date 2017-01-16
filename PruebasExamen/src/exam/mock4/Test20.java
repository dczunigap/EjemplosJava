package exam.mock4;
class AA {
	public void hello(){
		System.out.println("Inside 1");
	}
}

class BB extends AA{
	public void hello() {
		System.out.println("Inside 2");
	}
}

public class Test20 {

	public static void main(String[] args) {
		AA a = new BB();
		a.hello();
	}

}

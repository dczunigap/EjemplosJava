package exam.mock4;

public class MyClass {

	public static void main(String[] args) {
		String s1 = new String("Java");
		StringBuffer buffer = new StringBuffer(s1);
		if(s1.equals(buffer)){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}
	}

	public void aMethod(int x, String y){}
	public void aMethod(String x, int y){}
	public void AMethod(int x, String y){}
	
}

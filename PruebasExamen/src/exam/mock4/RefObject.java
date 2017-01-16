package exam.mock4;

public class RefObject {

	String className = "RefObject";
	
	public RefObject() {
		className = "RefObject_200";
	}
	
	static void method1(Object ob) {
		ob = null;
	}
	
	public static void main(String[] args) {
		RefObject refOb = new RefObject();
		method1(refOb);
		System.out.println(refOb.className);
	}
}

package exam.mock4;
//package java.lang;

public class MyObject extends Object {
	String name = "DEFAULT NAME";
	
	protected void finalized(){
		name = null;
	}

	public static void main(String[] args) throws Throwable {
		Object obj = new MyObject();
		//obj.finalize();
		System.out.println(obj);
	}

}

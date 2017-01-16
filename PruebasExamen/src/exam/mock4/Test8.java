package exam.mock4;

public class Test8 {

	public static void main(String[] args) {
		String name = "Java Tiger";
		System.out.println(name + " " + name.hashCode());
		change(name);
		System.out.println(name + " " + name.hashCode());
	}

	public static void change(String in){
		in = in.substring(0, in.length()-3);
	}
}

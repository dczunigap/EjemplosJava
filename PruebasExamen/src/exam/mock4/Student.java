package exam.mock4;

public class Student {

	public static void main(String[] args) {
		Integer studentRollNo = 145;
		Object num1 = new String("145");
		Object num2 = studentRollNo;
		studentRollNo = null;
		Object num4 = num2.toString();
		
		System.out.println(num1);
		System.out.println(num4);
		System.out.println(studentRollNo);
		
		System.out.println(num1.equals(num4));
		
	}

}

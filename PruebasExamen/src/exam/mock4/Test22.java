package exam.mock4;

import java.util.ArrayList;

class AAA{}
class BBB extends AAA{}
class CCC extends BBB{}

public class Test22 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList<>();
		a.add(new AAA());
		a.add(new BBB());
		a.add(new CCC());
		for (Object object : a) {
			System.out.println(object);
		}
	}

}

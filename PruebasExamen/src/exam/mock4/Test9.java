package exam.mock4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test9 {

	public static void main(String[] args) {
		String[] list = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		Set set = new HashSet(Arrays.asList(list));
		//set.add(list[0]);
		//set.add(list[1]);
		System.out.println(set.size());
	}

}

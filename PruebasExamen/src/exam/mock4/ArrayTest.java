package exam.mock4;

public class ArrayTest {

	public static void main(String[] args) {
		Long arr[] = {2l, 1l, 0l};
		print(arr);
	}

	private static void print(Long... arr) {
		for (Long long1 : arr) {
			System.out.println(long1);
		}
	}

}

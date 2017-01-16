package examples;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3, new Integer(6)},{new Integer(100),300, new Integer(400),600,700}};
		System.out.println(arr[1].length);
		
		Integer arg = 20;
		
		switch (arg) {
		default:
			System.out.println("default");
		case 10: 
			System.out.println("100");
		case 20:
			System.out.println("200");
		}	
		
		byte b1 = ~5+1;
		int b2 = +b1;
		System.out.println(b1);
		System.out.println(b2);
	}

}

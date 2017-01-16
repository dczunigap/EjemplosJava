package exam.mock4;

public class Exception_3 {
	public static void main(String[] args) {
		int[][] twoD = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10 } };
		System.out.println(twoD[1].length);
		System.out.println(twoD[2].getClass().isArray());
		System.out.println(twoD[1][2]);

		/*int i = 0;
		int[] iA = { 10, 20 };
		iA[i] = i = 30;
		System.out.println("" + iA[0] + " " + iA[1] + "  " + i);
		
		int i = 1, j = 10;
		   do {
		      if (i++ > --j) continue;
		   } while (i < 5);
		   System.out.println("i=" + i + " j=" + j);
		   
		   int i;
		      int j;
		      for (i = 0, j = 0 ; j < 1 ; ++j , i++){
		         System.out.println( i + " " + j );
		      }
		      System.out.println( i + " " + j );
 
		      loop: for (int i = 1; i < 5; i++){
		          for (int j = 1; j < 5; j++){
		             System.out.println(i);
		             if (x == 0) {  continue loop;  }
		             System.out.println(j);
		          }
		       }
		       */
	}

	public static int doIt() throws Exception {
		throw new Exception("Forget It");
	}

	void test(byte x) {
		boolean flag = true;
		if (flag = false) {
			System.out.println("1");
		} else if (flag) {
			System.out.println("2");
		} else if (!flag) {
			System.out.println("3");
		} else
			System.out.println("4");

		while (flag = false) {
		}
	}
}

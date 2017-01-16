package exam.mock4;

public class TestLoop28 {

	public static void main(String[] args) {
		int counter = 0;
		
		outer: for (int i = 0; i < 6; ++i)
		middle: for (int j = 0; j < 6; ++j)
		inner: for(int k = 0; k < 6; ++k){
			System.out.println("Inside loop - "+ ++counter);
			if((k % 4) == 0 )
				break outer;
		}
	}

}

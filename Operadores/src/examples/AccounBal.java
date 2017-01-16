package examples;

public class AccounBal {
	public int getBalance(short amt){
		return amt*2;
	}
	
	public double getBalance(double amt){
		return amt*3;
	}
	
	public double getBalance(long amt){
		return amt*4;
	}
	
	public static void main(String...strings){
		AccounBal ac = new AccounBal();
		Integer val = 20;
		System.out.println(ac.getBalance(val));
		
		float[] j = new float[5];
		
	}
}

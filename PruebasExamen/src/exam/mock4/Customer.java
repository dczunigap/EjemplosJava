package exam.mock4;

public class Customer {

	String accountNumber = null;
	public Customer() {
		this.accountNumber = "AC" + accountNumber;
	}
	
	public static void main(String[] args) {
		Customer cust = new Customer();
		cust.accountNumber = "1234AC";
		System.out.println(cust.accountNumber);
	}

}

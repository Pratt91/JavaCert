
public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera");
		System.out.println("Model: " + porsche.getModel());
		
		Account acct0 = new Account(123456, 100.00, "Seth", "seth-pratt@outlook.com", 319325738);
		
		acct0.deposit(50.00);
		acct0.withdraw(150);
		acct0.withdraw(1);
		acct0.deposit(45.23);
		

	}

}

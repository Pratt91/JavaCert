
public class VIPCustomer {
	
	private String name;
	private double creditLimit;
	private String email;

	public VIPCustomer(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public VIPCustomer(){
		this("default name", 0.0, "default email");
	}
	
	public VIPCustomer(String name, double creditLimit){
		this(name, creditLimit, "default email");
		
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
	
	

}

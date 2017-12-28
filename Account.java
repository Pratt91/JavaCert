
public class Account {

	private long acctNum;
	private double balance;
	private String custName;
	private String email;
	private long phNum;
	
	public Account(long acctNum, double balance, String custName, String email, long phNum) {
		this.acctNum = acctNum;
		this.balance = balance;
		this.custName = custName;
		this.email = email;
		this.phNum = phNum;
		
		System.out.println("Creating new account for " + this.custName);
	}
	public void deposit(double depositAmt){
		this.balance += depositAmt;
		System.out.println("New Balance: " + this.balance);

	}
	
	public void withdraw(double withdrawAmt){
		if(balance >= withdrawAmt){
			double newBal = balance - withdrawAmt;
			balance -= withdrawAmt;
			System.out.println("New Balance " + newBal);
		}else {
			System.out.println("Insufficient Funds");
			System.out.println("Current Balance: " + this.balance);
		}
	}
	
	public void setAcctNum(long acctNum){
		System.out.println(acctNum);
		this.acctNum = acctNum;
	}
	public long getAcctNum(){
		System.out.println(this.acctNum);
		return this.acctNum;
	}
	public void setBalance(double balance){
		System.out.println(balance);
		this.balance = balance;
	}
	public double getBalance(){
		System.out.println(balance);
		return this.balance;
	}
	public void setCustName(String custName){
		System.out.println(custName);
		this.custName = custName;
	}
	public String getCustName(){
		System.out.println(custName);
		return this.custName;
	}
	public void setEmail(String email){
		System.out.println(email);
		this.email = email;
	}
	public String getEmail(){
		System.out.println(email);
		return this.email;
	}
	public void setPhNum(long phNum){
		System.out.println(phNum);
		this.phNum = phNum;
	}
	public long getPhNum(){
		System.out.println(phNum);
		return this.phNum;
	}

}

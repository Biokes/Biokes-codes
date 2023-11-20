public class Account{
	private String name;
	private double balance ;
	public Account(String name, double balance){
	this.name = name ;
	this.balance = balance;
	}
	public void setName(String name){
	this.name = name;
	}
	public void setBalance(double balance){
	this.balance = balance;
	}
	public void setDeposit(double depositAmount){
		this.balance += depositAmount ;
		}
	public double getDeposit(){
	return balance;
	}
	public void setWithdrawal(double withdrawAmount){
	if( withdrawAmount > balance ){
		System.out.print("withdraw amount exceeded account balance");
		}
	else{
		this.balance -= withdrawAmount;
	}
	}
	public double getWithdrawal(){
	return balance;
	}

	public String getName(){
		return name;
		}
	public double getBalance(){
		return balance;
		}

}
public class Account1{
	private int id;
	private double balance ;
	private double annualInterestRate;
	private String dateCreated;
public Account1 (){;
}
public Account1(int id, double balance){
this.id = id ;
this.balance = balance ;
}
public void setId(int id){
this.id = id;
}
public void setBalance(double balance){
this.balance = balance ;
}
public void setAnnualInterestRate(double annualInterestRate){
this.annualInterestRate = annualInterestRate;
}
public void setDateCreated(String dateCreated){
this.dateCreated = dateCreated;
}
public void setMonthlyInterestRate(double annualInterestRate){
double monthlyInterestRate = annualInterestRate/(100*12);
}
public int getId(){
return id;
}
public double getBalance(int id){
return balance;
}	
public double getAnnualInterestRate(){
return annualInterestRate;
}
public String getDateCreated(){
return dateCreated;
}
double interestRate = annualInterestRate/100;
public double getMonthlyInterestRate(){
return monthlyInterestRate;
}
public void setMonthlyInterest(double monthlyInterestRate){
double monthlyInterest= monthlyInterestRate  * balance;
this.monthlyInterest= monthlyInterest;
}
public double getMonthlyInterestRate(){
return monthlyInterestRate;
}
public double getMonthlyInterest(){
double monthlyInterest = monthlyInterestRate * balance;
return monthlyInterest;
}
public void setWithdraw(double withdrawalAmount){
this.balance-= withdrawalAmount;
}
public double getWithdraw(){
return balance;
}
public void setWithdraw(int depositAmount){
this.balance+= depositAmount;
}
public double getDeposit(){
return balance;
}
}

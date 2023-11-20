public class Customer{
	private String firstName;
	private String lastName;
	private String walletID;
	private String phoneNumber;
	private int age;
	private double balance = 0.0;
	
public Customer(String firstName, String lastName, String walletID,String phoneNumber,int age,double balance){
this.firstName =firstName;
this.lastName= lastName;
this.walletID = walletID;
this.phoneNumber = phoneNumber;
this.age = age;
this.balance =  balance;
}
public void setName(String firstName){
this.firstName = firstName;
}
public void setLastName(String lastName){
this.lastName= lastName;
}
public void setWalletID(String walletID){
this.walletID = walletID;
}
public void setPhoneNumber(String phoneNumber){
this.phoneNumber = phoneNumber;
}
public String getFirstName(){
return firstName;
}
public void setAge(int age){
this.age = age;
}
public void setBalance(double balance){
this.balance += balance;
}
public String getLastName(){
return lastName;
}
public String getWalletID(){
return walletID;
}
public String getPhoneNumber(){
return phoneNumber;
}
public int getAge(){
return age;
}
public double getBalance(){
return balance;
}
}

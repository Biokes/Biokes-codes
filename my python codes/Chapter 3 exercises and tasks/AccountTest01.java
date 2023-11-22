ip;mport java.util.Scanner;
public class AccountTest01{
	public static void main(String [] args){
 	Scanner input = new Scanner(System.in); 
	Account1 accTest= new Account1();
	System.out.print("Welcome to MAVERICKS BANKS.\n please enter your id: ");
	int id1 = input.nextInt();
	accTest.setId(id1);

	System.out.print("Please enter your initial balance: ");
	double initial = input.nextDouble();
	accTest.setBalance(initial);
	
	System.out.print("Please enter annual interest Rate: ");
	double rate = input.nextDouble();
	accTest. setAnnualInterestRate(rate);

	System.out.print("Please enter date created eg 31/12/2005: ");
	String date = input.next();
	accTest.setDateCreated(date);

	System.out.print("would you like to withdraw?\n press yes or no: ");
	String option = input.next();

	if(option.equals("yes")){
	System.out.print("Please enter withdraw amount: ");
	double withdraw = input.nextDouble();
	accTest.setWithdrawal(withdraw);
	System.out.printf("your new balance is %.2f.%n",accTest.getBalance());
	System.out.print("Thanks for banking with us.");
	System.out.print("would you like to deposit: ");
	String option1= input.next();
		if(option1.equals("yes")){
	System.out.println("Please enter deposit amount: ");
	double deposit = input.nextDouble();
	accTest. setDeposit(deposit);
	System.out.printf("your new balance is %.2f",accTest.getBalance());
	System.out.printf("your monthly interest rate is %.2f%n",accTest.getMonthlyInterestRate());
}
	if(option1.equals("no")){
	System.out.print("Thanks for banking with us.");
}

}

	if(option.equals("no")){
	System.out.print("would you like to deposit: ");
	String option1= input.next();
		if(option1.equals("yes")){
	System.out.println("Please enter deposit amount: ");
	double deposit = input.nextDouble();
	accTest. setDeposit(deposit);
	System.out.printf("your new balance is %.2f",accTest.getBalance());
	System.out.printf("your monthly interest  is %.2f%n",accTest.getMonthlyInterestRate());
}
	if(option1.equals("no")){
	System.out.printf("your new balance is %.2f",accTest.getBalance());

	System.out.print("Thanks for banking with us.");
}
}

}
}

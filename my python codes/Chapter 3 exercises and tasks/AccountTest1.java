import java.util.Scanner;
public class AccountTest1{
	public static void main(String[] args ){
	Account account1 = new Account("Abbey", 50.0);
	account1.setName("Abbey");
	account1.setBalance(50.0);

System.out.printf("%s is your account name.\nAccount balance is %s.\n",account1.getName(),account1.getBalance());
	
Scanner input = new Scanner(System.in);

System.out.println("please enter the amount you want to deposit: ");
double deposit1 = input.nextDouble();

account1.setDeposit(deposit1);
System.out.printf("Accoount name : %s\n Account Balance : %.2f.\n",account1.getName(),account1.getDeposit());

System.out.print("please enter the amount you want to withdraw: ");
double withdraw = input.nextDouble();
account1.setWithdrawal(withdraw);

System.out.printf("withdrawal Successful.\n your new balance is %.2f.\n Thank you for banking with us",account1.getWithdrawal());


}
}
import java .util.Scanner;
public class CustomerTest{
public static void main(String[] args){
	Customer matthew = new Customer("ade", " ola"," adeola12" ,"071664" , 20);
	Customer nini = new Customer("bola" , "biana" , "bolabaina12" , "023902" , 25);
	System.out.printf("%s is  the Customer's id and your password is %s%n ", matthew.getwalletId(),matthew.getphoneNumber());
	System.out.printf("%s is  the Customer's id and your password is %s ", nini.getwalletId(),nini.getphoneNumber());
	Scanner input = new Scanner(System.in);
	 System.out.println("please enter second number; ");
	

}
}
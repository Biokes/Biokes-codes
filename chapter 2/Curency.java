import java.util.Scanner;
public class Curency{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("enter the conversion rate");
double exchangeRate = input.nextDouble();
System.out.print("what exchange rate do  you want ?\n from dollars to chinese RMB press 0\n for chinese RMB to dollars press 1: ");
int conversion = input.nextInt();
if(conversion == 0){
System.out.print("enter the dollar amount  you want to exchange: ");
double price =  input.nextDouble();
double result = (price *exchangeRate);
System.out.printf("$%s is %.2f yuan ",price ,result);
}
if(conversion == 1){
System.out.print("enter the yuan  amount you want to exchange: ");
double price =  input.nextDouble();
double result = (price /exchangeRate);
System.out.printf("%s yuan is $%.2f ",price ,result);
}

}
}
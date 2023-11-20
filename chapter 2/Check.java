import java.util.Scanner;
public class Check{
public static void main(String[] args){
Scanner user = new Scanner(System.in);
System.out.println("please enter the first number:");
int number1 = user.nextInt();
System.out.println("please enter the second number:");
int number2 = user.nextInt();
int number1x = (number1 * 3);
int number2x = (number2 * 2);
int remainder = (number2x % number1x);
int result = (number2x / number1x);
if( remainder > 0){
System.out.println(result);
} 
if (number2x % number1x != 0){
System.out.printf("%d tripled is not a multiple of doubled %d", number1 ,number2 );
}
}
}

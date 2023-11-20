import java.util.Scanner;
public class Arithmetic{
public static void main(String[] args){
 Scanner user = new Scanner(System.in);
 System.out.println("please enter  first number;");
 int num1 =user.nextInt();
 System.out.println("please enter second number; ");
 int num2 =user.nextInt();
 int number1 = (num1 *num1);
System.out.println("The square of " + num1 + " is " + number1);
int number2 = (num2 * num2);
System.out.println("The square of " + num2 + " is " + number2);
int sum = (number1 + number2);
System.out.println("The sum of square of the first integer and second integer is  " + sum);
int difference = (number1 - number2);
System.out.println("The difference of the square of the first integer and second integer is  " + difference);

  }
}
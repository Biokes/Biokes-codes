import java.util.Scanner;
public class LargestAndLowest{
public static void main(String[] args){
Scanner user = new Scanner(System.in);
int max = 0;
int min = 0;
System.out.println("please enter the five numbers:");
int number1 = user.nextInt();
int number2 = user.nextInt();
int number3 = user.nextInt();
int number4 = user.nextInt();
int number5 = user.nextInt();
min = number1;
if(number1 > max ){max = number1;}
if(number1 >min ){min = number1;}
if(number2 > max ){max = number2;}
if(number2 < min ){min = number2;}
if(number3 > max ){max = number3;}
if(number5 < min ){min = number3;}
if(number4 > max ){max = number4;}
if(number4 < min ){min = number4;}
if(number5 > max ){max = number5;}
if(number5 < min ){min = number5;s}
System.out.printf("%d is the highest number ,And the lowest number is %d",max, min);
}
}
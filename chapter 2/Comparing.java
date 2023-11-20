import java.util.Scanner;
public class Comparing{
public static void main(String[] args){
 Scanner user = new Scanner(System.in);
 System.out.println("please enter number:");
int num = user.nextInt();
int number= (num * num);
if(number > 100){
System.out.printf("%d > %d%n" ,number ,100);
}
if(num > 100){
System.out.printf("%d > %d%n" ,num ,100);
 }
if(number < 100){
System.out.printf("%d < %d%n" ,number ,100);
}
if(num < 100){
System.out.printf("%d < %d%n" ,number ,100);
}
if(number == 100){
System.out.printf("%d == %d%n" ,number ,100);
}
if(num == 100){
System.out.printf("%d == %d%n" ,number ,100);
}
}
}
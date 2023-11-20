 import java.util.Scanner;
public class App{
public static void main (String [] args){
Scanner input = new Scanner(System.in);
System.out.print("please Enter number:");
int day = input.nextInt();
if (day == 0 ){
System.out.println("1");
}
if (day == 1){
System.out.println("0");
}
if(day < 0){
System.out.print("invalid input,pls try again");
}
if(day > 1){
System.out.print("invalid input,pls try again");
}

}
}
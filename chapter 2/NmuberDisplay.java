import java.util.Scanner;
public class NmuberDisplay{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please Enter a number between 0 and 10: ");
int number = scanner.nextInt();
while(true){
if(number >10 || number < 0){
System.out.print("enter a number between 0 and 10\n");
number = scanner.nextInt();}
if(number == 0){System.out.print("zero");}
if(number == 1){System.out.print("one");}
if(number == 2){System.out.print("two");}
if(number == 3){System.out.print("three");}
if(number == 4){System.out.print("four");}
if(number == 5){System.out.print("five");}
if(number == 6){System.out.print("six");}
if(number == 7){System.out.print("Seven");}
if(number == 8){System.out.print("eight");}
if(number == 9){System.out.print("Nine");}
if(number == 10){System.out.print("Ten");}
break;
}
}
}
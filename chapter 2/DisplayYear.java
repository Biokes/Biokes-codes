import java.util.Scanner;
public class DisplayYear{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.print("please enter a number of the month you want: ");
int num = scanner.nextInt();
if(num == 1){System.out.print("January");}
if(num == 2){System.out.print("Feburary");}
if(num == 3){System.out.print("March");}
if(num == 4){System.out.print("April");}
if(num == 5){System.out.print("May");}
if(num == 6){System.out.print("june");}
if(num == 7){System.out.print("July");}
if(num == 8){System.out.print("August");}
if(num == 9){System.out.print("September");}
if(num == 10){System.out.print("October");}
if(num == 11){System.out.print("November");}
if(num == 12){System.out.print("December");}
if(num > 12){System.out.print("pls enter a number between 1 and 12");}
for (num = 12; num >=1; num--){
System.out.println(num);
}
}
}

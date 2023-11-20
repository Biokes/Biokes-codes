import java.util.Scanner;
public class Division26{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter a number");
	int digit = input.nextInt();
	int digit1 = (digit%5);
	int digit2 =(digit%6);
	System.out.printf(" is %d divisible by 5 ",digit);
	if (digit1 != 0 ){System.out.printf("false\n");}
	if (digit1 == 0 ){System.out.printf("true\n");}
	System.out.printf(" is %d divisible by 5  or 6 ?",digit);
	if (digit1 != 0  || digit2  != 0){System.out.printf("true\n");}
	else{System.out.print("false");}
	System.out.printf(" is %d divisible by 5 or 6, but not both ?",digit);
	if (digit1 != 0  || digit2  != 0){System.out.printf("true\n");}
	else{System.out.print("false");}
	
   }

}
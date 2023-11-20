import java.util.Scanner;
public class Division16{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter a number ");
	int digit = input.nextInt();
	int digit1 = (digit%5);
	int digit2 =(digit%6);
	System.out.printf("is %d divisible by 5 and 6?  ",digit);
	if (digit1 == 0 && digit2 == 0){
	System.out.print("True\n");
	}else{System.out.print("false\n");}
	System.out.printf("is %d divisible by 5 or 6?  ",digit);
	if (digit1 == 0 || digit2 == 0){
	System.out.print("True\n");
	}else{System.out.print("false\n");}
	System.out.printf("is %d divisible by 5 or 6, but not boths?",digit);
	if (digit1 == 0 || digit2 == 0){
	System.out.print("True\n");
	}else{System.out.print("false\n");}
	
   }

}
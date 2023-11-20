import java.util.Scanner;
public class Division{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter a number");
	int Digit = input.nextInt();
	if (Digit % 3 == 0){
	System.out.print("it is divisible by 3");
	}
	if (Digit % 3 > 0){
	System.out.print("it is not divisible by 3");
	}

   }

}
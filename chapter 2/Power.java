import java.lang.Math;
import java.util.Scanner;
public class Power{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("pls enter a number:");
	int integer1 = input.nextInt();
	double result = Math.pow(integer1 ,integer1);
	System.out.println(result);


}
}
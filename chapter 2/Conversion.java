import java.util.Scanner;
public class Conversion{
	public static void main (String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("please enter initial temperature:");
	double integer1 = input.nextInt();
	System.out.print("please enter final temperature:");
	double integer2 = input.nextInt();
	if (integer1 <  integer2){
	System.out.print("final temperature should be greater than initial temperature");
	}
	System.out.print("please enter water quantity:");
	double water = input.nextInt();
	double  result = (water * (integer2 - integer1 )* 4184);
	System.out.println("Energy needed to boil your water is " + result);
	


    }
}
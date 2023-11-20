import java.util.Scanner;
public class YearsDisplay{
	public static void main (String[] args){
	  Scanner number = new Scanner(System.in);
	 System.out.println("please enter number of minutes:");
	int userInput = number.nextInt();
	if(userInput < 1){
	System.out.println("please retry");
	}
	int weekday = (userInput / 1440);
	int days = (weekday % 365);
	int years = (weekday / 365 );
	System.out.println("you have " + years + " Years" + ", " + days + " days" );


	}
}
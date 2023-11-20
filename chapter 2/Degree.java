import java.util.Scanner;
public class Degree{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("enter a degree in celsius");
	double cel = input.nextFloat() ;
	double far = (9/5) * cel + 32;
	System.out.printf("%.3f celsius is %.3f Fahrenheit", cel,far);
	}
}
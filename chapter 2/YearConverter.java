import java.util.Scanner;
public class YearConverter{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
System.out.print("enter a year in number: ");
int year = scanner.nextInt();
int days = (year * 365);
System.out.printf("%d years is %d days",year,days);
}
}


import java.util.Scanner;
public class YearAndDay{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("please enter a Year in number and a month in number:");
	int year= input.nextInt();
	int month =  input.nextInt();
	int leapyear =  (year%4);
	if (leapyear == 0 && month == 1){System.out.printf("january %d has 31 days",year);}
	if (leapyear != 0 && month == 1){System.out.printf(" %d january has 31 days31", year);}
	if (leapyear == 0 &&  month == 2) {System.out.printf("%d Feburary has 29 days",year);}
	if (leapyear != 0 && month == 2) {System.out.printf("%d Feburary has 28 days",year);}
	if (leapyear == 0 &&  month == 3){System.out.printf("%d march has 31days",year);}
	if (leapyear != 0 && month == 3){System.out.printf("%d march has 31 days",year);}
	if (leapyear == 0 &&  month == 4){System.out.printf("%d April has 30days",year);}
	if (leapyear != 0 && month == 4){System.out.printf("%d April has 30days",year);}
	if (leapyear == 0 &&  month == 5){System.out.printf("%d may has 31days",year);}
	if (leapyear != 0 && month == 5){System.out.printf("%d may has 31 days",year);}
	if (leapyear == 0 &&  month == 6){System.out.printf("%d june has 30days",year);}
	if (leapyear != 0 && month == 6){ System.out.printf("%d june has 30 days",year);}
	if (leapyear == 0 &&  month == 7){System.out.printf("%d july has 31days",year);}
	if (leapyear != 0 && month == 7){System.out.printf("%d july  has 31 days",year);}
	if (leapyear == 0 &&  month == 8){System.out.printf("%d August has 31days",year);}
	if (leapyear != 0 && month == 8){System.out.printf("%d August has 31 days",year);}
	if (leapyear == 0 &&  month == 9){System.out.printf("%d September has 30days",year);}
	if (leapyear != 0 && month == 9){ System.out.printf("%d September  has 30days",year);}
	if (leapyear == 0 &&  month == 10){System.out.printf("%d October has 31days",year);}
	if (leapyear != 0 && month == 10){System.out.printf("%d October has 31 days",year);}
	if (leapyear == 0 &&  month == 11){System.out.printf("%d November has 30days",year);}
	if (leapyear != 0 && month == 11){System.out.printf("%d November has 30days",year);}
	if (leapyear == 0 &&  month == 12){System.out.printf("%d December has 31days",year);}
	if (leapyear != 0 && month == 12){System.out.printf("%d December has 31 days",year);}
   
   }

}
import java.util.Scanner;
public class WeekDay{
	public static void main(String[] args ){
	Scanner input = new Scanner(System.in);

System.out.print("Enter year: ");
int year = input.nextInt();
int century = (year/100);
int centuryRemainder = (year%100);
int century1 = (year-1)/100;
int centuryRemainder1 = (year-1)%100;
System.out.print("Enter month number i.e 1-12: ");
int month = input.nextInt();
int month1 = 0;
if (month == 1){month1 = 13;}
if (month == 2){month1 = 14;}
System.out.print("Enter day of the month: ");
int day = input.nextInt();
if (month < 3 ){
int workings = day + 26*(month1 + 1)/10 + centuryRemainder1 + century1/4 +centuryRemainder1/4 + 5*century1;
int result = workings % 7;
if (result == 0){System.out.print("day of the week is saturday");}
if (result == 1){System.out.print("day of the week is Sunday");}
if (result == 2){System.out.print("day of the week is Monday");}
if (result == 3){System.out.print("day of the week is Tuesday");}
if (result == 4){System.out.print("day of the week is Wednesday");}
if (result == 5){System.out.print("day of the week is Thursday");}
if (result == 6){System.out.print("day of the week is Friday");}
}
if (month >2 && month <= 12){
int workings = day + 26*(month +1)/10 + centuryRemainder + century/4 +centuryRemainder/4 + 5*century;
int result = workings % 7;
if (result == 0){System.out.print("day of the week is saturday");}
if (result == 1){System.out.print("day of the week is Sunday");}
if (result == 2){System.out.print("day of the week is Monday");}
if (result == 3){System.out.print("day of the week is Tuesday");}
if (result == 4){System.out.print("day of the week is Wednesday");}
if (result == 5){System.out.print("day of the week is Thursday");}
if (result == 6){System.out.print("day of the week is Friday");
}
}
}
}
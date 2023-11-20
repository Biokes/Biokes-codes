import java.util.Scanner;
public class YearsCalculator{
public static void main(String[] args){
 Scanner screw = new Scanner(System.in);
 System.out.print("please enter input in minutes: ");
 int can =screw.nextInt();
 int days = can / 1440;
 int years = days / 365;
 System.out.println(can + "minutes is approximately " + years +"years, " + days +"Days");


  }
}
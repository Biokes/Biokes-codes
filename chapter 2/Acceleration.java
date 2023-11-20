 import java.util.Scanner;
public class Acceleration{
public static void main(String [] args){
Scanner convert = new Scanner(System.in);
System.out.print("please Enter starting velocity, ending velocity, duration in minutes");
double start = convert.nextDouble();
double end = convert.nextDouble();
double time= convert.nextDouble();
double average = (end - start)/ time;
System.out.printf("The average acceleration is %f", average);

}
}

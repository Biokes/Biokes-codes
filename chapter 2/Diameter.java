import java.util.Scanner;
public class Diameter{
public static void main(String [] args){
Scanner scanner = new Scanner(System.in);
System.out.println("please Enter redius: ");
double radius = scanner.nextDouble();
System.out.printf("The diameter is %f,%nThe circumference is %f,%n The Area of the circle is %f",(2*radius),(2*radius*3.14159),(radius*radius*3.14159));


}
}

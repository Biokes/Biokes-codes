import java.util.Scanner;
public class Ask{
public static void main (String[] args){
Scanner collect = new Scanner(System.in);
System.out.println("name:");
String name = collect.next();
System.out.println("age:");
int age = collect.nextInt();
System.out.println("gender:");
String gender = collect.next();
System.out.println("===========");
System.out.println(name );
System.out.println("===========");
System.out.println( age);
System.out.println("===========");
System.out.println(gender );
System.out.println("===========");


}
}
import java.util.Scanner;
public class Sail{
public static void main (String[] args){
Scanner collect = new Scanner(System.in);
System.out.println("name:");
String name= collect.next();
System.out.println("age:");
String age = collect.next();
System.out.println("Gender:");
String gender = collect.next();
System.out.println("===========");
System.out.println("name: "+ name );
System.out.println("===========");
System.out.println("age: "+ age );
System.out.println("===========");
System.out.println("gender: "+ gender );
System.out.println("===========");
}
}
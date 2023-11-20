import java.util.Scanner;
public class NonDecreasingOrder{
public static void main(String[] args){
 Scanner user = new Scanner(System.in);
 int max = 0 ;
int min = 0;
 System.out.println("please enter  first number: ");
 int num1 =user.nextInt();
 max= num1 ;
 min = num1 ;
 System.out.println("please enter second number: ");
 int num2 =user.nextInt();
 if (num2 < min){min = num2;}
 if (num2 > max){max = num2;}
 System.out.println("please enter third number: ");
 int num3 =user.nextInt();
 if (num3 < min){min = num3;}
 if (num3 > max){max = num3;}
 int medium = (num1 + num2 + num3)- (max+min);
 System.out.printf("the non-decreasing order of yours are %d,%d,%d",min,medium,max);
}
}
import java.util.Scanner;
public class TrianglePerimeter{
	public static void main(String[] args ){
	Scanner input = new Scanner(System.in);

System.out.print("Enter first edge: ");
int edge1 = input.nextInt();
System.out.print("Enter second edge: ");
int edge2 = input.nextInt();
System.out.print("Enter the third edge: ");
int edge3 = input.nextInt();
int edgeSum1 = (edge1 + edge2);
int edgeSum2 = (edge1 + edge3);
int edgeSum3 = (edge2 + edge3);
int perimeter = edge1 + edge2 + edge3 ;
if (edgeSum1 > edge3 && edgeSum2 > edge2 && edgeSum3 > edge1 ){ 
System.out.printf("perimeter values are valid.\n Perimeter value is %d", perimeter);
}else {System.out.print("perimeter values are invalid.Pls try again.");

}

}
}
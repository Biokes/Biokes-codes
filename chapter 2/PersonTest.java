import java.util.Scanner;
public class PersonTest{
	public static void main(String[] args){
		Person person1 = new Person();
		Scanner input = new Scanner(System.in);
		System.out.print("pls what do you want your name to be?");
	 	String lastName = input.nextLine();
		person1.setName(lastName);
		System.out.printf("please your name is %s and if you are willing to change your name please enter 1 and  0 to continue", person1.getName());
		int choice = input.nextInt();
		if (choice == 0){
		System.out.printf("your name  is now successfully created and  saved as %s",person1.getName());
}

		if (choice == 1){
		System.out.print("pls what do you want your name to be?");
		String newName = input.nextLine();
		person1.setName(newName);
		System.out.printf("your name  is now successfully saved as %s",person1.getName());
}
		
}
}
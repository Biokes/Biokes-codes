import java.util.Scanner;
public class Hearts{
	public static void main(String[] args ){
	Scanner input= new Scanner(System.in);
	HeartRates heart = new HeartRates("","",0,0,0);
	
	System.out.print("please what is your First Name : ");
	String name1 = input.next();heart.setFirstName(name1);
	System.out.print("please what is your Last Name: ");
	String name2 = input.next();
	heart.setLastName(name2);

	System.out.print("please what day of the month were you born: ");
	int day = input.nextInt();heart.setDOB(day);
	
	System.out.print("please what month of the year were you born (1 for  january,4 for april etc ): ");
	int month = input.nextInt();heart.setMOB(month);
	System.out.print("please what year were you born: ");
	int year = input.nextInt();heart.setYOB(year);
	
	System.out.printf("Welcome %s %s.\n",heart.getFirstName(),heart.getLastName());
	System.out.printf("you are born on %d\\%d\\%d.\n",heart.getMOB(),heart.getDOB(),heart.getYOB());
	System.out.printf("Your record with us Shows that you are %d years old.\n",heart.getAge());
	heart.setMaxHeartRate(year);
	System.out.printf("your maximum rate is %.2f.%n",heart.getMaxHeartRate());
	System.out.printf("your Heart rate range is %.2f to %.2f.%n",heart.getMinTargetHeartRate(),heart.getMaxTargetHeartRate());
}
}
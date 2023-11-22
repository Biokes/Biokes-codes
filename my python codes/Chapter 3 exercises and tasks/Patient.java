import java.util.Scanner;
public class Patient{
	public static void main(String[] args ){
	Scanner input= new Scanner(System.in);
	HealthProfile patient = new HealthProfile("","",0,0,0,"",0.0,0.0);
	
	System.out.print("please what is your First Name : ");
	String name1 = input.next();
	patient.setFirstName(name1);

	System.out.print("please what is your Last Name : ");
	String name2 = input.next();
	patient.setLastName(name2);

	System.out.print("please what day of the month were you born: ");
	int day = input.nextInt();
	patient.setDOB(day);

	System.out.print("please what month of the year were you born (1 for  january,4 for april etc ): ");
	int month = input.nextInt();
	patient.setMOB(month);

	System.out.print("please what year were you born: ");
	int year = input.nextInt();
	patient.setYOB(year);


	System.out.print("please what is your Gender?  ");
	String gender = input.next();
	patient.setGender(gender);

	System.out.print("please enter your height in inches: ");
	double height = input.nextDouble();
	patient.setHeight(height);

	System.out.print("please enter your weight in pounds: ");
	double weight = input.nextDouble();
	patient.setWeight(weight);

	System.out.printf("Welcome %s %s.\n",patient.getFirstname(),patient.getLastname());
	System.out.printf("you are born on %d\\%d\\%d.\n",patient.getMOB(),patient.getDOB(),patient.getYOB());
	System.out.printf("Your record with us Shows that you are %d years old.\n",patient.getAge());
	patient.setMaxHeartRate(year);
	System.out.printf("your maximum rate is %.2f.%n",patient.getMaxHeartRate());
	System.out.printf("your Heart rate range is %.2f to %.2f.%n",patient.getMinTargetHeartRate(),patient.getMaxTargetHeartRate());
	double bodyMass = (weight*703)/(height *height);
	if (bodyMass < 18.5){ 
	System.out.printf("Your BMI is %.1f , so you are underweight",bodyMass);}
	if (bodyMass >= 18.5 && bodyMass <= 24.9){
 	System.out.printf("Your BMI is %.1f , so you are normal weight",bodyMass);}
	if (bodyMass >= 25 && bodyMass <= 29.9){
 	System.out.printf("Your BMI is %.1f , so you are overweight",bodyMass);}
	if (bodyMass >= 30){
	System.out.printf("Your BMI is %.1f.\nOBESITY!!!",bodyMass);
	}

}
}
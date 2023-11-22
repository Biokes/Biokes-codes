public class SemicolonApplication{
	public static void main(String[] args ){

	Semicolon semicolon1 = new Semicolon(214,113);

	semicolon1.setNumberOfStudents(214);
	semicolon1.setNumberOfCohorts(113);
System.out.printf("the number of students is %d, and the number of cohorts is %d",semicolon1.getNumberOfStudents(),semicolon1.getNumberOfCohorts());
}
}

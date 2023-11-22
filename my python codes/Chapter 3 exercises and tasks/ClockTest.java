import java.util.Scanner;
public class ClockTest{
	public static void main(String[] args ){
	Clock clockTest = new Clock(12,11,54);

	clockTest.setHour(12);
	clockTest.setMinute(11);
	clockTest.setSecond(54);
	System.out.printf("%d is the hour.%d is the minutes,%d is the seconds",clockTest.getHour(),clockTest.getMinute(),clockTest.getSecond());

	clockTest.getHour();
	clockTest.getMinute();
	clockTest.getSecond();

	System.out.printf("The time is %s",clockTest.displayTime());
}
}
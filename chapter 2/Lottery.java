import java.util.Scanner;
public class Lottery{
public static void main(String [] args){
int threeDigit = (int)(Math.random() * 1000);
int threeDigit1 = (threeDigit/100);
int threeDigit2 = (threeDigit %100)/10;
int threeDigit3 =threeDigit%10;
Scanner input = new Scanner(System.in);
System.out.print("please enter your three digit number: ");
int guess = input.nextInt();
int guess1 = (guess/100);
int guess2 = (guess %100)/10;
int guess3 = guess%10;
System.out.printf("The Spin result is %d and you entered %d.\n",threeDigit,guess );
if(guess == threeDigit){
System.out.println("CONGRATULATIONS!!!\n You Won $10000.");}
if ((threeDigit1 == guess1 || threeDigit1 == guess2 || threeDigit1 == guess3) && (threeDigit2 == guess1 || threeDigit2 == guess2 || threeDigit2 == guess3) &&(threeDigit3 == guess1 || threeDigit3 == guess2 || threeDigit3 == guess3)){
System.out.print("you won $3000");
}
if ((threeDigit1 == guess1 || threeDigit1 == guess2 || threeDigit1 == guess3) || (threeDigit2 == guess1 || threeDigit2 == guess2 || threeDigit2 == guess3) || (threeDigit3 == guess1 || threeDigit3 == guess2 || threeDigit3 == guess3)){
System.out.print("CONGRATULATIONS!!!\n You Won $1000");}
else{System.out.println("Sorry, you lose.\nPlease try again later.");
}

}
}
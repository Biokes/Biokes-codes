import java.util.Scanner;
public class CoinFlip{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("please enter 0 for head and 1 for tail: ");
int digit = input.nextInt();
int guess = (int)(Math.random()*10);
if(guess <=5 ){guess = 0;
}else {guess=1;
}
if(digit == guess){
System.out.print("Your guess is correct");
}else{System.out.print("Your guess is not correct");
;
}
}
}
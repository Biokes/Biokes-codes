import java.util.Scanner;
public class Game{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("enter player one name: ");
String player1 = input.nextLine();
System.out.println("enter player two name: ");
String player2 = input.nextLine();
System.out.println(player1 +" enter a number from 0 to 2: ");
int player1num = input.nextInt();
System.out.println(player2 + " enter a number from 0 to 2: ");
int player2num = input.nextInt();
if(player1num == 0 && player2num == 0){System.out.printf("there is a draw");}
if(player1num == 0 && player2num == 1){System.out.printf("%s wins %s!!!",player2,player1);}
if(player1num == 0 && player2num == 2){System.out.printf("%s wins %s!!!",player1,player2);}
if(player1num == 1 && player2num == 0){System.out.printf("%s wins %s!!!",player1,player2);}
if(player1num == 1 && player2num == 1){System.out.printf("there is a draw");}
if(player1num == 1 && player2num == 2){System.out.printf("%s wins %s!!!",player2,player1);}
if(player1num == 2 && player2num == 0){System.out.printf("%s wins %s!!!",player2,player1);}
if(player1num == 2 && player2num == 1){System.out.printf("%s wins %s!!!",player1,player2);}
if(player1num == 2 && player2num == 2){System.out.printf("there is a draw");}

}
}
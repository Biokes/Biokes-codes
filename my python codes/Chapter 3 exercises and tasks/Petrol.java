import java.util.Scanner;
public class Petrol{
public static void main(String[] args){
PetrolPurchases petrol = new PetrolPurchases("yaba Fuels","Diesel",45, 500,15);
Scanner input = new Scanner(System.in);
System.out.printf("Welcome to %s Fuel Station.%n",petrol.getStationLocation());
System.out.printf("The only fuel available is %s.%n",petrol.getPetrol());
System.out.printf("Your net purchases with %.2f discount price and price/liter of $%.1f is %.2f.%n",petrol.getDiscount(),petrol.getLiterPrice(),petrol.getNetPurchasesAmount());
System.out.printf("so your Net purchases of %.1f Liters is $%.1f.",petrol.getQuantity(),petrol.getNetPurchasesAmount());




}
}